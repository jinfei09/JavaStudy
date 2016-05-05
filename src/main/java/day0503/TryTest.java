/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:TryTest
 * 创建人:arika    创建时间:2016-05-03
 */
package day0503;

/**
 * @author arika
 * @create 2016-05-03
 */
public class TryTest {
    public static void main(String[] args) {
        System.out.println(new TryTest().test());
    }

    static int test() {
        int x = 1;
        try {
            return x;
        } finally {
            ++x;
        }
    }
}
