package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class mevsimler8 extends AppCompatActivity {

    public boolean yazclicked22 = false;
    public boolean yazclicked23 = false;
    public boolean yazclicked24 = false;
    public boolean yazclicked20 = false;
    public boolean yazclicked26 = false;
    public boolean yazclicked28 = false;
    public boolean yazclicked29 = false;
    public boolean yazclicked30 = false;
    public boolean yazclicked31 = false;
    public boolean yazclicked32 = false;
    public boolean yazclicked33 = false;
    public boolean yazclicked34 = false;


    static int yazSkor = 0;

    LottieAnimationView lottieAnimationView;
    LottieAnimationView lottieAnimationView1;
    LottieAnimationView lottieAnimationView2;
    LottieAnimationView lottieAnimationView3;
    LottieAnimationView lottieAnimationView4;
    LottieAnimationView lottieAnimationView5;
    LottieAnimationView lottieAnimationView6;
    LottieAnimationView lottieAnimationView7;
    LottieAnimationView lottieAnimationView8;
    LottieAnimationView lottieAnimationView9;
    LottieAnimationView lottieAnimationView10;
    LottieAnimationView lottieAnimationView11;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mevsimler8);

        lottieAnimationView=findViewById(R.id.lottieAnimationView);
        lottieAnimationView1=findViewById(R.id.lottieAnimationView1);
        lottieAnimationView2=findViewById(R.id.lottieAnimationView2);
        lottieAnimationView3=findViewById(R.id.lottieAnimationView3);
        lottieAnimationView4=findViewById(R.id.lottieAnimationView4);
        lottieAnimationView5=findViewById(R.id.lottieAnimationView5);
        lottieAnimationView6=findViewById(R.id.lottieAnimationView6);
        lottieAnimationView7=findViewById(R.id.lottieAnimationView7);
        lottieAnimationView8=findViewById(R.id.lottieAnimationView8);
        lottieAnimationView9=findViewById(R.id.lottieAnimationView9);
        lottieAnimationView10=findViewById(R.id.lottieAnimationView10);
        lottieAnimationView11=findViewById(R.id.lottieAnimationView11);

        ImageView imageView20 = findViewById(R.id.imageView20);
        ImageView imageView22 = findViewById(R.id.imageView22);
        ImageView imageView23 = findViewById(R.id.imageView23);
        ImageView imageView24 = findViewById(R.id.imageView24);
        ImageView imageView26 = findViewById(R.id.imageView26);
        ImageView imageView28 = findViewById(R.id.imageView28);
        ImageView imageView29 = findViewById(R.id.imageView29);
        ImageView imageView30 = findViewById(R.id.imageView30);
        ImageView imageView31 = findViewById(R.id.imageView31);
        ImageView imageView32 = findViewById(R.id.imageView32);
        ImageView imageView33 = findViewById(R.id.imageView33);
        ImageView imageView34 = findViewById(R.id.imageView34);


        lottieAnimationView.cancelAnimation();
        lottieAnimationView1.cancelAnimation();
        lottieAnimationView2.cancelAnimation();
        lottieAnimationView3.cancelAnimation();
        lottieAnimationView4.cancelAnimation();
        lottieAnimationView5.cancelAnimation();
        lottieAnimationView6.cancelAnimation();
        lottieAnimationView7.cancelAnimation();
        lottieAnimationView8.cancelAnimation();
        lottieAnimationView9.cancelAnimation();
        lottieAnimationView10.cancelAnimation();
        lottieAnimationView11.cancelAnimation();




        imageView22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!yazclicked22){
                    lottieAnimationView1.setSpeed(1);
                    lottieAnimationView1.playAnimation();
                    yazclicked22=true;
                }
                else{
                    lottieAnimationView1.setSpeed(-1);
                    lottieAnimationView1.playAnimation();
                    yazclicked22=false;
                }
            }
        });
        imageView20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!yazclicked20){
                    lottieAnimationView.setSpeed(1);
                    lottieAnimationView.playAnimation();
                    yazclicked20=true;
                }
                else{
                    lottieAnimationView.setSpeed(-1);
                    lottieAnimationView.playAnimation();
                    yazclicked20=false;
                }
            }
        });
        imageView23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!yazclicked23){
                    lottieAnimationView2.setSpeed(1);
                    lottieAnimationView2.playAnimation();
                    yazclicked23=true;
                }
                else{
                    lottieAnimationView2.setSpeed(-1);
                    lottieAnimationView2.playAnimation();
                    yazclicked23=false;
                }
            }
        });
        imageView24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!yazclicked24){
                    lottieAnimationView11.setSpeed(1);
                    lottieAnimationView11.playAnimation();
                    yazclicked24=true;
                }
                else{
                    lottieAnimationView11.setSpeed(-1);
                    lottieAnimationView11.playAnimation();
                    yazclicked24=false;
                }
            }
        });
        imageView26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!yazclicked26){
                    lottieAnimationView10.setSpeed(1);
                    lottieAnimationView10.playAnimation();
                    yazclicked26=true;
                }
                else{
                    lottieAnimationView10.setSpeed(-1);
                    lottieAnimationView10.playAnimation();
                    yazclicked26=false;
                }
            }
        });
        imageView28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!yazclicked28){
                    lottieAnimationView9.setSpeed(1);
                    lottieAnimationView9.playAnimation();
                    yazclicked28=true;
                }
                else{
                    lottieAnimationView9.setSpeed(-1);
                    lottieAnimationView9.playAnimation();
                    yazclicked28=false;
                }
            }
        });
        imageView29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!yazclicked29){
                    lottieAnimationView8.setSpeed(1);
                    lottieAnimationView8.playAnimation();
                    yazclicked29=true;
                }
                else{
                    lottieAnimationView8.setSpeed(-1);
                    lottieAnimationView8.playAnimation();
                    yazclicked29=false;
                }
            }
        });
        imageView30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!yazclicked30){
                    lottieAnimationView7.setSpeed(1);
                    lottieAnimationView7.playAnimation();
                    yazclicked30=true;
                }
                else{
                    lottieAnimationView7.setSpeed(-1);
                    lottieAnimationView7.playAnimation();
                    yazclicked30=false;
                }
            }
        });
        imageView31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!yazclicked31){
                    lottieAnimationView3.setSpeed(1);
                    lottieAnimationView3.playAnimation();
                    yazclicked31=true;
                }
                else{
                    lottieAnimationView3.setSpeed(-1);
                    lottieAnimationView3.playAnimation();
                    yazclicked31=false;
                }
            }
        });
        imageView32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!yazclicked32){
                    lottieAnimationView5.setSpeed(1);
                    lottieAnimationView5.playAnimation();
                    yazclicked32=true;
                }
                else{
                    lottieAnimationView5.setSpeed(-1);
                    lottieAnimationView5.playAnimation();
                    yazclicked32=false;
                }
            }
        });
        imageView33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!yazclicked33){
                    lottieAnimationView4.setSpeed(1);
                    lottieAnimationView4.playAnimation();
                    yazclicked33=true;
                }
                else{
                    lottieAnimationView4.setSpeed(-1);
                    lottieAnimationView4.playAnimation();
                    yazclicked33=false;
                }
            }
        });
        imageView34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!yazclicked34){
                    lottieAnimationView6.setSpeed(1);
                    lottieAnimationView6.playAnimation();
                    yazclicked34=true;
                }
                else{
                    lottieAnimationView6.setSpeed(-1);
                    lottieAnimationView6.playAnimation();
                    yazclicked34=false;
                }
            }
        });


    }


    public void yazSkorBelirle(View view){
        if(yazclicked20){
            yazSkor--;
        }
        if(yazclicked22){
            yazSkor--;
        }
        if(yazclicked23){
            yazSkor--;
        }
        if(yazclicked24){
            yazSkor--;
        }
        if(yazclicked26){
            yazSkor++;
        }
        if(yazclicked28){
            yazSkor--;
        }
        if(yazclicked29){
            yazSkor--;
        }
        if(yazclicked30){
            yazSkor++;
        }
        if(yazclicked31){
            yazSkor++;
        }
        if(yazclicked32){
            yazSkor--;
        }
        if(yazclicked33){
            yazSkor--;
        }
        if(yazclicked34){
            yazSkor--;
        }
        Intent intent=new Intent(mevsimler8.this,mevsimler9.class);
        startActivity(intent);
    }


}