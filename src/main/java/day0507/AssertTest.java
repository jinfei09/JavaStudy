/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:AssertTest
 * 创建人:arika    创建时间:2016-05-07
 */
package day0507;

/**
 * @author arika
 * @create 2016-05-07
 */
public class AssertTest {
    public static void main(String[] args) {
        int i = 0;
        for (i = 0; i < 5; i++) {
            System.out.println(i);
        }
        --i;
        assert i == 5;
    }
}
