package demos.comm.dao.springBookExDAO_1;

import demos.comm.domain.SpringBookEx2VO.User;

import java.sql.*;

// 해결 1-2 : 상속을 통한 확장 (abstract)
public abstract class UserDao {
// public class UserDao
    public UserDao() {

    }

    /*
    INSERT
     */
    public void add(User user) throws ClassNotFoundException, SQLException {
        // 해결 1 : 중복코드 제거
        /* Class.forName("com.mysql.jdbc.Driver");   // JDBC 드라이버 로드
        Connection c = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/book_ex?useSSL=false","js","js"); // Connection 객체 생성
        */

        Connection c = getConnection();
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
        // 해결 1 : 중복코드 제거
        /*   Class.forName("com.mysql.jdbc.Driver");   // JDBC 드라이버 로드
        Connection c = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/book_ex?useSSL=false","js","js"); // Connection 객체 생성
       */

        Connection c = getConnection();
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

    // 해결 1 - 중복코드 제거
   /* private Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection c = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/book_ex?useSSL=false","js","js"); // Connection 객체 생성
        return c;
    }*/

    // 해결 1-2 상속을 통한 확장
    public abstract Connection getConnection() throws ClassNotFoundException, SQLException;

}








