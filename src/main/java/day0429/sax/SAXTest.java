/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:SAXTest
 * 创建人:arika    创建时间:2016-04-30
 */
package day0429.sax;

import day0429.sax.entity.Book;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

/**
 * @author arika
 * @create 2016-04-30
 */
public class SAXTest {
    public static void main(String[] args) {
//        获取一个SAXParseFacotry的实例
        SAXParserFactory factory = SAXParserFactory.newInstance();
//        通过factory 获取SAXparser实例
        try {
            SAXParser parser = factory.newSAXParser();
            SAXParserHandler handler = new SAXParserHandler();
            parser.parse("books.xml", handler);
            System.out.println("====共有" + handler.getBookList().size() + "本书");

            for (Book book : handler.getBookList()) {
                System.out.println(book.getId());
                System.out.println(book.getName());
                System.out.println(book.getAuthor());
                System.out.println(book.getYear());
                System.out.println(book.getPrice());
                System.out.println(book.getLanguage());
                System.out.println("------finish-----");
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
