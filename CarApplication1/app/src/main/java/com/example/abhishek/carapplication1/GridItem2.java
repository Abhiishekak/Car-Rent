package com.example.abhishek.carapplication1;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;

public class GridItem2 extends AppCompatActivity implements View.OnClickListener {
    TextView name;
    TextView cap,cost;
    ImageView image;
    //EditText date,time;
    Button btn1;
    String dat,tim;
    Button btnDatePicker, btnTimePicker;
    EditText txtDate, txtTime;
    private int mYear, mMonth, mDay, mHour, mMinute;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_item2);
        name=findViewById(R.id.griddata);
        image=findViewById(R.id.imageview);
        cap=findViewById(R.id.textView3);
        cost=findViewById(R.id.textView4);

        btnDatePicker=(Button)findViewById(R.id.btn_date);
        btnTimePicker=(Button)findViewById(R.id.btn_time);
        txtDate=(EditText)findViewById(R.id.in_date);
        txtTime=(EditText)findViewById(R.id.in_time);

        btnDatePicker.setOnClickListener(this);
        btnTimePicker.setOnClickListener(this);
        btn1=findViewById(R.id.button);
        Intent intent=getIntent();
        name.setText(intent.getStringExtra("name"));

        image.setImageResource(intent.getIntExtra("image",0));
        cap.setText(intent.getStringExtra("capacity"));
        cost.setText(intent.getStringExtra("cost"));



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dat=txtDate.getText().toString();
                tim=txtTime.getText().toString();
                if(dat.isEmpty()||tim.isEmpty()){
                    Toast.makeText(GridItem2.this, "Fill All Details", Toast.LENGTH_SHORT).show();
                }else {
                    startActivity(new Intent(getApplicationContext(), GridItem1Display.class));
                }

            }
        });
    }

    @Override
    public void onClick(View v) {
        if (v == btnDatePicker) {

            // Get Current Date
            final Calendar c = Calendar.getInstance();
            mYear = c.get(Calendar.YEAR);
            mMonth = c.get(Calendar.MONTH);
            mDay = c.get(Calendar.DAY_OF_MONTH);


            final DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {

                        @Override
                        public void onDateSet(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {


                            txtDate.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                        }
                    }, mYear, mMonth, mDay);
            datePickerDialog.show();
        }
        if (v == btnTimePicker) {

            // Get Current Time
            final Calendar c = Calendar.getInstance();
            mHour = c.get(Calendar.HOUR_OF_DAY);
            mMinute = c.get(Calendar.MINUTE);

            // Launch Time Picker Dialog
            TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                    new TimePickerDialog.OnTimeSetListener() {

                        @Override
                        public void onTimeSet(TimePicker view, int hourOfDay,
                                              int minute) {

                            txtTime.setText(hourOfDay + ":" + minute);
                        }
                    }, mHour, mMinute, false);
            timePickerDialog.show();
        }
    }


}

