package org.crazyit.boot.c10.config;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String userName;
    
    private String sex;
    
    
    public User() {
        super();
    }

    public User(String userName, String sex) {
        this.userName = userName;
        this.sex = sex;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    
}
