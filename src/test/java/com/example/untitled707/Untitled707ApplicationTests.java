package com.example.untitled707;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.untitled707.dao.DeptMapper;
import com.example.untitled707.dao.EmpMapper;
import com.example.untitled707.entity.Dept;
import com.example.untitled707.entity.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.List;

@SpringBootTest
class Untitled707ApplicationTests {
    @Autowired(required = false)
    private EmpMapper empMapper;
    @Autowired(required = false)
    private DeptMapper deptMapper;

    @Test
    void contextLoads() {
        Dept dept = deptMapper.selectById(10);
        Emp emp = empMapper.selectById(2222);
        System.out.println(dept);
        System.out.println(emp);
    }
    @Test
    void contextLoads2() throws IOException {
        List<Emp> emps = empMapper.selectList(null);
        List<Dept> depts = deptMapper.selectList(null);
        System.out.println(emps);
        System.out.println(depts);
    }
    @Test
    void contextLoads3() {
        QueryWrapper<Emp> qw = new QueryWrapper<>();
        qw.eq("ename","王五");
        qw.select("sal");
        Emp emp = empMapper.selectOne(qw);
        System.out.println(emp);
    }
    @Test
    void contextLoads4(){
        Long count = empMapper.selectCount(null);
        System.out.println(count);
    }
    @Test
    void contextLoads5(){
        int insert = deptMapper.insert(new Dept(80, "销售部门", "上海"));
        System.out.println(insert);
    }
    @Test
    void contextLoads6(){
        QueryWrapper<Dept> qw = new QueryWrapper<>();

        Page<Dept> deptPage = deptMapper.selectPage(new Page<>(2, 5), null);
        System.out.println(deptPage.getRecords());

    }
    @Test
    void contextLoads7() {
        QueryWrapper<Dept> qw = new QueryWrapper<>();
        qw.eq("deptno",10);
        List<Dept> depts = deptMapper.selectList(qw);
        System.out.println(depts);

    }


}
