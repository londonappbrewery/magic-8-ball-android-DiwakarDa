package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mrollbutton = (Button)findViewById(R.id.mrollbutton);

        final ImageView ballimage  =(ImageView)findViewById(R.id.ballimage);

        final int[] ballarray =
                {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };
        mrollbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("ball","my button has been clicked");

                Random RandomNumberGenerator = new Random();

                int number = RandomNumberGenerator.nextInt(5);

                Log.d("ball","random number is" + number);

                ballimage.setImageResource(ballarray[number]);
            }
        });


        }
    }

