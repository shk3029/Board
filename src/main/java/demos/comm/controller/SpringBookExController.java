package demos.comm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/springBook/*")
public class SpringBookExController {

    @RequestMapping("/ex1")
    public void example1(Model model) {
        System.out.println("Ex1>>>>>>>>>>>>>");
    }


}
