/**
 * <p>Copyright ® 中国证监会中央监管信息平台版权所有。</p>
 * 类名:ConnectionHandler
 * 创建人:arika    创建时间:2016-05-07
 */
package day0507.ConnectionPool;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.sql.Connection;

/**
 * @author arika
 * @create 2016-05-07
 */
public class ConnectionHandler implements InvocationHandler{
    Connection dbconn;
//    ConnectionPool pool;
    public Object invoke(Object proxy, Method method, Object[] args) throws
            Throwable {
        return null;
    }
}
