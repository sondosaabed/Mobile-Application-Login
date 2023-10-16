package com.example.myapplication;

import java.util.Objects;

public class Login {
    /*
        Fields
     */
    private String email;
    private String password;

    public Login(String email, String password) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Login)) return false;
        Login login = (Login) o;
        return Objects.equals(email, login.email) && Objects.equals(password, login.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, password);
    }
}
