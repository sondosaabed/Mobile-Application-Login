package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.HashMap;

/*
    In this class I handle the main activity, it will perform login functionality
    based on a hashmap created here
 */
public class MainActivity extends AppCompatActivity{
    /*
        Fields
    */
    private Button login;
    private TextView email;
    private TextView password;
    private TextView answer; // I will use it to display the answer

    // I use it to store logins key is the email and the password is the value
    private final HashMap<String, String> logins = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
        handle_login(getLogin());
    }

    public void initialize(){
        /*
            Getting the variables in the scene
         */
        setLogin(findViewById(R.id.btnLogin));
        setEmail(findViewById(R.id.email));
        setPassword(findViewById(R.id.password));
        setAnswer(findViewById(R.id.txtResult));
        /*
            I added some examples to the logins hashmap
         */
        logins.put("sondos", "free");
        logins.put("rama", "palestine");
    }

    /*
        Handlers
     */
    private void handle_login(Button login) {
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (authenticate(getEmail().getText().toString(), getPassword().getText().toString())== true){
                    /*
                        Login successfully
                     */

                    getAnswer().setText("Successful!");
                }else {
                    /*
                        Wrong authentication
                     */
                    getAnswer().setText("Try Again!");
                }
            }
        });
    }

    private boolean authenticate(String email, String password){
        /*
            This method will check if the email and password exists in the hash
            then it will return true else false
         */
        if(logins.containsKey(email) && logins.get(email).equals(password)){
            return true;
        }else {
            return false;
        }
    }

    /*
        Getters and Setters
     */
    public Button getLogin() {
        return login;
    }

    public void setLogin(Button login) {
        this.login = login;
    }

    public TextView getEmail() {
        return email;
    }

    public void setEmail(TextView email) {
        this.email = email;
    }

    public TextView getPassword() {
        return password;
    }

    public void setPassword(TextView password) {
        this.password = password;
    }

    public HashMap<String, String> getLogins() {
        return logins;
    }

    public TextView getAnswer() {
        return answer;
    }

    public void setAnswer(TextView answer) {
        this.answer = answer;
    }
}