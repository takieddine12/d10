package com.dz.drjava;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button showFirstBtn,showSecondBtn;
    private ImageView firstImage,secondImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        showFirstBtn = findViewById(R.id.showFirstBtn);
        showSecondBtn = findViewById(R.id.showSecondBtn);
        firstImage = findViewById(R.id.image1);
        secondImage = findViewById(R.id.image2);


        Resources resources = getResources();
        TypedArray drawableIds = resources.obtainTypedArray(R.array.drawables);

        showFirstBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstImage.setImageDrawable(drawableIds.getDrawable(0));
            }
        });

        showSecondBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondImage.setImageDrawable(drawableIds.getDrawable(1));
            }
        });
    }
}