package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class mevsimler9 extends AppCompatActivity {

    public boolean sonbaharclicked22 = false;
    public boolean sonbaharclicked23 = false;
    public boolean sonbaharclicked24 = false;
    public boolean sonbaharclicked20 = false;
    public boolean sonbaharclicked26 = false;
    public boolean sonbaharclicked28 = false;
    public boolean sonbaharclicked29 = false;
    public boolean sonbaharclicked30 = false;
    public boolean sonbaharclicked31 = false;
    public boolean sonbaharclicked32 = false;
    public boolean sonbaharclicked33 = false;
    public boolean sonbaharclicked34 = false;


    static int sonbaharSkor = 0;

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
        setContentView(R.layout.activity_mevsimler9);

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
                if(!sonbaharclicked22){
                    lottieAnimationView1.setSpeed(1);
                    lottieAnimationView1.playAnimation();
                    sonbaharclicked22=true;
                }
                else{
                    lottieAnimationView1.setSpeed(-1);
                    lottieAnimationView1.playAnimation();
                    sonbaharclicked22=false;
                }
            }
        });
        imageView20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!sonbaharclicked20){
                    lottieAnimationView.setSpeed(1);
                    lottieAnimationView.playAnimation();
                    sonbaharclicked20=true;
                }
                else{
                    lottieAnimationView.setSpeed(-1);
                    lottieAnimationView.playAnimation();
                    sonbaharclicked20=false;
                }
            }
        });
        imageView23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!sonbaharclicked23){
                    lottieAnimationView2.setSpeed(1);
                    lottieAnimationView2.playAnimation();
                    sonbaharclicked23=true;
                }
                else{
                    lottieAnimationView2.setSpeed(-1);
                    lottieAnimationView2.playAnimation();
                    sonbaharclicked23=false;
                }
            }
        });
        imageView24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!sonbaharclicked24){
                    lottieAnimationView11.setSpeed(1);
                    lottieAnimationView11.playAnimation();
                    sonbaharclicked24=true;
                }
                else{
                    lottieAnimationView11.setSpeed(-1);
                    lottieAnimationView11.playAnimation();
                    sonbaharclicked24=false;
                }
            }
        });
        imageView26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!sonbaharclicked26){
                    lottieAnimationView10.setSpeed(1);
                    lottieAnimationView10.playAnimation();
                    sonbaharclicked26=true;
                }
                else{
                    lottieAnimationView10.setSpeed(-1);
                    lottieAnimationView10.playAnimation();
                    sonbaharclicked26=false;
                }
            }
        });
        imageView28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!sonbaharclicked28){
                    lottieAnimationView9.setSpeed(1);
                    lottieAnimationView9.playAnimation();
                    sonbaharclicked28=true;
                }
                else{
                    lottieAnimationView9.setSpeed(-1);
                    lottieAnimationView9.playAnimation();
                    sonbaharclicked28=false;
                }
            }
        });
        imageView29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!sonbaharclicked29){
                    lottieAnimationView8.setSpeed(1);
                    lottieAnimationView8.playAnimation();
                    sonbaharclicked29=true;
                }
                else{
                    lottieAnimationView8.setSpeed(-1);
                    lottieAnimationView8.playAnimation();
                    sonbaharclicked29=false;
                }
            }
        });
        imageView30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!sonbaharclicked30){
                    lottieAnimationView7.setSpeed(1);
                    lottieAnimationView7.playAnimation();
                    sonbaharclicked30=true;
                }
                else{
                    lottieAnimationView7.setSpeed(-1);
                    lottieAnimationView7.playAnimation();
                    sonbaharclicked30=false;
                }
            }
        });
        imageView31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!sonbaharclicked31){
                    lottieAnimationView3.setSpeed(1);
                    lottieAnimationView3.playAnimation();
                    sonbaharclicked31=true;
                }
                else{
                    lottieAnimationView3.setSpeed(-1);
                    lottieAnimationView3.playAnimation();
                    sonbaharclicked31=false;
                }
            }
        });
        imageView32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!sonbaharclicked32){
                    lottieAnimationView5.setSpeed(1);
                    lottieAnimationView5.playAnimation();
                    sonbaharclicked32=true;
                }
                else{
                    lottieAnimationView5.setSpeed(-1);
                    lottieAnimationView5.playAnimation();
                    sonbaharclicked32=false;
                }
            }
        });
        imageView33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!sonbaharclicked33){
                    lottieAnimationView4.setSpeed(1);
                    lottieAnimationView4.playAnimation();
                    sonbaharclicked33=true;
                }
                else{
                    lottieAnimationView4.setSpeed(-1);
                    lottieAnimationView4.playAnimation();
                    sonbaharclicked33=false;
                }
            }
        });
        imageView34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!sonbaharclicked34){
                    lottieAnimationView6.setSpeed(1);
                    lottieAnimationView6.playAnimation();
                    sonbaharclicked34=true;
                }
                else{
                    lottieAnimationView6.setSpeed(-1);
                    lottieAnimationView6.playAnimation();
                    sonbaharclicked34=false;
                }
            }
        });


    }


    public void sonbaharSkorBelirle(View view){
        if(sonbaharclicked20){
            sonbaharSkor--;
        }
        if(sonbaharclicked22){
            sonbaharSkor--;
        }
        if(sonbaharclicked23){
            sonbaharSkor++;
        }
        if(sonbaharclicked24){
            sonbaharSkor--;
        }
        if(sonbaharclicked26){
            sonbaharSkor--;
        }
        if(sonbaharclicked28){
            sonbaharSkor--;
        }
        if(sonbaharclicked29){
            sonbaharSkor--;
        }
        if(sonbaharclicked30){
            sonbaharSkor--;
        }
        if(sonbaharclicked31){
            sonbaharSkor--;
        }
        if(sonbaharclicked32){
            sonbaharSkor--;
        }
        if(sonbaharclicked33){
            sonbaharSkor++;
        }
        if(sonbaharclicked34){
            sonbaharSkor++;
        }
        Intent intent=new Intent(mevsimler9.this,mevsimler10.class);
        startActivity(intent);
    }


}