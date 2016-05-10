/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:Customer
 * 创建人:arika    创建时间:2016-05-07
 */
package day0507.Customer;

import java.math.BigDecimal;

/**
 * @author arika
 * @create 2016-05-07
 */
public class Customer {
    private String id;
    private int level;
    private BigDecimal sumAmount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public BigDecimal getSumAmount() {
        return sumAmount;
    }

    public void setSumAmount(BigDecimal sumAmount) {
        this.sumAmount = sumAmount;
    }
}
