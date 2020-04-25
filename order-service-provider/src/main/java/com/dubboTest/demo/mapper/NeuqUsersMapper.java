package com.dubboTest.demo.mapper;

import com.dubboTest.demo.entity.NeuqUsers;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NeuqUsersMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(NeuqUsers record);

    NeuqUsers selectByPrimaryKey(Integer userId);

    List<NeuqUsers> selectAll();

    int updateByPrimaryKey(NeuqUsers record);
}