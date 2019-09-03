package com.sx.service;

import com.sx.dao.StudentMappper;
import com.sx.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentMappper studentMappper;

    public int saveStu(Student student){
        int b=studentMappper.insertStu(student);
        int a=9/0;
      return  b;
    }

}
