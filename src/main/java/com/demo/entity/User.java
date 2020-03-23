package com.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Data
@Table(name = "user")
@Entity
@Accessors(chain = true)//链式赋值注解,简化书写
@ApiModel(value = "com.demo.entity.User", description = "用户参数")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "id")
    private Integer id;

    @Column(name = "username")
    @ApiModelProperty(value = "密码")
    private String password;

    @Column(name = "password")
    @ApiModelProperty(value = "用户名")
    private String username;

    @Column(name = "age")
    @ApiModelProperty(value = "年龄")
    private Integer age;


}
