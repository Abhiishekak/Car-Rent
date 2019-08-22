package com.example.abhishek.carapplication1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class addcar extends AppCompatActivity {
Button addcars;
EditText name,contact,fromloc,toloc,carreg;
    DatabaseHelper myDb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addcar);
        name=findViewById(R.id.etname);
        contact=findViewById(R.id.etcontact);
        fromloc=findViewById(R.id.etfromloc);
        myDb=new DatabaseHelper(this);
        toloc=findViewById(R.id.ettoloc);
        carreg=findViewById(R.id.etreg);
        addcars=findViewById(R.id.btadd);
        addcars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (name.getText().toString().isEmpty() || contact.getText().toString().isEmpty() || fromloc.getText().toString().isEmpty() || toloc.getText().toString().isEmpty() || carreg.getText().toString().isEmpty()) {
                    Toast.makeText(addcar.this, "ENTER ALL FIELDS", Toast.LENGTH_SHORT).show();
                } else {
                    boolean isInserted = myDb.insertData(name.getText().toString(), contact.getText().toString(), fromloc.getText().toString(), toloc.getText().toString(), carreg.getText().toString());


                    if (isInserted == true) {
                        Toast.makeText(addcar.this, "DATA INSERTED", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(addcar.this, "ERROR OCCURRED", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
