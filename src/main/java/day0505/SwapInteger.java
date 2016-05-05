/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:SwapInteger
 * 创建人:arika    创建时间:2016-05-05
 */
package day0505;

/**
 * @author arika
 * @create 2016-05-05
 */
public class SwapInteger {
    public static void main(String[] args) {
        int [] a = new int[2];
        a[0] = 3;
        a[1] = 4;
        swap(a);
        System.out.println(a[0] + " " + a[1]);
    }

    public static void swap(int a[]) {
        int t;
        t = a[0];
        a[0] = a[1];
        a[1] = t;
    }
}
