/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:SmallT
 * 创建人:arika    创建时间:2016-05-03
 */
package day0503;

/**
 * @author arika
 * @create 2016-05-03
 */
public class SmallT {
    public static void main(String[] args) {
        SmallT t = new SmallT();
        int b = t.get();
        System.out.println(b);
    }

    private int get() {
        try {
            return 1;
        } finally {
            return 2;
        }
    }
}
