package com.example.roleta1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alterar(View view) {

        Random random = new Random();
        int Randomnumber = random.nextInt(100) + 1;

        TextView numero = findViewById(R.id.textView);
        String teste = String.valueOf(Randomnumber);
        numero.setText(teste);
    }
}