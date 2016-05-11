/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:MethodDemo4
 * 创建人:arika    创建时间:2016-05-11
 */
package day0511;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Objects;

/**
 * @author arika
 * @create 2016-05-11
 */
public class MethodDemo4 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("hello");

        Class c1 = list.getClass();
        Class c2 = list1.getClass();

        System.out.println(c1 == c2);

        /**
         * c1 == c2 结果返回true说明编译之后集合的泛型是去泛型化得
         * Java 中集合的泛型， 是防止错误输入的， 只在编译阶段有效
         * 绕过编译就无效了
         * 验证： 我们可以通过方法的反射来操作， 绕过编译
         */

        try {
            Method m = c2.getMethod("add", Objects.class);
            m.invoke(list1, 20);
            System.out.println(list1.size());
            System.out.println(list1);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
