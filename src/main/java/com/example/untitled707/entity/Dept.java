package com.example.untitled707.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 部门表
 原则：一般情况，都是一张表一个实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept implements Serializable {
    @TableId
    private Integer deptno;
    private String dname;
    private String loc;


}
