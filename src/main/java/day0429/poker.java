/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:poker
 * 创建人:arika    创建时间:2016-04-29
 */
package day0429;

import java.util.Arrays;
import java.util.List;

/**
 * 扑克
 *
 * @author arika
 * @create 2016-04-29
 */
public class poker implements Comparable<poker> {
    public String value;
    public String color;

    public poker(String value, String color) {
        this.value = value;
        this.color = color;
    }

    public poker() {

    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int compareTo(poker o) {
        List<String> valueBase = Arrays.asList("K", "Q", "J", "10", "9", "8",
                "7", "6", "5", "4", "3", "2", "A");
        List<String> colorBase = Arrays.asList("黑桃", "红桃", "梅花", "方片");
        if (valueBase.indexOf(this.value) == valueBase.indexOf(o.value)) {
            return Integer.valueOf(colorBase.indexOf(this.color)).compareTo
                    (Integer.valueOf(colorBase.indexOf(o.getColor())));
        } else {
            return Integer.valueOf(valueBase.indexOf(this.value)).compareTo
                    (Integer.valueOf(valueBase.indexOf(o.getValue())));
        }
    }
}
