package com.cos.security1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping({"", "/"})
    public String index() {
        /**
         * application.yml 참고 (mvc: 생략 가능, 의존성만 설정해주면 됨)
         * 머스테치 기본폴더 src/main/resources/
         * 뷰 리졸버 설정: templates(prefix), .mustache(suffix)
         * */
        return "index";
    }
}
