/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:ThreadTest
 * 创建人:arika    创建时间:2016-05-06
 */
package day0506;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author arika
 * @create 2016-05-06
 */
public class ThreadTest {
    private int j;
    private Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        ThreadTest tt = new ThreadTest();
        for (int i = 0; i < 2; i++) {
            new Thread(tt.new Adder()).start();
            new Thread(tt.new Subtractor()).start();
        }
    }

    private class Subtractor implements Runnable {

        public void run() {
            while (true) {
                synchronized (ThreadTest.this) {
                    System.out.println("j--=" + j--);
                }
                lock.lock();
                try {
                    System.out.println("j--=" + j--);
                } finally {
                    lock.unlock();
                }

            }
        }
    }

    private class Adder implements Runnable {

        public void run() {
            synchronized (ThreadTest.this) {
                System.out.println("j++=" + j++);
            }
            lock.lock();
            try {
                System.out.println("j++=" + j++);
            } finally {
                lock.unlock();
            }
        }
    }
}
