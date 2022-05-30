package com.ruanko.control;

import com.ruanko.entity.User;
import com.ruanko.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Title: UserController
 * Description:
 * 用户控制层
 * Version:1.0.0
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(User user) {
        Boolean result=userService.findByUsernameAndPassword(user.getUsername(),user.getPassword());
        if(result)
//            return "redirect:/index";
            return "/drivers";
        else
            return "user/login";
    }
}