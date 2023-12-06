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

public class hafiza2 extends AppCompatActivity {

    static int hafizaNormalSkor=0;
    EditText editTextNumber2;
    EditText editTextNumber3;
    EditText editTextNumber4;
    EditText editTextNumber5;

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

    int[] yanipsonmesirasi={3,7,1,5,4};

    Handler handler;
    Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hafiza2);

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

        editTextNumber2=findViewById(R.id.editTextNumber2);
        editTextNumber3=findViewById(R.id.editTextNumber3);
        editTextNumber4=findViewById(R.id.editTextNumber4);
        editTextNumber5=findViewById(R.id.editTextNumber5);

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
    public void hafiza3gecis(View view){

        if(editTextNumber2.getText().toString().matches("1")){
            hafizaNormalSkor++;
        }
        else if(editTextNumber2.getText().toString().matches("")){
            Toast.makeText(hafiza2.this,"Lütfen Boşlukları Doldurunuz!",Toast.LENGTH_LONG).show();
        }

        if(editTextNumber3.getText().toString().matches("8")){
            hafizaNormalSkor++;
        }
        else if(editTextNumber3.getText().toString().matches("")){
            Toast.makeText(hafiza2.this,"Lütfen Boşlukları Doldurunuz!",Toast.LENGTH_LONG).show();
        }
        if(editTextNumber4.getText().toString().matches("3")){
            hafizaNormalSkor++;
        }
        else if(editTextNumber4.getText().toString().matches("")){
            Toast.makeText(hafiza2.this,"Lütfen Boşlukları Doldurunuz!",Toast.LENGTH_LONG).show();
        }
        if(editTextNumber5.getText().toString().matches("6")){
            hafizaNormalSkor++;
        }
        else if(editTextNumber5.getText().toString().matches("")){
            Toast.makeText(hafiza2.this,"Lütfen Boşlukları Doldurunuz!",Toast.LENGTH_LONG).show();
        }

        Intent intent=new Intent(hafiza2.this,hafiza3.class);
        startActivity(intent);
    }


}