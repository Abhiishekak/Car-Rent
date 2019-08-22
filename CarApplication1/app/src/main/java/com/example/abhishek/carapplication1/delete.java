package com.example.abhishek.carapplication1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class delete extends AppCompatActivity {
    DatabaseHelper myDb;
    Button delcar;
    EditText id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);

        myDb=new DatabaseHelper(this);
        id=findViewById(R.id.etid);
        delcar = findViewById(R.id.btdel);

        delcar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer deletedRows = myDb.deleteData(id.getText().toString());
                if(id.getText().toString().isEmpty())
                {
                    Toast.makeText(delete.this, "ENTER ALL FIELDS", Toast.LENGTH_SHORT).show();
                }
                else {
                    if (deletedRows > 0) {
                        Toast.makeText(delete.this, "DATA DELETED", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(delete.this, "ERROR", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }

}

