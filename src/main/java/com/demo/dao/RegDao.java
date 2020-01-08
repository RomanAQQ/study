package com.demo.dao;

import com.demo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;


@Mapper
@Component
public interface RegDao {
    @Insert("insert into user value(null,#{username},#{password},#{age})")
    void insert(User user);

    //@Select("select * from user where id=#{id}")
    User select(Integer id);
}
