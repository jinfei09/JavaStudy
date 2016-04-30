/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:Dom4jTest
 * 创建人:arika    创建时间:2016-04-30
 */
package day0429.dom4j;

import day0429.sax.entity.Book;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Dom4jTest
 *
 * @author arika
 * @create 2016-04-30
 */
public class Dom4jTest {
    private static ArrayList<Book> bookArray = new ArrayList<Book>();

    public static void main(String[] args) {
//        解析books.xml文件
//        创建SAXReader对象reader
        SAXReader reader = new SAXReader();
//        通过reader对象的read方法加载book.xml文件, 获取 Document对象
        try {
            Document document = reader.read(new File("books.xml"));
            Element bookStore = document.getRootElement();
//            通过element对象的 elementIterator方法获取迭代器
            Iterator it = bookStore.elementIterator();
//            遍历迭代器， 获取根节点中的信息
            while (it.hasNext()) {
                System.out.println("====== 开始遍历某一本书========");
                Book bookEntity = new Book();
                Element book = (Element) it.next();
//                获取book的属性名以及属性值
                List<Attribute> bookAtttrs = book.attributes();
                for (Attribute attr : bookAtttrs) {
                    System.out.println("属性名: " + attr.getName() + " 属性值: " +
                            attr.getValue());
                    if (attr.getName().equals("id")) {
                        bookEntity.setId(attr.getValue());
                    }

                }

                Iterator itt = book.elementIterator();
                while (itt.hasNext()) {
                    Element child = (Element) itt.next();
                    System.out.println("节点名: " + child.getName() + " 节点值:" +
                            " " + child.getStringValue());

                    if (child.getName().equals("name")) {
                        bookEntity.setName(child.getStringValue());
                    } else if (child.getName().equals("author")) {
                        bookEntity.setAuthor(child.getStringValue());
                    } else if (child.getName().equals("year")) {
                        bookEntity.setYear(child.getStringValue());
                    } else if (child.getName().equals("price")) {
                        bookEntity.setPrice(child.getStringValue());
                    } else if (child.getName().equals("language")) {
                        bookEntity.setLanguage(child.getStringValue());
                    }
                }

                System.out.println("====== 结束遍历某一本书========");
                bookArray.add(bookEntity);
            }

            for(Book book : bookArray){
                System.out.println(book.toString());
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
