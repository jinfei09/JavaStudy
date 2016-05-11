/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:ClassDemo2
 * 创建人:arika    创建时间:2016-05-11
 */
package day0511;

/**
 * @author arika
 * @create 2016-05-11
 */
public class ClassDemo2 {
    public static void main(String[] args) {
        Class c1 = int.class;
        Class c2 = String.class;
        Class c3 = double.class;
        Class c4 = Double.class;
        Class c5 = void.class;

        System.out.println(c1.getName());
        System.out.println(c2.getName());
        System.out.println(c2.getSimpleName());
        System.out.println(c3.getName());
        System.out.println(c4.getName());
        System.out.println(c5.getName());
    }
}












