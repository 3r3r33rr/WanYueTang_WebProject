package com.example.webproject.controller;

import com.example.webproject.dto.Result;
import com.example.webproject.service.ShoppingCartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Dylan
 * @since 2022-11-26
 */
@RestController
@RequestMapping("/shopping-cart")
public class ShoppingCartController {

    @Resource
    private ShoppingCartService service;


    @GetMapping("/addcart/{userId}/{drugId}")
    public Result addCart(@PathVariable("userId")Integer userID,@PathVariable("drugId")Integer drugId){
        return service.addCart(userID,drugId);
    }

    @GetMapping("/getall")
    public Result getAll(){
        return service.getAll();
    }
}
