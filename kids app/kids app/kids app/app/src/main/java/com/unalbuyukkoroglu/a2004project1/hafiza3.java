package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class hafiza3 extends AppCompatActivity {

    static int hafizaTersSkor=0;
    EditText editTextNumber6;
    EditText editTextNumber7;
    EditText editTextNumber8;
    EditText editTextNumber9;

    ImageView imageView35;
    ImageView imageView36;
    ImageView imageView37;
    ImageView imageView39;
    ImageView imageView41;
    ImageView imageView42;
    ImageView imageView43;
    ImageView imageView44;
    ImageView imageView45;

    ImageView[] imageArray;

    int currentIndex=0;

    int[] yanipsonmesirasi={5,8,2,6,4};

    Handler handler;
    Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hafiza3);

        imageView35=findViewById(R.id.imageView35);
        imageView36=findViewById(R.id.imageView36);
        imageView37=findViewById(R.id.imageView37);
        imageView39=findViewById(R.id.imageView39);
        imageView41=findViewById(R.id.imageView41);
        imageView42=findViewById(R.id.imageView42);
        imageView43=findViewById(R.id.imageView43);
        imageView44=findViewById(R.id.imageView44);
        imageView45=findViewById(R.id.imageView45);

        imageArray=new ImageView[]{imageView35,imageView36,imageView37,imageView39,imageView45,imageView41,imageView42,imageView43,imageView44};

        hideImages();

        editTextNumber6=findViewById(R.id.editTextNumber6);
        editTextNumber7=findViewById(R.id.editTextNumber7);
        editTextNumber8=findViewById(R.id.editTextNumber8);
        editTextNumber9=findViewById(R.id.editTextNumber9);

    }
    public void hideImages(){

        handler=new Handler();
        runnable=new Runnable() {
            @Override
            public void run() {
                for(ImageView image : imageArray){
                    image.setVisibility(View.INVISIBLE);
                }

                imageArray[yanipsonmesirasi[currentIndex]].setVisibility(View.VISIBLE);
                currentIndex++;


                if(currentIndex<yanipsonmesirasi.length) {
                    handler.postDelayed(runnable, 1000);
                }
            }
        };

        handler.post(runnable);


    }
    public void hafiza4gecis(View view){

        if(editTextNumber7.getText().toString().matches("7")){
            hafizaTersSkor++;
        }
        else if(editTextNumber7.getText().toString().matches("")){
            Toast.makeText(hafiza3.this,"Lütfen Boşlukları Doldurunuz!",Toast.LENGTH_LONG).show();
        }

        if(editTextNumber6.getText().toString().matches("4")){
            hafizaTersSkor++;
        }
        else if(editTextNumber6.getText().toString().matches("")){
            Toast.makeText(hafiza3.this,"Lütfen Boşlukları Doldurunuz!",Toast.LENGTH_LONG).show();
        }
        if(editTextNumber8.getText().toString().matches("9")){
            hafizaTersSkor++;
        }
        else if(editTextNumber8.getText().toString().matches("")){
            Toast.makeText(hafiza3.this,"Lütfen Boşlukları Doldurunuz!",Toast.LENGTH_LONG).show();
        }
        if(editTextNumber9.getText().toString().matches("6")){
            hafizaTersSkor++;
        }
        else if(editTextNumber9.getText().toString().matches("")){
            Toast.makeText(hafiza3.this,"Lütfen Boşlukları Doldurunuz!",Toast.LENGTH_LONG).show();
        }

        Intent intent=new Intent(hafiza3.this,hafiza4.class);
        startActivity(intent);
    }
}