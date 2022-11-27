package com.example.webproject.service;

import com.example.webproject.dto.Result;
import com.example.webproject.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Dylan
 * @since 2022-11-26
 */
public interface UserService extends IService<User> {

    Result login(String name, String pwd);

    Result sign(String name, String pwd, String phone, String sex, String avatar, String flag);

    List<User> getAllUsers();
}
