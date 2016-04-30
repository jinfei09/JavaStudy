/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:Test
 * 创建人:arika    创建时间:2016-04-29
 */
package day0429;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author arika
 * @create 2016-04-29
 */
public class Test {
    public List<poker> pokerTo;
    private int COLORNUM = 13;
    public int CARDNUM = 52;
    public Map<String, Card> cardS;

    public Test() {
        this.cardS = new HashMap<String, Card>();
        pokerTo = new ArrayList<poker>();
    }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println("----------创建扑克牌-----------");
        t.PokerDeal(); //创建扑克;
        System.out.println("----------扑克牌创建成功---------");
        System.out.print("扑克含有：");
        t.testPoker(); //输出扑克所包含牌;
        System.out.println();
        System.out.println("-----------开始洗牌-------------");
        t.pokerWash(); //打乱扑克顺序;
        System.out.println("-----------洗牌结束-------------");
        System.out.println("-----------创建玩家-------------");
        t.TestIDName(); //创建玩家输入玩家ID，Name;
        System.out.println("-----------开始发牌-------------");
        t.pokerDeal();  //将扑克发到玩家手中；
        System.out.println("-----------发牌结束-------------");
        System.out.println("-----------游戏开始-------------");
        t.TestPokerUp(); //输出玩家手中扑克；
        t.pokerSort();   //比较玩家手中扑克大小；
    }

    private void pokerSort() {
        poker b = null;
        Card d = null;
        for (String a : cardS.keySet()) {
            Collections.sort(cardS.get(a).pokerCard);
            List<poker> s = cardS.get(a).getPokerCard();
            poker ss = s.get(0);
            System.out.printf("玩家" + cardS.get(a).name + "最大手牌为:" + ss.color
                    + ss.value);
            if(b  == null || ss.compareTo(b)<0){
                b =ss;
                d = cardS.get(a);
            }
        }
    }

    private void TestPokerUp() {
        for (String a : cardS.keySet()) {
            System.out.printf(cardS.get(a).name + "手牌为");
            for (poker poker2 : cardS.get(a).getPokerCard()) {
                System.out.printf(poker2.color + poker2.value);
                System.out.printf("");
            }
        }
    }

    private void pokerDeal() {
        poker poker;
        for (int i = 0; i < 2; i++) {
            Set<String> key = cardS.keySet();
            for (String a : key) {
                poker = pokerTo.get(0);
                pokerTo.remove(0);
                System.out.printf(cardS.get(a).name + "拿牌");
                cardS.get(a).getPokerCard().add(poker);
            }
        }
    }

    private void TestIDName() {
        Scanner to = new Scanner(System.in);
        int i = 0;
        while (i < 2) {
            System.out.printf("请输入第" + (i + 1) + "位玩家ID和姓名");
            System.out.printf("请输入ID:");
            String id = to.next();
            Card card = cardS.get(id);
            if (card == null) {
                System.out.printf("请 输入学生姓名:");
                String name = to.next();
                Card stu = new Card(id, name);
                cardS.put(id, stu);
                i++;
            } else {
                System.out.printf("输入有误");
            }
            continue;
        }

        for (String a : cardS.keySet()) {
            System.out.printf("----欢迎玩家:" + cardS.get(a).id + "    " + cardS
                    .get(a).name);
        }
    }

    private void pokerWash() {
        Collections.shuffle(pokerTo);
    }

    private void testPoker() {
        int size = pokerTo.size();
        for (int i = 0; i < size; i++) {
            poker cr = pokerTo.get(i);
            System.out.printf(cr.color + cr.value + ",");
        }
    }

    private void PokerDeal() {
        String valueB[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "J", "Q", "K"};
        String colorB[] = {"黑桃", "红桃", "梅花", "方片"};
        for (int j = 0; j < CARDNUM / COLORNUM; j++) {
            for (int i = 0; i < COLORNUM; i++) {
                poker pokers = new poker(valueB[i], colorB[j]);
                pokerTo.add(pokers);
            }
        }

    }

}

