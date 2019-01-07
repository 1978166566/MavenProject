package com.cssl.service;

import com.cssl.dao.UsersDao;
import com.cssl.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class StudentService {

    @Autowired(required = false)
    private UsersDao usersDao;


   /* @Cacheable(value = "stu",key="#id",unless = "#result==null")*/
    public Student getStudent(int id){
        System.out.println("进入这个方法了");
        return usersDao.selectAll(id);
    }

}
