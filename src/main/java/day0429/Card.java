/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:Card
 * 创建人:arika    创建时间:2016-04-29
 */
package day0429;

import java.util.ArrayList;
import java.util.List;

/**
 * 发牌游戏
 *
 * @author arika
 * @create 2016-04-29
 */
public class Card {
    public String id;
    public String name;
    public List<poker> pokerCard;
    public Card(){

    }

    public Card(String id, String name) {
        this.id = id;
        this.name = name;
        this.pokerCard = new ArrayList<poker>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<poker> getPokerCard() {
        return pokerCard;
    }

    public void setPokerCard(List<poker> pokerCard) {
        this.pokerCard = pokerCard;
    }

}
