package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class yonler3 extends AppCompatActivity {



    Button button25;
    Button button26;
    Button button27;
    Button button28;

    LottieAnimationView lottieAnimationView31;
    LottieAnimationView lottieAnimationView12;
    LottieAnimationView lottieAnimationView15;
    LottieAnimationView lottieAnimationView16;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yonler3);

        lottieAnimationView31=findViewById(R.id.lottieAnimationView31);
        lottieAnimationView12=findViewById(R.id.lottieAnimationView12);
        lottieAnimationView15=findViewById(R.id.lottieAnimationView15);
        lottieAnimationView16=findViewById(R.id.lottieAnimationView16);

        button25=findViewById(R.id.button25);
        button26=findViewById(R.id.button26);
        button27=findViewById(R.id.button27);
        button28=findViewById(R.id.button28);

        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                lottieAnimationView16.setVisibility(View.VISIBLE);
                lottieAnimationView12.setVisibility(View.GONE);
                lottieAnimationView15.setVisibility(View.GONE);
                lottieAnimationView31.setVisibility(View.GONE);
                lottieAnimationView16.playAnimation();

            }
        });
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lottieAnimationView16.setVisibility(View.GONE);
                lottieAnimationView12.setVisibility(View.VISIBLE);
                lottieAnimationView15.setVisibility(View.GONE);
                lottieAnimationView31.setVisibility(View.GONE);
                lottieAnimationView12.playAnimation();

            }
        });
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                lottieAnimationView16.setVisibility(View.GONE);
                lottieAnimationView12.setVisibility(View.GONE);
                lottieAnimationView15.setVisibility(View.VISIBLE);
                lottieAnimationView31.setVisibility(View.GONE);
                lottieAnimationView15.playAnimation();
            }
        });
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                lottieAnimationView16.setVisibility(View.GONE);
                lottieAnimationView12.setVisibility(View.GONE);
                lottieAnimationView15.setVisibility(View.GONE);
                lottieAnimationView31.setVisibility(View.VISIBLE);
                lottieAnimationView31.playAnimation();
            }
        });

    }
    public void yonler4gecis(View view){
        Intent intent=new Intent(yonler3.this,yonler4.class);
        startActivity(intent);

    }
}