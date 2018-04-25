package com.example.macstudent.c0727944_carservicereminder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends Activity {

    TextView username;
    TextView password;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (TextView) findViewById(R.id.username);
        password = (TextView) findViewById(R.id.password);
        btnlogin = (Button) findViewById(R.id.btnlogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(TextUtils.isEmpty(username.getText()) || username.getText().toString().length() == 0) {
                    username.setError("Please Enter User Name");
                } else {
                    if (username.getText().toString().equals("user1@carservice.com") && password.getText().toString().equals("s3cr3t")) {
                        Toast.makeText(LoginActivity.this, "User Successfully logged in ", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(LoginActivity.this, "UserID/passwords invalid", Toast.LENGTH_LONG).show();

                    }
                }
            }
        });

    }

}