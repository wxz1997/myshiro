package cn.wxz1997.controller;

import cn.wxz1997.entity.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
    @PostMapping("/login")
    public String login(User user){
        //创建subject
        Subject currentUser = SecurityUtils.getSubject();
        //判断是否登录
        if(currentUser.isAuthenticated() == false){
            UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), user.getPassword());
            //rememberMe
            token.setRememberMe(true);
            try {
                //token会传到realm去验证
                currentUser.login(token);
            }catch (AuthenticationException e){
                return "error";
            }
        }
        return "redirect:/index";
    }

    @GetMapping("/logout")
    public String logout(){
        System.out.println("注销成功");
        return "logout";
    }
}
