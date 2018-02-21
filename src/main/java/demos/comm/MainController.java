package demos.comm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @RequestMapping(value = "/main",  method = RequestMethod.GET)
    public void Main(Model model) throws Exception {
        System.out.println("main");
        System.out.println("i'm jongseon in SSG PC");
        System.out.println("권한체크");
    }

}
