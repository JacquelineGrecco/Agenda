package com.example.jacqueline.estapoint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.jacqueline.estapoint.helpers.RegisterHelper;
import com.example.jacqueline.estapoint.model.User;

public class RegisterActivity extends AppCompatActivity {

    public static final String TITLE_APPBAR = "Register New User";
    private RegisterHelper helper;
    //private final UserDAO Udao = new UserDAO();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        setTitle(TITLE_APPBAR);

        helper    = new RegisterHelper(this);
        User user = (User) getIntent().getSerializableExtra("user");

        if (user != null)
            helper.fillForm(user);
    }


    private void salveNewUser(){
        Button salve = findViewById(R.id.form_register_button);
        salve.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                User user = new User();
              //  Udao.insert(user);
            }

        });

    }
}
