package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.airbnb.lottie.LottieAnimationView;

public class speling3 extends AppCompatActivity {

    LottieAnimationView lottieAnimationView13;
    LottieAnimationView lottieAnimationView14;

    MediaPlayer bilgisayar_ses;
    MediaPlayer oyuncak_ses;

    EditText editTextText11;
    EditText editTextText12;
    EditText editTextText13;
    EditText editTextText14;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speling3);
        lottieAnimationView13=findViewById(R.id.lottieAnimationView13);
        lottieAnimationView14=findViewById(R.id.lottieAnimationView14);

        editTextText11=findViewById(R.id.editTextText11);
        editTextText12=findViewById(R.id.editTextText12);
        editTextText13=findViewById(R.id.editTextText13);
        editTextText14=findViewById(R.id.editTextText14);

        bilgisayar_ses=MediaPlayer.create(getApplicationContext(),R.raw.bilgisayar);
        oyuncak_ses=MediaPlayer.create(getApplicationContext(),R.raw.oyuncak);

        lottieAnimationView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bilgisayar_ses.start();
                lottieAnimationView13.setSpeed(1);
                lottieAnimationView13.playAnimation();
            }
        });

        lottieAnimationView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                oyuncak_ses.start();
                lottieAnimationView14.setSpeed(1);
                lottieAnimationView14.playAnimation();
            }
        });

    }
    public void spelling4gecis(View view){
        if(editTextText11.getText().toString().matches("bilgisayar")){
            spelling5.spellingToplamSkor++;
        }
        if(editTextText12.getText().toString().matches("bil-gi-sa-yar")){
            spelling5.spellingToplamSkor++;
        }
        if(editTextText13.getText().toString().matches("oyuncak")){
            spelling5.spellingToplamSkor++;
        }
        if(editTextText14.getText().toString().matches("o-yun-cak")){
            spelling5.spellingToplamSkor++;
        }

        Intent intent=new Intent(speling3.this, spelling4.class);
        startActivity(intent);
    }
}