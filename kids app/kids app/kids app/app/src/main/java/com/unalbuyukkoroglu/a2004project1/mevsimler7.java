package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class mevsimler7 extends AppCompatActivity {

    public boolean ilkbaharclicked22 = false;
    public boolean ilkbaharclicked23 = false;
    public boolean ilkbaharclicked24 = false;
    public boolean ilkbaharclicked20 = false;
    public boolean ilkbaharclicked26 = false;
    public boolean ilkbaharclicked28 = false;
    public boolean ilkbaharclicked29 = false;
    public boolean ilkbaharclicked30 = false;
    public boolean ilkbaharclicked31 = false;
    public boolean ilkbaharclicked32 = false;
    public boolean ilkbaharclicked33 = false;
    public boolean ilkbaharclicked34 = false;


    static int ilkbaharSkor = 0;

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
        setContentView(R.layout.activity_mevsimler7);

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




        imageView22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!ilkbaharclicked22){
                    lottieAnimationView1.setSpeed(1);
                    lottieAnimationView1.playAnimation();
                    ilkbaharclicked22=true;
                }
                else{
                    lottieAnimationView1.setSpeed(-1);
                    lottieAnimationView1.playAnimation();
                    ilkbaharclicked22=false;
                }
            }
        });
        imageView20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!ilkbaharclicked20){
                    lottieAnimationView.setSpeed(1);
                    lottieAnimationView.playAnimation();
                    ilkbaharclicked20=true;
                }
                else{
                    lottieAnimationView.setSpeed(-1);
                    lottieAnimationView.playAnimation();
                    ilkbaharclicked20=false;
                }
            }
        });
        imageView23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!ilkbaharclicked23){
                    lottieAnimationView2.setSpeed(1);
                    lottieAnimationView2.playAnimation();
                    ilkbaharclicked23=true;
                }
                else{
                    lottieAnimationView2.setSpeed(-1);
                    lottieAnimationView2.playAnimation();
                    ilkbaharclicked23=false;
                }
            }
        });
        imageView24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!ilkbaharclicked24){
                    lottieAnimationView11.setSpeed(1);
                    lottieAnimationView11.playAnimation();
                    ilkbaharclicked24=true;
                }
                else{
                    lottieAnimationView11.setSpeed(-1);
                    lottieAnimationView11.playAnimation();
                    ilkbaharclicked24=false;
                }
            }
        });
        imageView26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!ilkbaharclicked26){
                    lottieAnimationView10.setSpeed(1);
                    lottieAnimationView10.playAnimation();
                    ilkbaharclicked26=true;
                }
                else{
                    lottieAnimationView10.setSpeed(-1);
                    lottieAnimationView10.playAnimation();
                    ilkbaharclicked26=false;
                }
            }
        });
        imageView28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!ilkbaharclicked28){
                    lottieAnimationView9.setSpeed(1);
                    lottieAnimationView9.playAnimation();
                    ilkbaharclicked28=true;
                }
                else{
                    lottieAnimationView9.setSpeed(-1);
                    lottieAnimationView9.playAnimation();
                    ilkbaharclicked28=false;
                }
            }
        });
        imageView29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!ilkbaharclicked29){
                    lottieAnimationView8.setSpeed(1);
                    lottieAnimationView8.playAnimation();
                    ilkbaharclicked29=true;
                }
                else{
                    lottieAnimationView8.setSpeed(-1);
                    lottieAnimationView8.playAnimation();
                    ilkbaharclicked29=false;
                }
            }
        });
        imageView30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!ilkbaharclicked30){
                    lottieAnimationView7.setSpeed(1);
                    lottieAnimationView7.playAnimation();
                    ilkbaharclicked30=true;
                }
                else{
                    lottieAnimationView7.setSpeed(-1);
                    lottieAnimationView7.playAnimation();
                    ilkbaharclicked30=false;
                }
            }
        });
        imageView31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!ilkbaharclicked31){
                    lottieAnimationView3.setSpeed(1);
                    lottieAnimationView3.playAnimation();
                    ilkbaharclicked31=true;
                }
                else{
                    lottieAnimationView3.setSpeed(-1);
                    lottieAnimationView3.playAnimation();
                    ilkbaharclicked31=false;
                }
            }
        });
        imageView32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!ilkbaharclicked32){
                    lottieAnimationView5.setSpeed(1);
                    lottieAnimationView5.playAnimation();
                    ilkbaharclicked32=true;
                }
                else{
                    lottieAnimationView5.setSpeed(-1);
                    lottieAnimationView5.playAnimation();
                    ilkbaharclicked32=false;
                }
            }
        });
        imageView33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!ilkbaharclicked33){
                    lottieAnimationView4.setSpeed(1);
                    lottieAnimationView4.playAnimation();
                    ilkbaharclicked33=true;
                }
                else{
                    lottieAnimationView4.setSpeed(-1);
                    lottieAnimationView4.playAnimation();
                    ilkbaharclicked33=false;
                }
            }
        });
        imageView34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!ilkbaharclicked34){
                    lottieAnimationView6.setSpeed(1);
                    lottieAnimationView6.playAnimation();
                    ilkbaharclicked34=true;
                }
                else{
                    lottieAnimationView6.setSpeed(-1);
                    lottieAnimationView6.playAnimation();
                    ilkbaharclicked34=false;
                }
            }
        });


    }


    public void ilkbaharSkorBelirle(View view){
        if(ilkbaharclicked20){
            ilkbaharSkor++;
        }
        if(ilkbaharclicked22){
            ilkbaharSkor--;
        }
        if(ilkbaharclicked23){
            ilkbaharSkor--;
        }
        if(ilkbaharclicked24){
            ilkbaharSkor--;
        }
        if(ilkbaharclicked26){
            ilkbaharSkor--;
        }
        if(ilkbaharclicked28){
            ilkbaharSkor++;
        }
        if(ilkbaharclicked29){
            ilkbaharSkor++;
        }
        if(ilkbaharclicked30){
            ilkbaharSkor--;
        }
        if(ilkbaharclicked31){
            ilkbaharSkor--;
        }
        if(ilkbaharclicked32){
            ilkbaharSkor--;
        }
        if(ilkbaharclicked33){
            ilkbaharSkor--;
        }
        if(ilkbaharclicked34){
            ilkbaharSkor--;
        }
        Intent intent=new Intent(mevsimler7.this,mevsimler8.class);
        startActivity(intent);
    }


}