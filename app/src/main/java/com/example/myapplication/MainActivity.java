package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

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
    private UsersDatabase database;

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
        setDatabase(new UsersDatabase());
    }

    /*
        Handlers
     */
    private void handle_login(Button login) {
        login.setOnClickListener(view -> {
            /*
                    Login successfully
                 */
            /*
                    Wrong authentication
                 */
            getAnswer().setText(getDatabase().authenticate(getEmail().getText().toString(), getPassword().getText().toString()) ? "Successful!" : "Try Again!");
        });
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

    public TextView getAnswer() {
        return answer;
    }

    public void setAnswer(TextView answer) {
        this.answer = answer;
    }

    public UsersDatabase getDatabase() {
        return database;
    }

    public void setDatabase(UsersDatabase database) {
        this.database = database;
    }
}