/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:Something
 * 创建人:arika    创建时间:2016-05-10
 */
package day0510;

/**
 * @author arika
 * @create 2016-05-10
 */
public class Something {
    public static void main(String[] args) {
        Something s= new Something();
        System.out.println("s.doSomething() returns " + doSomething());
    }

    private static String doSomething() {
        return "Do something...";
    }
}
