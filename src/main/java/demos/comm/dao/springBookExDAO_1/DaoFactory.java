package demos.comm.dao.springBookExDAO_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;

@Configuration // 애플리케이션 컨텍스트가 사용할 설정정보라는 표시!!
public class DaoFactory {
    @Bean // 오브젝트 생성을 담당하는 IoC용 메소드라고 표시!!
    public UserDao2 userDao2() {
       // 해결 1-9 수정자 메소드 DI를 사용하는 팩토리 메소드
       UserDao2 userDao2 = new UserDao2();
       userDao2.setDataSource(dataSource());
       return userDao2;

       /* ConnectionMaker connectionMaker = new DConnectionMaker();
        UserDao2 userDao2 = new UserDao2(connectionMaker);
        return userDao2;*/
       // return new UserDao2(connectionMaker());
    }
    @Bean // 오브젝트 생성을 담당하는 IoC용 메소드라고 표시!!
    public AccountDao2 accountDao2() {
        return new AccountDao2(connectionMaker());
    }

    @Bean// 오브젝트 생성을 담당하는 IoC용 메소드라고 표시!!
    // 해결 1-6 메소드 분리
    public ConnectionMaker connectionMaker() {
        return new DConnectionMaker();
    }

    @Bean
    public DataSource dataSource() {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass(com.mysql.jdbc.Driver.class);
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/book_ex?useSSL=false");
        dataSource.setUsername("js");
        dataSource.setPassword("js");
        return dataSource;
    }

 }






