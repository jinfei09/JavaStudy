/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:DataChange
 * 创建人:arika    创建时间:2016-05-05
 */
package day0505;

/**
 * 交换两个数
 *
 * @author arika
 * @create 2016-05-05
 */
public class DataChange {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int temp;
        System.out.println("利用中间变量进行交换");
        System.out.println("a和b交换前： a=" + a + "  b=" + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("a和b交换后: a=" + a + "  b=" + b);

        System.out.println("利用数值相加减进行交换");
        System.out.println("a和b交换前： a=" + a + "  b=" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a和b交换后: a=" + a + "  b=" + b);

        System.out.println("利用位移运算进行交换");
        System.out.println("a和b交换前： a=" + a + "  b=" + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a和b交换后: a=" + a + "  b=" + b);

    }
}
