/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:Book
 * 创建人:arika    创建时间:2016-04-30
 */
package day0429.sax.entity;

/**
 * @author arika
 * @create 2016-04-30
 */
public class Book {
    private String id;
    private String name;
    private String author;
    private String year;
    private String price;
    private String language;

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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "{id: " + getId() + ", name: " + getName() + ", author: " +
                getAuthor() + ", year: " + getYear() + ", price: " + getPrice
                () + ", language: " + getLanguage() + "}";
    }
}
