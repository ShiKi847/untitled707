package com.example.untitled707.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
雇员表
 原则：一般情况，都是一张表一个实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp implements Serializable {
    @TableId
    private Integer empno;
    private String ename;
    private String job;
    private Integer mgr;
    private Date hiredate;
    private Double sal;
    private Double comm;
    private Integer deptno;
    private String password;
}
