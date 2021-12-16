package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btn_click(View view)
    {
        ImageView img = (ImageView)findViewById(R.id.imageView);
        img.setBackgroundResource(R.drawable.rabbit_animation);
        AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();
        frameAnimation.setOneShot(false);
        frameAnimation.start();
        Button btn = (Button) findViewById(R.id.button);
        btn.setText("Кролик идет");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(frameAnimation.isRunning()) {
                    frameAnimation.stop();
                    btn.setText("Кролик стоит");
                }
                else {
                    frameAnimation.start();
                    btn.setText("Кролик идет");
                }
            }
        });
    }
}