package com.example.abhishek.carapplication1;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.widget.TextView;

public class GridItem1Display extends AppCompatActivity {
    TextView bt,pt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_item1_display);
        bt=(TextView)findViewById(R.id.griddata1);
        pt=(TextView)findViewById(R.id.griddata2);
        manageBlinkEffect();
        manageBlinkEffect1();
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
