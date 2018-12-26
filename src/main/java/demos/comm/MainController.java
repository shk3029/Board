package demos.comm;

import demos.comm.domain.Member;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
    전통적인 MVC 컨트롤러와 RESTful 웹 서비스 컨트롤러의 주요 차이점은 HTTP 응답 본문을 만드는 방법
    RESTful 웹 서비스 컨트롤러는 단순히 뷰 기술을 사용하여 서버 쪽 인사말 데이터를 HTML로 렌더링하는 대신  개체를 채우고 반환합니다.
    객체 데이터는 JSON으로 HTTP 응답에 직접 기록됩니다.

 */

@RestController
public class MainController {

    @RequestMapping(value = "/main",  method = RequestMethod.GET)
    public void Main(Model model) throws Exception {
        System.out.println("main");
        System.out.println("JS MainController");
    }

    @RequestMapping("/member")
    public Member member(@RequestParam(value = "userId", defaultValue = "171179") String userId) {
        return new Member(userId);
    }

}
