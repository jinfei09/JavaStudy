package day0504;

/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:Person
 * 创建人:arika    创建时间:2016-05-04
 */
public interface Person {
    public String name();

    public int age();

    @Deprecated
    public void sing();

}
