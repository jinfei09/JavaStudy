/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:SwapFunction
 * 创建人:arika    创建时间:2016-05-05
 */
package day0505;

/**
 * @author arika
 * @create 2016-05-05
 */
public class SwapFunction {
    public static void main(String[] args) {
        int x = 1, y = 5;
        SwapFunction s = new SwapFunction();
        System.out.println("交换前");
        System.out.println(x);
        System.out.println(y);

        s.swapInt(x, y);
        System.out.println("交换后");
        System.out.println(x);
        System.out.println(y);

    }

    public static void swapInt(int x, int y) {
        int temp;
        temp = x;
        x = y;
        y = temp;
    }
}
