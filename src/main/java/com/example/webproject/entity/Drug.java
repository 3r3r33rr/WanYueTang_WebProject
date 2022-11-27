package com.example.webproject.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
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
@TableName("drug")
@ApiModel(value = "Drug对象", description = "")
public class Drug implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("price")
    private BigDecimal price;

    @TableField("name")
    private String name;

    @TableField("function")
    private String function;

    @TableField("photo")
    private String photo;

    @TableField("stock")
    private Integer stock;

    @TableField("details")
    private String details;

    @ApiModelProperty("规格")
    @TableField("specification")
    private String specification;

    @ApiModelProperty("保质期")
    @TableField("shelflife")
    private String shelflife;

    @ApiModelProperty("剂型")
    @TableField("formulations")
    private String formulations;

    @ApiModelProperty("科室")
    @TableField("department")
    private String department;

    @TableField("state")
    private String state;

    @ApiModelProperty("说明书id")
    @TableField("instructionbookid")
    private Integer instructionbookid;
}
