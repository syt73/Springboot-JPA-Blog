package com.lsw73.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//스프링이 com.lsw73.blog 이하를 스캔해서 모든 파일을 new하는 것은 아니구요.
// 특정 어노테이션이 붙어있는 클래스 파일들을 new해서(loC) 스프링 컨터이너에 관리해줍니다.
@RestController
public class BlogControllerTest {
             //http://localhost:8080/test/hello
	         @GetMapping("/test/hello")
	         public String hello() {
            	          return "<h1>hello spring boot</h1>";
             }
}