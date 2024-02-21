package com.powernode.spring6.web;

import com.powernode.spring6.service.UserService;
import com.powernode.spring6.service.impl.UserServiceImpl;

//表示层调业务层，业务层调用持久层
public class UserAction {
    private UserService userService = new UserServiceImpl();
    public void deleteRequest(){
        userService.deleteUser();
    }

}
