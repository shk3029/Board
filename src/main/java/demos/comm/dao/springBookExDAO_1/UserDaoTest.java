package demos.comm.dao.springBookExDAO_1;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.sql.SQLException;

public class UserDaoTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
         //애플리케이션 컨텍스트 적용전 방식
         // UserDao2 dao = new DaoFactory().userDao2();

        /*
            애플리케이션 컨텍스트를 적용한 방식
            - @Configuration이 붙은 자바 코드를 설정정보로 사용하려면,
                AnnotationConfigApplicationContext를 이용!!
                getBean("메소드이름", 클래스이름.class)
        */
        /*
            - DaoFactory 설정정보를 사용할 때 사용 -
        ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
        */
        //  - XML 설정정보를 이용할 때 사용 -
        ApplicationContext context = new GenericXmlApplicationContext("spring/application-context.xml");
        UserDao2 dao = context.getBean("userDao2", UserDao2.class);


        // 1.6 TEST CODE
        // 오브젝트 팩토리 방식
        UserDao2 beforeDao1 = new DaoFactory().userDao2();
        UserDao2 beforeDao2 = new DaoFactory().userDao2();

        System.out.println("object factory dao1" + beforeDao1);
        System.out.println("object factory dao2" + beforeDao2);

        // 애플리케이션 컨텍스트 방식
        UserDao2 afterDao1 = context.getBean("userDao2", UserDao2.class);
        UserDao2 afterDao2 = context.getBean("userDao2", UserDao2.class);

        System.out.println("application context dao1" + afterDao1);
        System.out.println("application context dao2" + afterDao2);
    }
}


