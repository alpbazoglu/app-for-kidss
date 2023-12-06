package com.unalbuyukkoroglu.a2004project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static String isim;
    static String soyisim;
    static String yas;



    EditText editTextText;
    EditText editTextText2;
    EditText editTextNumber;

    static String userName;
    static String userSurname;
    static int userAge;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextText = findViewById(R.id.editTextText);
        editTextText2 = findViewById(R.id.editTextText2);
        editTextNumber = findViewById(R.id.editTextNumber);





    }

    public void startButton(View view) {

        isim=editTextText.getText().toString();
        soyisim=editTextText2.getText().toString();
        yas=editTextNumber.getText().toString();


        if (editTextText.getText().toString().matches("")) {

            Toast.makeText(getApplicationContext(), "Lütfen tüm boşlukları doldurunuz!", Toast.LENGTH_LONG).show();
        }
        else if (editTextText2.getText().toString().matches("")) {
            Toast.makeText(getApplicationContext(), "Lütfen tüm boşlukları doldurunuz!!", Toast.LENGTH_LONG).show();
        }
        else if (editTextNumber.getText().toString().matches("")) {
            Toast.makeText(getApplicationContext(), "Lütfen tüm boşlukları doldurunuz!", Toast.LENGTH_LONG).show();
        }

        else {

            Intent intent = new Intent(MainActivity.this, egitimmitestmi.class);
            startActivity(intent);
        }



    }
}