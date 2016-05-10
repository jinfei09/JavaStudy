/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:MyThreadTest
 * 创建人:arika    创建时间:2016-05-06
 */
package day0506;

/**
 * @author arika
 * @create 2016-05-06
 */
public class MyThreadTest {
    public static void main(String[] args) {
        new MyThreadTest().init();
    }

    private void init() {
        final Business business = new Business();

        new Thread(
                new Runnable() {
                    public void run() {
                        for (int i = 0; i < 50; i++) {
                            business.SubThread(i);
                        }
                    }
                }
        ).start();

        for (int i = 0; i < 50; i++) {
            business.MainThread(i);
        }
    }

    private class Business {
        boolean bShouldSub = true;

        public void SubThread(int i) {
            if (!bShouldSub) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (int j = 0; j < 10; j++) {
                System.out.println(Thread.currentThread().getName() + ":i=" +
                        i + ",j=" + j);
            }
            bShouldSub = false;
            this.notify();
        }

        public synchronized void MainThread(int i) {
            if (bShouldSub) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (int j = 0; j < 5; j++) {
                System.out.println(Thread.currentThread().getName() + ":i=" +
                        i + ",j=" + j);
            }
            bShouldSub = true;
            this.notify();
        }
    }
}
