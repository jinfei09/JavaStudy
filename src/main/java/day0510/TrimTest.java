/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:TrimTest
 * 创建人:arika    创建时间:2016-05-10
 */
package day0510;

/**
 * @author arika
 * @create 2016-05-10
 */
public class TrimTest {
    public static void main(String[] args) throws Exception {
        String str = "我a爱中华abc我爱传智def";
        String str2 = "我ABC汉";
        System.out.println(str);
        int num = trimGBK(str.getBytes("GBK"), 5);
        System.out.println(str.substring(0, num));
    }

    private static int trimGBK(byte[] buf, int n) {
        int num = 0;
        boolean bChineseFirstHalf = false;
        for (int i = 0; i < n; i++) {
            if (buf[i] < 0 && !bChineseFirstHalf) {
                bChineseFirstHalf = true;
            } else {
                num++;
                bChineseFirstHalf = false;
            }
        }
        return num;
    }
}
