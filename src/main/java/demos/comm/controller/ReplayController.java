package demos.comm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
    REST : Representational State Transfer
    하나의 URI가 하나의 고유한 리소스를 대표하도록 설계된 개념
    @Controller, @RestController - 차이점 : 뷰로 리턴하냐, 해당 객체로 리턴하냐
 */
@RestController
@RequestMapping("/reply/*")
public class ReplayController {
}
