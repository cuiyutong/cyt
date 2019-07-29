package com.example.demo.controller;

import com.example.demo.entity.People;
import com.example.demo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * Created by cuiyutong on 2019-07-24.
 */
@RestController
public class StudentController {
    @Autowired
    private IStudentService iStudentService;
    @RequestMapping("login")
    public int login(@RequestBody People people){
        People peo=iStudentService.findOnePeople(people);
        return  1;
    }
}
