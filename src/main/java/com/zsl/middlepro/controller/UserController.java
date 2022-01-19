package com.zsl.middlepro.controller;

import com.zsl.baseapi.api.UserService;
import com.zsl.baseapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public User getUser(String name) {
        return userService.getUser(name);
    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user) {
        userService.addUser(user);
        return "添加成功";
    }

    @GetMapping("/count")
    public int count() {
        return userService.count();
    }

    @PostMapping("/delUser")
    public String delUser(@RequestBody User user) {
        userService.delUser(user);
        return "删除成功";
    }
}
