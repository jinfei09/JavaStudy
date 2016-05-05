/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:TestReplace
 * 创建人:arika    创建时间:2016-05-05
 */
package day0505;

/**
 * @author arika
 * @create 2016-05-05
 */
public class TestReplace {
    public static void main(String[] args) {
        Replace replace = new Replace(3, 5);
        System.out.println(replace.toString());
        replace.replace();
        System.out.println(replace.toString());

    }

    private static class Replace {
        private int x;
        private int y;

        public Replace(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void replace() {
            int temp = x;
            x = y;
            y = temp;
        }

        @Override
        public String toString() {
            return "[x=" + x + ", y=" + y + "]";
        }
    }
}
