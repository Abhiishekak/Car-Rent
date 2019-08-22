package com.example.abhishek.carapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String src,dest,mangalore,bangalore,dharmasthala,udupi,kolar,mysore,shivamogga,karwar,hubli,dharwad,mandya;
    EditText from,to,date;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        from=(EditText)findViewById(R.id.editText);
        to=(EditText)findViewById(R.id.editText2);

        btn=(Button)findViewById(R.id.button2);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                src=from.getText().toString();
                dest=to.getText().toString();
                if(src.isEmpty()||dest.isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter all details", Toast.LENGTH_SHORT).show();

                }else if(src.equalsIgnoreCase("mangalore")&&dest.equalsIgnoreCase("bangalore")){
                   startActivity(new Intent(MainActivity.this, MainActivity3.class));

                    /*intent.putExtra("From",src);
                    intent.putExtra("To",dest);
                    startActivity(intent1);*/

                }
                else if(src.equalsIgnoreCase("mangalore")&&dest.equalsIgnoreCase("dharmasthala")){
                    startActivity(new Intent(MainActivity.this, MainActivity4.class));
                }
                else if(src.equalsIgnoreCase("mangalore")&&dest.equalsIgnoreCase("udupi")){
                    startActivity(new Intent(MainActivity.this, MainActivity5.class));
                }
                else if(src.equalsIgnoreCase("mangalore")&&dest.equalsIgnoreCase("kolar")){
                    startActivity(new Intent(MainActivity.this, MainActivity6.class));
                }
                else if(src.equalsIgnoreCase("mangalore")&&dest.equalsIgnoreCase("mysore")){
                    startActivity(new Intent(MainActivity.this, MainActivity7.class));
                }
                else if(src.equalsIgnoreCase("mangalore")&&dest.equalsIgnoreCase("shivamogga")){
                   startActivity(new Intent(MainActivity.this, MainActivity8.class));
                }

                else if(src.equalsIgnoreCase("mangalore")&&dest.equalsIgnoreCase("karwar")){
                    startActivity(new Intent(MainActivity.this, MainActivity9.class));
                }
                else if(src.equalsIgnoreCase("mangalore")&&dest.equalsIgnoreCase("hubli")){
                    startActivity(new Intent(MainActivity.this, MainActivity10.class));
                }
                else if(src.equalsIgnoreCase("mangalore")&&dest.equalsIgnoreCase("dharwad")){
                    startActivity(new Intent(MainActivity.this, MainActivity11.class));
                }
                else if(src.equalsIgnoreCase("mangalore")&&dest.equalsIgnoreCase("mandya")){
                    startActivity(new Intent(MainActivity.this, MainActivity12.class));
                }

                else{
                    Toast.makeText(MainActivity.this, "No cars available", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}
