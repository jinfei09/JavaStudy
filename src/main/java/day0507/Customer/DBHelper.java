/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:DBHelper
 * 创建人:arika    创建时间:2016-05-07
 */
package day0507.Customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author arika
 * @create 2016-05-07
 */
public class DBHelper {

    public static void main(String[] args) {
        DBHelper dbHelper = new DBHelper("select * from course_info;");

        try {
            ResultSet ret = dbHelper.pst.executeQuery();
            while(ret.next()){
                String uid = ret.getString(1);
            }

            ret.close();
            dbHelper.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static final String url = "jdbc:mysql://127.0.0.1:3307/shop";
    public static final String name = "com.mysql.jdbc.Driver";
    public static final String user = "root";
    public static final String password = "123456";

    public static Connection conn = null;
    public PreparedStatement pst = null;

    public DBHelper(String sql) {
        try {
            Class.forName(name);//指定连接类型
            conn = DriverManager.getConnection(url, user, password);//获取连接
            pst = conn.prepareStatement(sql);//准备执行语句
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        try {
            Class.forName(name);//指定连接类型
            conn = DriverManager.getConnection(url, user, password);//获取连接
            return conn;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public void close() {
        try {
            this.conn.close();
            this.pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
