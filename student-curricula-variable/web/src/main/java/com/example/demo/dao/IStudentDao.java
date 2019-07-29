package com.example.demo.dao;

import com.example.demo.entity.People;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by cuiyutong on 2019-07-24.
 */
@Mapper
@Repository
public interface IStudentDao {
    @Select("select * FROM people where NAME =#{name}")
    People selectOnePeople(People people);
}
