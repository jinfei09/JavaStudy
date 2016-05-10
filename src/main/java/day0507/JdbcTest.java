/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:JdbcTest
 * 创建人:arika    创建时间:2016-05-07
 */
package day0507;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author arika
 * @create 2016-05-07
 */
public class JdbcTest {
    public static void main(String[] args) {
        JdbcTest jbTest = new JdbcTest();
        boolean myboolean = jbTest.withdraw("xx", "xx");
        System.out.println(myboolean);
    }

    public boolean withdraw(String id, String amount) {
        Connection conn = null;
        Statement statement = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost" +
                            ":3307/shop",
                    "root",
                    "123456");

            String sqlStr = "select * from course_info";
            statement = conn.createStatement();
            return statement.execute(sqlStr);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    if (statement != null) {
                        statement.close();
                    }
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }
}
