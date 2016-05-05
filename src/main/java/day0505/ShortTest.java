/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:ShortTest
 * 创建人:arika    创建时间:2016-05-05
 */
package day0505;

/**
 * 对于 short s1 = 1; s1 = s1 + 1;由于 s1+1运算时会自动提升表达式的类型,所以结果是 int
 * 型,再赋值给 short 类型 s1时,编译器将报告需要强制转换类型的错误。
 * 对于 short s1 = 1; s1 += 1;由于 +=是 java 语言规定的运算符,java 编译器会对它进行特殊
 * 处理,因此可以正确编译。
 *
 * @author arika
 * @create 2016-05-05
 */
public class ShortTest {
    public static void main(String[] args) {
        short s1 =1;
//        s1 = s1 + 1;

    }
}
