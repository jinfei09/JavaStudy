/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:IntDemo
 * 创建人:arika    创建时间:2016-05-03
 */
package day0503;

/**
 * @author arika
 * @create 2016-05-03
 */
public class IntDemo {
    private int value;

    void setValue(Integer value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        IntDemo intDemo= new IntDemo();
        intDemo.setValue(1234567890);
        System.out.println(intDemo.getValue());
    }
}
