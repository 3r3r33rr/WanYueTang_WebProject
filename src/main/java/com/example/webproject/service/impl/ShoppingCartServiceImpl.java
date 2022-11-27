package com.example.webproject.service.impl;

import com.example.webproject.dto.Result;
import com.example.webproject.entity.ShoppingCart;
import com.example.webproject.mapper.ShoppingCartMapper;
import com.example.webproject.service.ShoppingCartService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {

    @Override
    public Result addCart(Integer userID, Integer drugId) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setUserId(userID);
        shoppingCart.setDrugId(drugId);
        save(shoppingCart);
        return Result.ok(shoppingCart);
    }

    @Override
    public Result getAll() {
        List<ShoppingCart> list = list();
        return Result.ok(list);
    }
}
