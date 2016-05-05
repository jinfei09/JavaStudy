/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:ThreadDemo
 * 创建人:arika    创建时间:2016-05-03
 */
package day0503;

/**
 * @author arika
 * @create 2016-05-03
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Thread t = new Thread(){
            public void run(){
                pong();
            }
        };
        t.run();
        System.out.print("ping");
    }
    static void pong(){
        System.out.print("pong");
    }
}
