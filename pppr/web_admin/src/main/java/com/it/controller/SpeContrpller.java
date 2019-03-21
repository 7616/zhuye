package com.it.controller;


import com.it.service.SpeService;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spe")
public class SpeContrpller {

    @Autowired
    private SpeService speService;

    @RequestMapping("/findPage")
    public PageResult findPage(Integer pageNum, Integer pageSize){
        return speService.findPage(pageNum,pageSize);
    }
}
