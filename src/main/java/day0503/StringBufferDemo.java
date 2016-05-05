/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:StringBufferDemo
 * 创建人:arika    创建时间:2016-05-03
 */
package day0503;

/**
 * @author arika
 * @create 2016-05-03
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer strBuffer = new StringBuffer();
        strBuffer.append("Hello");
        System.out.println("length: " + strBuffer.length() + " data: " +
                strBuffer);

        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("123456");
        System.out.println("length: " + strBuilder.length() + " data: " +
                strBuilder);
        System.out.println(strBuilder.capacity());

        int myInt = 25;
        StringBuilder myStrBuilder = new StringBuilder("You total is ");
        myStrBuilder.insert(2, "buttiful");
        System.out.println(myStrBuilder);
    }
}
