package cn.wxz1997.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    //@RequestMapping(value="login")
    public String loginForm(){
        // 动态跳转页面
       return "login";
    }
}
