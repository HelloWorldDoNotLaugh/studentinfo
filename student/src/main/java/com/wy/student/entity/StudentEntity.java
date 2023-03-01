package com.wy.student.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author HelloWorld
 * @create 2023/3/1 07:32
 * @email helloworld.dng@gmail.com
 */
@Data
@ApiModel(value = "学生信息表",description = "")
@TableName("student")
public class StudentEntity implements Serializable,Cloneable{
    /** 学号;学号 */
    @TableId(type = IdType.AUTO)
    @ApiModelProperty(name = "学号",notes = "学号")
    private Integer id ;
    /** 姓名;姓名 */
    @ApiModelProperty(name = "姓名",notes = "姓名")
    private String name ;
    /** 性别;性别: 男-B 女-G */
    @ApiModelProperty(name = "性别",notes = "性别: 男-B 女-G")
    private String sex ;
    /** 年龄;年龄 */
    @ApiModelProperty(name = "年龄",notes = "年龄")
    private Integer age ;
    /** 生日;出生日期 */
    @ApiModelProperty(name = "生日",notes = "出生日期")
    private Date birthday ;
    /** 民族;民族 */
    @ApiModelProperty(name = "民族",notes = "民族")
    private String nationality ;
    /** 年级id;年级id */
    @ApiModelProperty(name = "年级id",notes = "年级id")
    private String gradeId ;
    /** 班级id;班级id */
    @ApiModelProperty(name = "班级id",notes = "班级id")
    private String classId ;
    /** 创建时间;创建时间 */
    @ApiModelProperty(name = "创建时间",notes = "创建时间")
    private Date makeTime ;
    /** 修改时间;修改时间 */
    @ApiModelProperty(name = "修改时间",notes = "修改时间")
    private Date modifyTime ;


}