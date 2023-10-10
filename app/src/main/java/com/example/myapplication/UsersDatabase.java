package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class UsersDatabase {
    /*
        This is a mock database class were I create data
     */
    private final List<Login> logins = new ArrayList<>();

    public UsersDatabase(){
        initialize();
    }

    private void initialize(){
        Login user1 = new Login("sondos", "free");
        Login user2 = new Login("rama", "palestine");

        logins.add(user1);
        logins.add(user2);
    }

    public boolean authenticate(String email, String password){
        /*
            This method will check if the email and password exists in the hash
            then it will return true else false
         */
        Login user = new Login(email, password);
        return getLogins().contains(user);
    }

    public List<Login> getLogins() {
        return logins;
    }
}
