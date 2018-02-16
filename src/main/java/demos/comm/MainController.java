package demos.comm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String Index(Model model) {
        System.out.println("index");
        System.out.println("change");
        System.out.println("계정테스트d");
        System.out.println("mac my name - ");
        System.out.println("DB까지 완료 이제 mybatis 연동시작~~~");
        return "home";
    }

    @RequestMapping("/main")
    public String Main(Model model) {
        System.out.println("main");
        System.out.println("i'm jongseon in SSG PC");
        System.out.println("권한체크");
        return "home";

    }

}
