/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:ThreadTest1
 * 创建人:arika    创建时间:2016-05-03
 */
package day0503;

import java.util.List;

/**
 * @author arika
 * @create 2016-05-03
 */
public class ThreadTest1 {
    private int j;

    public static void main(String[] args) {
        ThreadTest1 tt =new ThreadTest1();
        System.out.println(Math.round(11.5));
        System.out.println(Math.round(-11.5));

    }

//    private synchronized void inc{
//        j++;
//        System.out.println(Thread.currentThread().getName()+ inc() + j);
//    }
}
