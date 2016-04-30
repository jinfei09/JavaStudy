/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:SAXParserHandler
 * 创建人:arika    创建时间:2016-04-30
 */
package day0429.sax;

import day0429.sax.entity.Book;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

/**
 * @author arika
 * @create 2016-04-30
 */
public class SAXParserHandler extends DefaultHandler {

    String value = null;
    Book book = null;
    private ArrayList<Book> bookList = new ArrayList<Book>();

    int bookIndex = 0;

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    /**
     * 用来遍历xml的开始标签
     *
     * @param uri
     * @param localName
     * @param qName
     * @param attributes
     * @throws SAXException
     */
    @Override
    public void startElement(String uri, String localName, String qName,
                             Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);

//        开始解析book元素的属性
        if (qName.equals("book")) {
            bookIndex++;
            book = new Book();
//            String value = attributes.getValue("id");
//            System.out.println("book的属性值是: " + value);

            int num = attributes.getLength();
            for (int i = 0; i < num; i++) {
                System.out.print("book元素的第" + (i + 1) + "个属性名是: " +
                        attributes.getQName(i));
                System.out.println("    属性值是: " + attributes.getValue(i));
                if (attributes.getQName(i).equals("id")) {
                    book.setId(attributes.getValue(i));
                }
            }

        } else if (!qName.equals("book") && !qName.equals("bookstore")) {
            System.out.print("节点名是" + qName);
        }
    }

    /**
     * 用来遍历xml结束标签
     *
     * @param uri
     * @param localName
     * @param qName
     * @throws SAXException
     */
    @Override
    public void endElement(String uri, String localName, String qName) throws
            SAXException {
//        调用DefaultHandler类的endElement方法
        super.endElement(uri, localName, qName);
        if (qName.equals("book")) {
            bookList.add(book);
            book = null;
            System.out.println("============结束遍历本书内容==========");
        } else if (qName.equals("name")) {
            book.setName(value);
        } else if (qName.equals("author")) {
            book.setAuthor(value);
        } else if (qName.equals("year")) {
            book.setYear(value);
        } else if (qName.equals("price")) {
            book.setPrice(value);
        } else if (qName.equals("language")) {
            book.setLanguage(value);
        }
    }

    /**
     * 用来标识解析开始
     *
     * @throws SAXException
     */
    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
        System.out.println("SAX解析开始");
    }

    /**
     * 用来标识解析结束
     *
     * @throws SAXException
     */
    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
        System.out.println("SAX解析结束");
    }

    @Override
    public void characters(char[] ch, int start, int length) throws
            SAXException {
        super.characters(ch, start, length);
        value = new String(ch, start, length);
        if (!value.trim().equals("")) {
            System.out.println("节点值是: " + value);
        }
    }
}
