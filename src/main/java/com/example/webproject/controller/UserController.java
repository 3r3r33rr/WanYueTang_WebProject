package com.example.webproject.controller;

import com.example.webproject.dto.Result;
import com.example.webproject.entity.User;
import com.example.webproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Dylan
 * @since 2022-11-26
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/login/{name}/{pwd}")
    public Result login(@PathVariable("name")String name,@PathVariable("pwd")String pwd){
        return userService.login(name,pwd);
    }

    @GetMapping("/sign/{name}/{pwd}/{phone}/{sex}/{avatar}/{flag}")
    public Result sign(@PathVariable("name")String name,
                       @PathVariable("pwd")String pwd,
                       @PathVariable("phone")String phone,
                       @PathVariable("sex")String sex,
                       @PathVariable("avatar")String avatar,
                       @PathVariable("flag")String flag){
        return userService.sign(name,pwd,phone,sex,avatar,flag);
    }

    @GetMapping("/getall")
    public Result getAllUser(){
        List<User> list = userService.getAllUsers();
        return Result.ok(list);
    }

}
