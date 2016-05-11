/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:ClassUtil
 * 创建人:arika    创建时间:2016-05-10
 */
package day0510.reflect;

/**
 * @author arika
 * @create 2016-05-10
 */
public class ClassUtil {
    /**
     * 打印类的信息， 包括类的成员函数， 成员变量
     *
     * @param obj 该对象所属类的信息
     */

    public static void printClassMessage(Object obj) {
//        要获取类的信息  首先要获取类的类型
        Class c = obj.getClass(); //传递的是哪个子类的对象

        System.out.println("类的名称是： " + c.getName());
    }
}
