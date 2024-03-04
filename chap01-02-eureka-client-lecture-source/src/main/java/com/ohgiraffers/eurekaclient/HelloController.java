package com.ohgiraffers.eurekaclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/* 필기. 자바의 모든 반환 값이 JSON 문자열로 바뀜 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "헬로우";
    }
}
