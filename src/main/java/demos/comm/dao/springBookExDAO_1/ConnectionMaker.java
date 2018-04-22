package demos.comm.dao.springBookExDAO_1;

import java.sql.Connection;
import java.sql.SQLException;

// 해결 1-4 : 인터페이스의 도입
public interface ConnectionMaker {
    public Connection makeNewConnection() throws ClassNotFoundException, SQLException;
}
