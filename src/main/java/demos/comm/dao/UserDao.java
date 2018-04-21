package demos.comm.dao;

import demos.comm.domain.User;

import java.sql.*;

public class UserDao {

    /*
    INSERT
     */
    public void add(User user) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");   // JDBC 드라이버 로드
        Connection c = DriverManager.getConnection(
                        "jdbc:mysql://127.0.0.1:3306/book_ex"); // Connection 객체 생성

        // PreparedStatement 객체를 생성하여 SQL 쿼리를 생성, 실행 및 반환된 결과를 가져옴
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
    public void get(String id) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");   // JDBC 드라이버 로드
        Connection c = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/book_ex"); // Connection 객체 생성

        // PreparedStatement 객체를 생성하여 SQL 쿼리를 생성, 실행 및 반환된 결과를 가져옴
        PreparedStatement ps = c.prepareStatement(
                "SELECT * FROM USERS WHERE id = ?");
        ps.setString(1,id);

        ResultSet rs = ps.executeQuery();
        rs.next();

        User user = new User();
        user.setId(rs.getString("id"));

        ps.close();
        c.close();
    }
}

