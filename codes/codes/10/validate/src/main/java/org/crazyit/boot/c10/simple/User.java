package org.crazyit.boot.c10.simple;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class User {

    @NotBlank(message = "{user.name.notBlank}")
    private String name;
    
    @Email(message = "{user.email}")
    private String email;
    
    @Size(min = 6, message = "{user.passwd.size}")
    private String passwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    
}
