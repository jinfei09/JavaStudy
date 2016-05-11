///**
// * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
// * 类名:MethodDemo1
// * 创建人:arika    创建时间:2016-05-11
// */
//package day0511;
//
//
//import java.lang.reflect.Method;
//
///**
// * @author arika
// * @create 2016-05-11
// */
//public class MethodDemo1 {
////    1.要获取一个方法就是获取类的信息， 获取类的信息首先要
//    A a1 = new A();
////    2.获取方法 名称和参数列表来决定
////    getMethod获取的是public的方法
////    getDelcaredMethod自己声明的方法
//    Class c = a1.getClass();
////    Method m = c.getMethod("print", new Class[] {int.class, int.class});
//    Method m = c.getMethod("print", int.class, int.class);
//
//}
//
//class A{
//    public void print(int a, int b){
//        System.out.println(a+b);
//    }
//    public void print(String a, String b){
//        System.out.println(a.toUpperCase() + "," + b.toLowerCase());
//    }
//}
