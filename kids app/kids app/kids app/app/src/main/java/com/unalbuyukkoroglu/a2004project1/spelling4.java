package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.airbnb.lottie.LottieAnimationView;

public class spelling4 extends AppCompatActivity {

    LottieAnimationView lottieAnimationView21;
    LottieAnimationView lottieAnimationView22;
    LottieAnimationView lottieAnimationView23;

    MediaPlayer kumanda_ses;
    MediaPlayer sandalye_ses;
    MediaPlayer yemek_ses;

    EditText editTextText15;
    EditText editTextText16;
    EditText editTextText17;
    EditText editTextText18;
    EditText editTextText19;
    EditText editTextText20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spelling4);

        lottieAnimationView21=findViewById(R.id.lottieAnimationView21);
        lottieAnimationView22=findViewById(R.id.lottieAnimationView22);
        lottieAnimationView23=findViewById(R.id.lottieAnimationView23);

        editTextText15=findViewById(R.id.editTextText15);
        editTextText16=findViewById(R.id.editTextText16);
        editTextText17=findViewById(R.id.editTextText17);
        editTextText18=findViewById(R.id.editTextText18);
        editTextText19=findViewById(R.id.editTextText19);
        editTextText20=findViewById(R.id.editTextText20);

        kumanda_ses=MediaPlayer.create(getApplicationContext(),R.raw.kumanda);
        sandalye_ses=MediaPlayer.create(getApplicationContext(),R.raw.sandalye);
        yemek_ses=MediaPlayer.create(getApplicationContext(),R.raw.yemek);

        lottieAnimationView21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kumanda_ses.start();
                lottieAnimationView21.setSpeed(1);
                lottieAnimationView21.playAnimation();
            }
        });
        lottieAnimationView22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sandalye_ses.start();
                lottieAnimationView22.setSpeed(1);
                lottieAnimationView22.playAnimation();
            }
        });
        lottieAnimationView23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yemek_ses.start();
                lottieAnimationView23.setSpeed(1);
                lottieAnimationView23.playAnimation();
            }
        });

    }
    public void spelling5gecis(View view){
        if(editTextText15.getText().toString().matches("kumanda")){
            spelling5.spellingToplamSkor++;
        }
        if(editTextText18.getText().toString().matches("ku-man-da")){
            spelling5.spellingToplamSkor++;
        }
        if(editTextText16.getText().toString().matches("sandalye")){
            spelling5.spellingToplamSkor++;
        }
        if(editTextText19.getText().toString().matches("san-dal-ye")){
            spelling5.spellingToplamSkor++;
        }
        if(editTextText17.getText().toString().matches("yemek")){
            spelling5.spellingToplamSkor++;
        }
        if(editTextText20.getText().toString().matches("ye-mek")){
            spelling5.spellingToplamSkor++;
        }
        Intent intent=new Intent(spelling4.this,spelling5.class);
        startActivity(intent);
    }
}