package com.example.webproject.controller;

import com.example.webproject.dto.Result;
import com.example.webproject.service.DrugService;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping("/drug")
public class DrugController {
    @Resource
    private DrugService drugService;

    @GetMapping("/getall")
    public Result getAll(){
        return drugService.getAll();
    }

}
