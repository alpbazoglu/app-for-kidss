package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class toptakibi2 extends AppCompatActivity {


    public Button button2;


    private ImageView imageViewBall;
    private int ballX, ballY;
    private int screenWidth, screenHeight;
    private int rowHeight, rowSpacing;
    private int ballSpeed;

    private Handler handler = new Handler();
    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            moveBall();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toptakibi2);


        button2 = findViewById(R.id.button38);
        button2.setVisibility(View.INVISIBLE);


        imageViewBall = findViewById(R.id.imageViewBall);


        screenWidth = getResources().getDisplayMetrics().widthPixels;
        screenHeight = getResources().getDisplayMetrics().heightPixels;
        rowHeight = 100;
        rowSpacing = 20;
        ballSpeed = 10;


        ballX = 0;
        ballY = rowHeight / 2;


        startBallMovement();
    }

    private void startBallMovement() {
        handler.postDelayed(runnable, 0);
    }

    private void moveBall() {

        ballX += ballSpeed;
        if (ballX > screenWidth) {

            ballX = 0;
            ballY += rowHeight + rowSpacing;


        }
        if (ballY >= screenHeight - rowHeight) {
            button2.setVisibility(View.VISIBLE);
        }


        imageViewBall.setX(ballX);
        imageViewBall.setY(ballY);


        startBallMovement();
    }


    public void takiptenanasayfaya(View view){
        Intent intent=new Intent(toptakibi2.this, egitimmitestmi.class);
        startActivity(intent);
    }
}
