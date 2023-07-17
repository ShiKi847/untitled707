package com.example.untitled707.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.untitled707.dao.DeptMapper;
import com.example.untitled707.entity.Dept;
import com.example.untitled707.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DeptServiceImpl implements DeptService {
    @Autowired(required = false)
    private DeptMapper deptMapper;


    @Override
    public List<Dept> list(Integer deptno) {
        QueryWrapper<Dept> qw = new QueryWrapper<>();
        qw.eq("deptno",deptno);
        return deptMapper.selectList(qw);
    }
}
