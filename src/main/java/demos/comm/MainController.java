package demos.comm;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String Index(Model model) throws Exception {
        System.out.println("index");
        System.out.println("change");
        return "home";
    }

    @RequestMapping("/main")
    public String Main(Model model) throws Exception {
        System.out.println("main");
        return "home";

    }

}
