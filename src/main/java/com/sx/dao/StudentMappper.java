package com.sx.dao;

import com.sx.pojo.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMappper {

    public int insertStu(Student student);
}
