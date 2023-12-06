package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class yonler4 extends AppCompatActivity {

    public boolean saggclicked=false;
    public boolean solclicked=false;
    public boolean onnclicked=false;
    public boolean arkaclicked=false;

    static int sagSkor=0;

    LottieAnimationView lottieAnimationView20;
    LottieAnimationView lottieAnimationView17;
    LottieAnimationView lottieAnimationView18;
    LottieAnimationView lottieAnimationView19;

    Button button30;
    Button button32;
    Button button33;
    Button button34;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yonler4);

        lottieAnimationView19=findViewById(R.id.lottieAnimationView19);
        lottieAnimationView17=findViewById(R.id.lottieAnimationView17);
        lottieAnimationView18=findViewById(R.id.lottieAnimationView18);
        lottieAnimationView20=findViewById(R.id.lottieAnimationView20);

        button30=findViewById(R.id.button30);
        button32=findViewById(R.id.button32);
        button33=findViewById(R.id.button33);
        button34=findViewById(R.id.button34);

        lottieAnimationView19.setVisibility(View.INVISIBLE);
        lottieAnimationView17.setVisibility(View.INVISIBLE);
        lottieAnimationView18.setVisibility(View.INVISIBLE);
        lottieAnimationView20.setVisibility(View.INVISIBLE);



        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!onnclicked){
                    lottieAnimationView19.setVisibility(View.VISIBLE);
                    lottieAnimationView17.setVisibility(View.INVISIBLE);
                    lottieAnimationView19.setSpeed(1);
                    lottieAnimationView19.playAnimation();
                    lottieAnimationView20.setVisibility(View.INVISIBLE);
                    lottieAnimationView18.setVisibility(View.INVISIBLE);
                    saggclicked=false;
                    solclicked=false;
                    onnclicked=true;
                    arkaclicked=false;
                }
                else{
                    lottieAnimationView19.setSpeed(-1);
                    lottieAnimationView19.playAnimation();
                    onnclicked=false;
                }
            }
        });
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!arkaclicked){
                    lottieAnimationView17.setVisibility(View.VISIBLE);
                    lottieAnimationView17.setSpeed(1);
                    lottieAnimationView17.playAnimation();
                    lottieAnimationView19.setVisibility(View.INVISIBLE);
                    lottieAnimationView18.setVisibility(View.INVISIBLE);
                    lottieAnimationView20.setVisibility(View.INVISIBLE);
                    saggclicked=false;
                    solclicked=false;
                    onnclicked=false;
                    arkaclicked=true;
                }
                else{
                    lottieAnimationView17.setSpeed(-1);
                    lottieAnimationView17.playAnimation();
                    arkaclicked=false;
                }
            }
        });
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!saggclicked){
                    lottieAnimationView20.setVisibility(View.VISIBLE);
                    lottieAnimationView17.setVisibility(View.INVISIBLE);
                    lottieAnimationView20.setSpeed(1);
                    lottieAnimationView20.playAnimation();
                    lottieAnimationView18.setVisibility(View.INVISIBLE);
                    lottieAnimationView19.setVisibility(View.INVISIBLE);
                    saggclicked=true;
                    solclicked=false;
                    onnclicked=false;
                    arkaclicked=false;
                }
                else{
                    lottieAnimationView20.setSpeed(-1);
                    lottieAnimationView20.playAnimation();
                    saggclicked=false;
                }
            }
        });
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!solclicked){
                    lottieAnimationView18.setVisibility(View.VISIBLE);
                    lottieAnimationView19.setVisibility(View.INVISIBLE);
                    lottieAnimationView17.setVisibility(View.INVISIBLE);
                    lottieAnimationView18.setSpeed(1);
                    lottieAnimationView18.playAnimation();
                    lottieAnimationView20.setVisibility(View.INVISIBLE);
                    saggclicked=false;
                    solclicked=true;
                    onnclicked=false;
                    arkaclicked=false;
                }
                else{
                    lottieAnimationView18.setSpeed(-1);
                    lottieAnimationView18.playAnimation();
                    solclicked=false;
                }
            }
        });

    }
    public void yonler5gecis(View view){
        if(saggclicked){
            sagSkor++;
        }
        Intent intent = new Intent(yonler4.this,yonler5.class);
        startActivity(intent);

    }
}