package demos.comm.dao.springBookExDAO_1;


import demos.comm.domain.SpringBookEx2VO.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// 해결 1-3 독립된 클래스의 사용 (SimpleConnectionMaker)
public class UserDao2 {

    private DataSource dataSource;
    public void setDataSource(DataSource dataSource)  {
        this.dataSource = dataSource;
    }

    public void setConnectionMaker(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }

    // private SimpleConnectionMaker simpleConnectionMaker;
    // 해결 1-4 인터페이스
    // 해결 1-8 수정자 메소드 DI 방식을 사용

    private ConnectionMaker connectionMaker;
    /*
        해결 1-7 인스턴스 필드값으로 옮김
       -> 매번 새로운 값으로 바뀌는 정보를 담은 인스턴스 변수, 심각한 문제 발생
        private Connection c;
        private User user;*/
    /*
        상태를 관리하는게 아니므로, 생성자를 통해 한번만 만든 후, 인스턴스 변수에 저장해두고 메소드에서 사용하게함
     */

    public UserDao2(){
   /*     // 의존주입 검색 1 (DaoFactory를 이용하는 생성자)
        DaoFactory daoFactory = new DaoFactory();
        this.connectionMaker = daoFactory.connectionMaker();
        // 의존관계 검색을 이용
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
        this.connectionMaker = context.getBean("connectionMaker", ConnectionMaker.class);*/
    }

/*    public UserDao2(ConnectionMaker connectionMaker) {

        *//*
          해결 1-3 독립된 클래스의 사용 (SimpleConnectionMaker)
          simpleConnectionMaker = new SimpleConnectionMaker();
         *//*
        *//*
          해결 1-4 인터페이스 : 각 회사에 맞게 가져옴
          connectionMaker = new DConnectionMaker();
         *//*

        // 해결 1-5 불필요한 관심을 분리
        this.connectionMaker = connectionMaker;
    }*/

    /*
  INSERT
   */
    public void add(User user) throws ClassNotFoundException, SQLException {
        // Connection c = simpleConnectionMaker.makeNewConnection();
        // Connection c = connectionMaker.makeNewConnection();
        Connection c = dataSource.getConnection();
        PreparedStatement ps = c.prepareStatement(
                "INSERT INTO USERS(id, name, password) VALUES (?,?,?)");
        ps.setString(1, user.getId());
        ps.setString(2, user.getName());
        ps.setString(3, user.getPassword());

        ps.executeUpdate();
        ps.close();
        c.close();
    }

    /*
    SELECT
     */
    public User get(String id) throws ClassNotFoundException, SQLException {
        //Connection c = simpleConnectionMaker.makeNewConnection();
        // Connection c = connectionMaker.makeNewConnection();
        Connection c = dataSource.getConnection();
        PreparedStatement ps = c.prepareStatement(
                "SELECT * FROM USERS WHERE id = ?");
        ps.setString(1,id);

        ResultSet rs = ps.executeQuery();
        rs.next();

        User user = new User();
        user.setId(rs.getString("id"));
        user.setName(rs.getString("name"));
        user.setPassword(rs.getString("password"));

        rs.close();
        ps.close();
        c.close();

        return user;
    }

}








