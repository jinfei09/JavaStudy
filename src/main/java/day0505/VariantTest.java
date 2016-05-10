/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:VariantTest
 * 创建人:arika    创建时间:2016-05-05
 */
package day0505;

/**
 * @author arika
 * @create 2016-05-05
 */
public class VariantTest {
    public static int staticVar = 0;
    public int instanceVar = 0;

    public VariantTest() {
        staticVar++;
        instanceVar++;
        System.out.println("staticVar=" + staticVar + ", instanceVar=" +
                instanceVar);
    }

    public static void main(String[] args) {
        VariantTest vTest = new VariantTest();
        VariantTest vTest2 = new VariantTest();

    }
}
