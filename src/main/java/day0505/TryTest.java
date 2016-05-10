/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:TryTest
 * 创建人:arika    创建时间:2016-05-05
 */
package day0505;

import java.awt.geom.AffineTransform;

/**
 * @author arika
 * @create 2016-05-05
 */
public class TryTest {
    public static void main(String[] args) {
//        System.out.println(new day0503.TryTest().test());
    }
    static int test(){
        int x = 1;
        try{
            return x;
        } finally {
            ++x;
        }
    }
}
