/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:MultiThread
 * 创建人:arika    创建时间:2016-05-06
 */
package day0506;

/**
 * @author arika
 * @create 2016-05-06
 */
public class MultiThread {
    public static void main(String[] args) {
        new Thread(new Thread1()).start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(new Thread2()).start();
    }

    private static class Thread1 implements Runnable {
        public void run() {
            synchronized (MultiThread.class){
                System.out.println("enterthread1....");
                System.out.println("thread1is waiting");

                try {
                    MultiThread.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("thread1 is going on...");
                System.out.println("thread1 is being over!");
            }
        }
    }

    private static class Thread2 implements Runnable {
        public void run() {
            synchronized(MultiThread.class){
                System.out.println("enter thread2 ...");
                System.out.println("thread2 notify over thread can release wait status");
                MultiThread.class.notify();

                System.out.println("thread2 is sleeping tenmillisecond...");

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("thread2 is going on...");
                System.out.println("thread2 being over!");
            }
        }
    }
}
