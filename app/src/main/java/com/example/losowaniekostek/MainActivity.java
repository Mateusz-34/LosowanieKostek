package com.example.losowaniekostek;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextLiczbaKostek = findViewById(R.id.editTextLiczbaKostek);

        Button buttonLosuj = findViewById(R.id.buttonLosuj);

        buttonLosuj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();

                int randomNumber = random.nextInt(100) + 1;
                sprawdzLiczbe();
            }
        });
    }

    public void sprawdzLiczbe(){
        EditText editTextLiczbaKostek = findViewById(R.id.editTextLiczbaKostek);
        String input = editTextLiczbaKostek.getText().toString();
        int liczba = Integer.parseInt(input);


        if (liczba <= 0){
            Toast.makeText(this, "Liczba nie moze byc mniejsza lub rowna zero", Toast.LENGTH_SHORT).show();
        } else if (liczba > 100) {
            Toast.makeText(this, "Liczba nie moze byc wieksza od 100", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Podano prawidlowa liczbe kostek", Toast.LENGTH_SHORT).show();
        }
    }
}