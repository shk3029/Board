package demos.comm.dao.springBookExDAO_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// 해결 1-4 인터페이스 도입
public class DConnectionMaker implements ConnectionMaker {

    public Connection makeNewConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/book_ex?useSSL=false","js","js"); // Connection 객체 생성
        return c;
    }
}
