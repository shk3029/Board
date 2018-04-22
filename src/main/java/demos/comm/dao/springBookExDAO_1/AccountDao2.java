package demos.comm.dao.springBookExDAO_1;


import demos.comm.domain.SpringBookEx2VO.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// 해결 1-3 독립된 클래스의 사용 (SimpleConnectionMaker)
public class AccountDao2 {
    // private SimpleConnectionMaker simpleConnectionMaker;
    // 해결 1-4 인터페이스
    private ConnectionMaker connectionMaker;
    /*
        상태를 관리하는게 아니므로, 생성자를 통해 한번만 만든 후, 인스턴스 변수에 저장해두고 메소드에서 사용하게함
     */

    public AccountDao2(ConnectionMaker connectionMaker) {
        /*
          해결 1-3 독립된 클래스의 사용 (SimpleConnectionMaker)
          simpleConnectionMaker = new SimpleConnectionMaker();
         */

        /*
          해결 1-4 인터페이스 : 각 회사에 맞게 가져옴
          connectionMaker = new DConnectionMaker();
         */

        // 해결 1-5 불필요한 관심을 분리
        this.connectionMaker = connectionMaker;
    }

    /*
  INSERT
   */
    public void add(User user) throws ClassNotFoundException, SQLException {
        //Connection c = simpleConnectionMaker.makeNewConnection();
        Connection c = connectionMaker.makeNewConnection();

    }


}








