package com.it.service;


import com.it.pojo.Essay;
import entity.PageResult;

import java.util.List;

public interface EssayService {

    public List<Essay> findAll();

    public PageResult findPage(Integer pageNum, Integer pageSize);

}
