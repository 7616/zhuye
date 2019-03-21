package com.it.service;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.it.mapper.SpeDao;
import com.it.pojo.Spe;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SpeServiceImpl implements SpeService {

    @Autowired
    private SpeDao speDao;

    @Override
    public PageResult findPage(Integer pageNum, Integer pageSize) {

        //分页插件
        PageHelper.startPage(pageNum,pageSize);
        //查询
        Page<Spe> p = (Page<Spe>) speDao.selectAll();
        return new PageResult(p.getTotal(),p.getResult());
    }
}
