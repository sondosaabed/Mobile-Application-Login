package com.example.myapplication;

public class Login {
    /*
        Fields
     */
    private String email;
    private String password;

    public Login(String email, String password){
        setEmail(email);
        setPassword(password);
    }

    /*
    Getters and Setters
     */

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
