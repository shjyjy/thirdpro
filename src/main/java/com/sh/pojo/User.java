package com.sh.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {
    private int userId;
    private String loginName;
    private String password;
    private int state;
    private Date createTime;
    private String realname;



}
