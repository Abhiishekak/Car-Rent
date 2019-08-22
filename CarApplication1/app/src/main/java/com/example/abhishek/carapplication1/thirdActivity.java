package com.example.abhishek.carapplication1;


import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;

import java.security.PrivateKey;

import static android.view.animation.Animation.*;

public class thirdActivity extends AppCompatActivity {
    TextView bt,pt;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        bt=(TextView)findViewById(R.id.textView2);
        pt=(TextView)findViewById(R.id.textView9);
        btn=(Button)findViewById(R.id.button3);
        manageBlinkEffect();
        manageBlinkEffect1();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(thirdActivity.this,register.class);
                startActivity(i);
            }
        });

    }

    public void manageBlinkEffect() {
        ObjectAnimator anim= ObjectAnimator.ofInt(bt, "backgroundColor", Color.WHITE, Color.RED, Color.WHITE);
        anim.setDuration(800);
        anim.setEvaluator(new ArgbEvaluator());

        anim.setRepeatCount(Animation.INFINITE);
        anim.start();
    }
    public void manageBlinkEffect1() {
        ObjectAnimator anim= ObjectAnimator.ofInt(pt, "backgroundColor", Color.WHITE, Color.YELLOW, Color.WHITE);
        anim.setDuration(800);
        anim.setEvaluator(new ArgbEvaluator());

        anim.setRepeatCount(Animation.INFINITE);
        anim.start();
    }
}
