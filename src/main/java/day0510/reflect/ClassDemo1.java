/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:ClassDemo1
 * 创建人:arika    创建时间:2016-05-10
 */
package day0510.reflect;

/**
 * @author arika
 * @create 2016-05-10
 */
public class ClassDemo1 {
    public static void main(String[] args) {
//        Foo的实例对象如何表示
        Foo foo1 = new Foo();
//        Foo这个类也是一个实例对象， Class类的实例对象如何表示
//        任何一个类都是Class的实例对象， 这个实例对象有三种表示方式

//        第一种表示方式
//        实际在告诉我们任何一个类都有一个隐含的静态成员变量class
        Class c1 = Foo.class;

//        第二种表示方式
        Class c2 = foo1.getClass();

//        官网c1, c2表示了Foo类的类类型(class type)
//        万事万物皆对象
//        类也是对象， 是Class类的实例对象
//        这个对象我们称为该类的类类型
        System.out.println(c1 == c2);

//        第三种表达方式
        Class c3 = null;
        try {
            c3 = Class.forName("day0510.reflect");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(c2 == c3);
//        可以通过类的类型创建该类的对象实例

        try {
            Foo foo = (Foo) c1.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

class Foo {
    void print(){

    }

}

