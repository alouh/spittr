package com.youotech.bean;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SpitterBean {

    @NotNull
    @Size(min = 2,max = 3)
    private String firstName;
    @NotNull
    @Size(min = 1,max = 3)
    private String lastName;
    @NotNull
    @Size(min = 2,max = 3)
    private String userName;
    @NotNull
    @Size(min = 1,max = 3)
    private String password;

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
