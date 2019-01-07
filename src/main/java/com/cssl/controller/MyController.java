package com.cssl.controller;

import com.cssl.pojo.Student;
import com.cssl.service.StudentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class MyController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/selectAll")
    public String selectAll(Model model,Integer id) {

        System.out.println(studentService.getStudent(id));
        Student stu=studentService.getStudent(id);

        model.addAttribute("stu",stu);
        return "s123";
    }


}
