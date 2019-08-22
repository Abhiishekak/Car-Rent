package com.example.abhishek.carapplication1;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;

import static android.view.View.*;

public class secondActivity extends AppCompatActivity {
    Button ac;
    Button d;
    Button admin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ac=(Button)findViewById(R.id.button6);
        d=(Button)findViewById(R.id.button4);
        admin=(Button)findViewById(R.id.button5) ;

        ac.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(secondActivity.this ,thirdActivity.class);
                startActivity(intent);
        }

    });

        d.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(secondActivity.this ,fourthactivity.class);
                startActivity(i);
            }
        });
        admin.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(secondActivity.this ,admin.class);
                startActivity(i);

            }
        });

}
}
