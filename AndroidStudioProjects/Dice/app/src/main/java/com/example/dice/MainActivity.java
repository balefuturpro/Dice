package com.example.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //declaration des variables
    ImageView imageDice1, imageDice2;
    Button buttonJouer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Initialisation des variables se fait ici
        // Declaration d'un tableau de 6 elements correspondants à nos images
        final int [] arrayDice = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6,

        };
        // l'initialisation des variables doit etre fait apres cet methode setcontentview
        setContentView(R.layout.activity_main);
        imageDice1 = findViewById(R.id.dice1);
        imageDice2 = findViewById(R.id.dice2);
        buttonJouer = findViewById(R.id.btn);

        buttonJouer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        "Bonjour Aziz",Toast.LENGTH_LONG).show();
                Random rand = new Random();
                int indiceImage1 = rand.nextInt(arrayDice.length);
                int indiceImage2 = rand.nextInt(arrayDice.length);

                imageDice1.setImageResource(arrayDice[indiceImage1]);
                imageDice2.setImageResource(arrayDice[indiceImage2]);
            }
        });
    }
}
