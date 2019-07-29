package com.example.demo.service;

import com.example.demo.dao.IStudentDao;
import com.example.demo.entity.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by cuiyutong on 2019-07-24.
 */
@Service
public class StudentServiceImpl implements  IStudentService {
    @Autowired
    IStudentDao iStudentDao;
    @Override
    public People findOnePeople(People people) {

        return iStudentDao.selectOnePeople(people);
    }
}
