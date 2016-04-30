/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:DOMTest
 * 创建人:arika    创建时间:2016-04-29
 */
package day0429.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Dom使用
 *
 * @author arika
 * @create 2016-04-29
 */
public class DOMTest {
    public static void main(String[] args) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.parse("books.xml");
            NodeList booklist = document.getElementsByTagName("book");
            System.out.println("一共有" + booklist.getLength());

            for (int i = 0; i < booklist.getLength(); i++) {
                System.out.println("========开始遍历第" + (i + 1) + "========");
                Node book = booklist.item(i);
                NamedNodeMap attrs = book.getAttributes();
                System.out.println("第" + (i + 1) + "本书, 共有" + attrs.getLength() +"个属性");
                for (int j = 0; j < attrs.getLength(); j++) {
                    Node attr = attrs.item(j);
                    System.out.print("属性名:" + attr.getNodeName());
                    System.out.println("---属性值:" + attr.getNodeValue());
                }

                Element eBook = (Element) booklist.item(i);
                String attrValue = eBook.getAttribute("id");
                System.out.println("id属性的属性值为" + attrValue);

                NodeList childNodes = book.getChildNodes();
                System.out.println("第" + (i+1) + "本书共有" + childNodes.getLength() + "个节点");

                for(int k = 0; k < childNodes.getLength(); k++){
                    if(childNodes.item(k).getNodeType() == Node.ELEMENT_NODE){
                        System.out.print("节点名： " + childNodes.item(k).getNodeName());
//                        System.out.println("    ====节点值: " + childNodes.item(k).getFirstChild().getNodeValue());
                        System.out.println("    ====节点值: " + childNodes.item(k).getTextContent());
                    }
                }
                System.out.println("========结束遍历第" + (i + 1) + "========");
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
