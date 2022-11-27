package com.example.webproject.service.impl;

import com.example.webproject.dto.Result;
import com.example.webproject.entity.User;
import com.example.webproject.mapper.UserMapper;
import com.example.webproject.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Dylan
 * @since 2022-11-26
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public Result login(String name, String pwd) {
        User user = new User();
        user.setName(name);
        user.setPwd(pwd);
        save(user);
        return Result.ok(user);
    }

    @Override
    public Result sign(String name, String pwd, String phone, String sex, String avatar, String flag) {
        User user = new User();
        user.setFlag(flag);
        user.setSex(sex);
        user.setPhone(phone);
        user.setName(name);
        user.setPwd(pwd);
        save(user);
        return Result.ok(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userMapper.list();
    }
}
