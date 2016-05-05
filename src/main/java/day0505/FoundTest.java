/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:FoundTest
 * 创建人:arika    创建时间:2016-05-05
 */
package day0505;

/**
 * @author arika
 * @create 2016-05-05
 */
public class FoundTest {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6, 7}, {9}};
        boolean found = false;
        for (int i = 0; i < arr.length && !found; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 5) {
                    System.out.println("i=" + i + ", j=" + j);
                    found = true;
                    break;
                }
            }
        }
    }
}
