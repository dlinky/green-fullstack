package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller 
public class HomeController {

    // 요청 URI(요청 파일)을 관리하는 함수 등록
    //   요청방식 명시 get || post
    //   요청자원이 있는 위치 또는 파일 : PATH 부름
    //   대소문자 구별 주소는 웹루트를 의미하는 "/" + 서브폴더 + 파일
    @GetMapping("/")
    public String home() {
        // 1. 데이터만 응답 = REST API 서비스라고 부름
        // @RestController 클래스 필요
        // 2. 동적 홈페이지가 필요 리소스 : template 폴더 사
        return "home";
    }
}
