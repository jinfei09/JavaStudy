/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:JDOMTest
 * 创建人:arika    创建时间:2016-04-30
 */
package day0429.jdom;

import day0429.sax.entity.Book;
import org.jdom.Attribute;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * JDOM
 *
 * @author arika
 * @create 2016-04-30
 */
public class JDOMTest {

    private static ArrayList<Book> bookArray = new ArrayList<Book>();
    public static void main(String[] args) {
        SAXBuilder saxBuilder = new SAXBuilder();
        InputStream in;
        try {
//            in = new FileInputStream("books.xml");
            in = new FileInputStream("src/main/java/day0429/jdom/res/books" +
                    ".xml");
            InputStreamReader isr = new InputStreamReader(in, "UTF-8");
            Document document = saxBuilder.build(isr);
            Element rootElement = document.getRootElement();
            List<Element> bookList = rootElement.getChildren();
            for (Element book : bookList) {
                Book bookEntity = new Book();
                System.out.println("======开始解析第" + (bookList.indexOf(book) +
                        1) + "书");
//                解析book属性
                List<Attribute> attrList = book.getAttributes();
                //知道节点下属性名称时获取节点值
//                book.getAttributeValue("id");

                for (Attribute attr : attrList) {
//                    获取属性名
                    String attrName = attr.getName();
//                    获取属性值
                    String attrValue = attr.getValue();

                    System.out.println("属性名: " + attrName + " 属性值:" +
                            attrValue);

                    if (attrName.equals("id")) {
                        bookEntity.setId(attrValue);
                    }
                }
//                对book节点的子节点的节点名以及节点值得遍历
                List<Element> bookChilds = book.getChildren();

                for (Element child : bookChilds) {
                    System.out.println("节点名: " + child.getName() + "---- 节点值:" +
                            " " + child.getValue());
                    if (child.getName().equals("name")) {
                        bookEntity.setName(child.getValue());
                    } else if (child.getName().equals("author")) {
                        bookEntity.setAuthor(child.getValue());
                    } else if (child.getName().equals("year")) {
                        bookEntity.setYear(child.getValue());
                    } else if (child.getName().equals("price")) {
                        bookEntity.setPrice(child.getValue());
                    } else if (child.getName().equals("language")) {
                        bookEntity.setLanguage(child.getValue());
                    }
                }

                System.out.println("======结束解析第" + (bookList.indexOf(book) +
                        1) + "书");
                bookArray.add(bookEntity);
                bookEntity = null;

                System.out.println(bookArray.size());
                System.out.println(bookArray.get(0).getId());
                System.out.println(bookArray.get(0).getName());

            }
        } catch (JDOMException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
