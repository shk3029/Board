package demos.comm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String Index(Model model) throws Exception {
        System.out.println("index");
        System.out.println("change");
        System.out.println("계정테스트");
        System.out.println("mac my name - ");
        return "home";
    }

    @RequestMapping("/main")
    public String Main(Model model) throws Exception {
        System.out.println("main");
        System.out.println("i'm jongseon in SSG PC");
        System.out.println("권한체크");
        return "home";

    }

}
