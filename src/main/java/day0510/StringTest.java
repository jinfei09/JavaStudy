/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:StringTest
 * 创建人:arika    创建时间:2016-05-10
 */
package day0510;

import java.util.HashMap;
import java.util.Map;

/**
 * @author arika
 * @create 2016-05-10
 */
public class StringTest {
    public static void main(String[] args) {
        String content = "中国 aadf 的111萨 bbb 菲的 zz 萨菲";
        HashMap map = new HashMap();
        for(int i = 0 ; i< content.length(); i++){
            char c = content.charAt(i);
            Integer num = (Integer) map.get(c);
            if(num == null){
                num = 1;
            } else {
                num = num + 1;
            }
            map.put(c, num);
        }

//        for(Map.Entry entry : map){
//
//        }
    }
}
