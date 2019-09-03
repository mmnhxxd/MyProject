package com.sx.controller;

import com.sx.pojo.Student;
import com.sx.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/regist")
    public ModelAndView regist(Student student,ModelAndView mav){
        System.out.println("student:::"+student);

        int i = studentService.saveStu(student);

        System.out.println("i:::"+i);

        System.out.println("student::::::"+student);

        mav.setViewName("success.jsp");
        return mav;
    }
}
