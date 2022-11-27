package com.example.webproject.controller;

import com.example.webproject.dto.Result;
import com.example.webproject.service.InstructionBookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Dylan
 * @since 2022-11-26
 */
@RestController
@RequestMapping("/instruction-book")
public class InstructionBookController {

    private InstructionBookService instructionBookService;

    @GetMapping("/getall")
    public Result getAll(){
        return  instructionBookService.getAll();
    }
}
