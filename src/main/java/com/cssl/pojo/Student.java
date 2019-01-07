package com.cssl.pojo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
public class Student implements Serializable {
    private Integer sid;
    private String sname;
    private Date sdata;

}

