package cn.wxz1997.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
    @RequestMapping(value="/{formName}")
    public String loginForm(@PathVariable String formName){
        // 动态跳转页面
        System.out.println("动态跳转：" + formName );
        return formName;
    }

}