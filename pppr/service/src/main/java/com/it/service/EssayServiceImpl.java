package com.it.service;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.it.mapper.EssayDao;
import com.it.pojo.Essay;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class EssayServiceImpl implements EssayService{

    @Autowired
    private EssayDao essayDao;

    @Override
    public List<Essay> findAll(){
        List<Essay> list = essayDao.selectAll();
        System.out.println("service:"+list);
        return list;
    }


    public PageResult findPage(Integer pageNum, Integer pageSize) {
        //分页插件
        PageHelper.startPage(pageNum,pageSize);
        //查询
        Page<Essay> p = (Page<Essay>) essayDao.selectAll();
        return new PageResult(p.getTotal(),p.getResult());
    }



}
