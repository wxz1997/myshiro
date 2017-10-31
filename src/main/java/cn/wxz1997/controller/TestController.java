package cn.wxz1997.controller;

import cn.wxz1997.annotation.CurrentUser;
import cn.wxz1997.entity.User;
import cn.wxz1997.service.UserService;
import cn.wxz1997.util.Constants;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class TestController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String index() {
        return "redirect:/index";
    }

    @GetMapping("index")
    public String success() {
        return "redirect:/index";
    }

    @GetMapping("unauthorized")
    public String unauthorized() {
        return "unauthorized";
    }

    @GetMapping("/login")
    public String login(){
        System.out.println("登录界面");
        return "login";
    }

    @GetMapping("/admin")
    public String user(){
        System.out.println("管理员界面");
        return "admin";
    }

    @GetMapping("/user")
    public String admin(){
        System.out.println("用户界面");
        return "user";
    }

    @GetMapping("/test")
    public String test(HttpSession session){
        System.out.println("==========开始测试============");
        System.out.println("**********测试用户************");
        System.out.println(userService.findByUsername((String) session.getAttribute(Constants.CURRENT_USER)));
        System.out.println("**********测试角色************");
        System.out.println(userService.findRoles((String) session.getAttribute(Constants.CURRENT_USER)));
        System.out.println("**********测试资源************");
        System.out.println(userService.findResources((String) session.getAttribute(Constants.CURRENT_USER)));
        System.out.println("==========结束测试============");
        return "list";
    }

}
