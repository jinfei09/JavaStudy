/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:MyThread
 * 创建人:arika    创建时间:2016-05-05
 */
package day0505;

/**
 * @author arika
 * @create 2016-05-05
 */
public class MyThread extends Thread{
    public void run(){
        System.out.println("MyTHread.run()");
    }

    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread1.start();
        myThread2.start();
    }
}
