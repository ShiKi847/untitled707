package com.example.untitled707.web;

import com.example.untitled707.entity.Dept;
import com.example.untitled707.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class List2Controller {
    @Autowired
    private DeptService deptService;
    @GetMapping("/list/{deptno}")
    @ResponseBody
    public List<Dept> dept(@PathVariable Integer deptno) {
        return deptService.list(deptno);
    }
//    public Dept dept(@PathVariable int id) {
//        QueryWrapper<Dept> qw = new QueryWrapper<>();
//        qw.eq("deptno",id);
//        Dept dept = deptMapper.selectOne(qw);
//        return dept;
//    }

}
