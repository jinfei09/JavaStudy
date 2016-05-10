/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:GarbageTest
 * 创建人:arika    创建时间:2016-05-10
 */
package day0510;

import day0504.Person;

import java.io.IOException;

/**
 * @author arika
 * @create 2016-05-10
 */
public class GarbageTest {
    public static void main(String[] args) {
        try {
            gcTest();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("has exited gcTest!");
        try {
            System.in.read();
            System.in.read();
            System.out.println("out begin gc!");
            for (int i = 0; i < 100; i++) {
                System.gc();
                System.in.read();
                System.in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void gcTest() throws IOException {
        System.in.read();
        System.in.read();
        Person p1 = new Person();
        System.in.read();
        System.in.read();

        Person p2 = new Person();
        p1.setMate(p2);
        p1.setMate(p1);

        System.out.println("before exit gc test");
        System.in.read();
        System.in.read();
        System.gc();
        System.out.println("exit gc test!");
    }

    private static class Person{
        byte[] data = new byte[20000000];
        Person mate = null;

        public void setMate(Person mate) {
            this.mate = mate;
        }
    }
}
