package com.example.abhishek.carapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class GridItem1 extends AppCompatActivity {
        TextView name;
        TextView cap,cost;
        ImageView image;
        EditText date,time;
        Button btn1;
        String dat,tim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_item1);
        name=findViewById(R.id.griddata);
        image=findViewById(R.id.imageview);
       cap=findViewById(R.id.textView3);
        cost=findViewById(R.id.textView4);
        date=findViewById(R.id.date);
        time=findViewById(R.id.time);

        btn1=findViewById(R.id.button3);
        Intent intent=getIntent();
        name.setText(intent.getStringExtra("name"));

        image.setImageResource(intent.getIntExtra("image",0));
        cap.setText(intent.getStringExtra("capacity"));
        cost.setText(intent.getStringExtra("cost"));



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dat=date.getText().toString();
                tim=time.getText().toString();
                if(dat.isEmpty()||tim.isEmpty()){
                    Toast.makeText(GridItem1.this, "Fill All Details", Toast.LENGTH_SHORT).show();
                }else {
                    startActivity(new Intent(getApplicationContext(), GridItem1Display.class));
                }

            }
        });
    }
}
