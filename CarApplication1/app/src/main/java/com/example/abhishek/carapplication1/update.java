package com.example.abhishek.carapplication1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class update extends AppCompatActivity {
    Button addcar;
    EditText id,name,contact,fromloc,toloc,carreg;
    DatabaseHelper myDb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        id=findViewById(R.id.etid);
        name=findViewById(R.id.etname);
        contact=findViewById(R.id.etcontact);
        fromloc=findViewById(R.id.etfromloc);
        toloc=findViewById(R.id.ettoloc);
        carreg=findViewById(R.id.etreg);
        addcar=findViewById(R.id.btadd);
        myDb=new DatabaseHelper(this);
        addcar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                if(id.getText().toString().isEmpty()||name.getText().toString().isEmpty() || contact.getText().toString().isEmpty()||fromloc.getText().toString().isEmpty() ||toloc.getText().toString().isEmpty()|| carreg.getText().toString().isEmpty() )
                {
                    Toast.makeText(update.this, "ENTER ALL FIELDS", Toast.LENGTH_SHORT).show();
                }
                else{
                    boolean isUpdated= myDb.updateData(id.getText().toString(),name.getText().toString(),contact.getText().toString(),fromloc.getText().toString(),toloc.getText().toString(),carreg.getText().toString());


                if (isUpdated==true){
                    Toast.makeText(update.this, "DATA UPDATED", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(update.this, "ERROR OCCURRED", Toast.LENGTH_SHORT).show();
                }
            }
            }
        });
    }
}
