package com.abolkog.springboot.tut.security;

/**
 * @author Khalid Elshafie <abolkog@gmail.com>
 * @Created 10/10/2018 10:26 PM.
 */
public class SignInRequest {

    private String username;
    private String password;

    public SignInRequest() {
    }

    public SignInRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
