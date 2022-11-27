package com.example.webproject.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 
 * </p>
 *
 * @author Dylan
 * @since 2022-11-26
 */
@Data
@TableName("instruction_book")
@ApiModel(value = "InstructionBook对象", description = "")
public class InstructionBook implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("drug_id")
    private Integer drugId;

    @ApiModelProperty("用量")
    @TableField("dosage")
    private String dosage;

    @ApiModelProperty("禁忌")
    @TableField("taboo")
    private String taboo;

    @ApiModelProperty("功能主治")
    @TableField("function")
    private String function;

    @TableField("name")
    private String name;
}
