package com.sh.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Permission implements Serializable {
    private int permissionid;
    private String pername;
    private String menuname;
    private String menutype;
    private String menuurl;
    private String menucode;
    private String parentcode;
    private String perdesc;
    private String ifvilid;
}
