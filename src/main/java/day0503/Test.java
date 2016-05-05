/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:Test
 * 创建人:arika    创建时间:2016-05-03
 */
package day0503;

/**
 * @author arika
 * @create 2016-05-03
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(new Test().test());
    }

    int test(){
        try{
            return func1();
        } finally {
            return func2();
        }
    }

    private int func2() {
        System.out.println("func2");
        return 2;
    }

    private int func1() {
        System.out.println("func1");
        return 1;
    }
}
