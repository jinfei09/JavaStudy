/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:CountChar
 * 创建人:arika    创建时间:2016-05-10
 */
package day0510;

/**
 * @author arika
 * @create 2016-05-10
 */
public class CountChar {
    public static void main(String[] args) {
        String str = " xxxAAA DDD 3232xxxxxvvd!";
        int englishCount = 0;
        int chineseCount = 0;
        int digitCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                digitCount++;
            } else {
                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                    englishCount++;
                } else {
                    chineseCount++;
                }
            }
        }
    }
}
