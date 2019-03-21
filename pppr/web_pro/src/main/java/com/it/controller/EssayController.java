package com.it.controller;


import com.it.pojo.Essay;
import com.it.service.EssayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * 文章管理
 */
@RestController
@RequestMapping("/essay")
public class EssayController {

     @Autowired
     private EssayService essayService;

    //商品分页查询 条件
    @RequestMapping("/findAll")
    public List<Essay> findAll(){
        //商家ID 主键
        List<Essay> list = essayService.findAll();
        System.out.println("controller:"+list);
        return list;
    }



















    //商品添加
    /*@RequestMapping("/add")
    public Result add(@RequestBody GoodsVo vo){
        try {
            //商家ID 主键
            String name = SecurityContextHolder.getContext().getAuthentication().getName();
            vo.getGoods().setSellerId(name);
            goodsService.add(vo);
            return new Result(true,"成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"失败");
        }
    }
    //商品添加
    @RequestMapping("/update")
    public Result update(@RequestBody GoodsVo vo){
        try {


            goodsService.update(vo);
            return new Result(true,"成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"失败");
        }
    }*/


}
