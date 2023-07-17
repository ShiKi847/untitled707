package com.example.untitled707.web;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.untitled707.dao.DeptMapper;
import com.example.untitled707.dao.EmpMapper;
import com.example.untitled707.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ListController {
    @Autowired(required = false)
    private EmpMapper empMapper;
    @Autowired(required = false)
    private DeptMapper deptMapper;
//    @GetMapping("/list/{id}")
//    public List<Dept> dept(@PathVariable int id) {
//        QueryWrapper<Dept> qw = new QueryWrapper<>();
//        qw.eq("deptno",id);
//        List<Dept> depts = deptMapper.selectList(qw);
//        return depts;
//    }
//    public Dept dept(@PathVariable int id) {
//        QueryWrapper<Dept> qw = new QueryWrapper<>();
//        qw.eq("deptno",id);
//        Dept dept = deptMapper.selectOne(qw);
//        return dept;
//    }

}
