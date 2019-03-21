package com.it.service;

import entity.PageResult;

public interface SpeService {
    PageResult findPage(Integer pageNum, Integer pageSize);
}
