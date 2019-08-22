package com.example.abhishek.carapplication1;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class fourthactivity extends AppCompatActivity {

   // String passed_value;
    //TextView username_textview;
    String[] mobilearray = {"MANGALORE TO BANGALORE", "MANGALORE TO DHARMASTHALA", "MANGALORE TO UDUPI", "MANGALORE TO KOLAR","MANGALORE TO MYSORE","MANGALORE TO SHIVMOGGA","MANGALORE TO KARWAR","MANGALORE TO HUBLI","MANGALORE TO DHARWAD","MANGALORE TO MANDYA"};
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourthactivity);

        listview = findViewById(R.id.list_item);






        ArrayAdapter ad = new ArrayAdapter<String>(this, R.layout.list_row_item, mobilearray);
        listview.setAdapter(ad);


    }
    }
