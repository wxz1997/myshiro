package cn.wxz1997.controller;

import cn.wxz1997.entity.User;
import cn.wxz1997.service.UserService;
import cn.wxz1997.util.Constants;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String login(User user, HttpServletRequest request){
        //创建subject
        Subject currentUser = SecurityUtils.getSubject();
        //判断是否登录
        if(currentUser.isAuthenticated() == false){
            //根据前端传来的参数制作令牌
            UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), user.getPassword());
            //rememberMe
            token.setRememberMe(false);
            try {
                //token会传到realm去验证
                currentUser.login(token);
                request.getSession().setAttribute(Constants.CURRENT_USER, user.getUsername());
            }catch (AuthenticationException e){
                return "error";
            }
        }
        return "index";
    }

    //@GetMapping("/logout")
    public String logout(){
        System.out.println("注销成功");
        return "logout";
    }
}
