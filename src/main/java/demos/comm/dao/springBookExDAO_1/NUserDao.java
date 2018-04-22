package demos.comm.dao.springBookExDAO_1;

import java.sql.Connection;
import java.sql.SQLException;

public class NUserDao extends UserDao {
    // 상속을 통해 확장
    public Connection getConnection() throws ClassNotFoundException, SQLException {

        // N사 DB Connection 코드
        return null;
    }
}
