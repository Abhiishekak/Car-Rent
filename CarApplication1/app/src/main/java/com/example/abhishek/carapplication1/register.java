package com.example.abhishek.carapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class register extends AppCompatActivity {

    EditText Email, Password, Name,Phone;
    Button Register;

    SQLiteHelper sqLiteHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Register = (Button) findViewById(R.id.btreg);

        Email = (EditText) findViewById(R.id.etmail);
        Password = (EditText) findViewById(R.id.etpass);
        Name = (EditText) findViewById(R.id.etname);
        Phone= (EditText) findViewById(R.id.etphone);

        sqLiteHelper = new SQLiteHelper(this);

        // Adding click listener to register button.
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (Name.getText().toString().isEmpty() || Email.getText().toString().isEmpty() || Password.getText().toString().isEmpty() || Phone.getText().toString().isEmpty()) {
                    Toast.makeText(register.this, "ENTER ALL FIELDS", Toast.LENGTH_SHORT).show();
                } else {
                    boolean isInserted = sqLiteHelper.insertData(Name.getText().toString(), Email.getText().toString(), Password.getText().toString(), Phone.getText().toString());


                    if (isInserted == true) {

                        Toast.makeText(register.this, "DATA SAVED .... CONTINUE", Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(register.this,MainActivity.class);
                        startActivity(intent);

                    } else {
                        Toast.makeText(register.this, "ERROR OCCURRED", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
    private boolean validateEmail()
    {
        String emailInput=Email.getEditableText().toString().trim();
        if(emailInput.isEmpty()){
            Email.setError("Field can't be Empty");
            return false;
        }
        else if(!Patterns.EMAIL_ADDRESS.matcher(emailInput).matches()){
            Email.setError("Please Enter a valid Email Address");
            return false;
        }
        else
        {
            Email.setError(null);
            return true;
        }

    }


}