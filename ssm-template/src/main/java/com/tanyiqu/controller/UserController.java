package com.tanyiqu.controller;

import com.tanyiqu.pojo.User;
import com.tanyiqu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/all")
    public String add(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "allUser";
    }
}
