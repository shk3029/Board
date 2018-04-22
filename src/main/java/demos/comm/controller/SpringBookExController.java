package demos.comm.controller;

import demos.comm.dao.springBookExDAO_1.NUserDao;
import demos.comm.domain.SpringBookEx2VO.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;

@Controller
@RequestMapping("/springBook/*")
public class SpringBookExController {

    @RequestMapping("/ex1")
    public void example1(Model model) throws ClassNotFoundException, SQLException {
        System.out.println("Ex1>>>>>>>>>>>>>");

        // userDao의 getConnection 기능이 추상메소드로 되어있으니, 각 사의 userDao를 가져오자
        // UserDao dao = new UserDao();
        NUserDao dao = new NUserDao();

        User user = new User();
        user.setId("jack");
        user.setName("정종선");
        user.setPassword("js");

        dao.add(user);

        System.out.println(user.getId() + "등록성공");

        User user2 = dao.get(user.getId());
        System.out.println(user2.getName());

        System.out.println(user2.getPassword());
        System.out.println(user2.getId() + "조회성공");
    }





}
