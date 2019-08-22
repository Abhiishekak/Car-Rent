package com.example.abhishek.carapplication1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
public class admin extends AppCompatActivity {
    Button login;
    EditText  username_edttxt,password_edttxt;
    String userName,password;
    String correct_pass,correct_user;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        login=findViewById(R.id.login_button);
        username_edttxt=findViewById(R.id.editText5);
        password_edttxt=findViewById(R.id.passwd);
        correct_user="abc";
        correct_pass="123";
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //button click action
                userName=username_edttxt.getText().toString();
                password=password_edttxt.getText().toString();
                //Toast.makeText(MainActivity.this, userName+" "+password, Toast.LENGTH_SHORT).show();shows user name and password
                //authentication
                if(userName.equals(correct_user)&&password.equals(correct_pass))
                {
                    //connecting one activity to another
                    Intent intent=new Intent(admin.this,com.example.abhishek.carapplication1.Actions.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(admin.this, "invalid username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
