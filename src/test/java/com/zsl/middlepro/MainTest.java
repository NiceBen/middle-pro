package com.zsl.middlepro;

import com.zsl.baseapi.api.UserService;
import com.zsl.baseapi.api.impl.UserServiceImpl;
import com.zsl.baseapi.model.User;

public class MainTest {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        User user1 = User.builder().name("zhangsan").age(11).gender(1).build();
        userService.addUser(user1);
        System.out.println(userService.count());
    }
}
