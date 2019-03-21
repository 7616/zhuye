package com.it.mapper;


import com.it.pojo.Essay;

import java.util.List;

public interface EssayDao {


    List<Essay> selectAll();


}