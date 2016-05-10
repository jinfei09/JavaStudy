/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:StringTest
 * 创建人:arika    创建时间:2016-05-05
 */
package day0505;

/**
 * @author arika
 * @create 2016-05-05
 */
public class StringTest {
    public static void main(String[] args) {
        final StringBuilder a = new StringBuilder("immutable");
        System.out.println(a);
//        a = new StringBuilder("");
        a.append(" broken!");
        System.out.println(a);

        String s1 = new String("foo");
        String s2 = new String("foo");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

    }
}
