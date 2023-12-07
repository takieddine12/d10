package com.dz.drjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        Resources resources = getResources();
        TypedArray drawableIds = resources.obtainTypedArray(R.array.drawables);

        ArrayList<Integer> drawableList = new ArrayList<>();
        for (int i = 0; i < drawableIds.length(); i++) {
            int resourceId = drawableIds.getResourceId(i, -1);
            if (resourceId != -1) {
                drawableList.add(resourceId);
            }
        }
        drawableIds.recycle();

        ImageAdapter imageAdapter = new ImageAdapter(drawableList);
        recyclerView.setAdapter(imageAdapter);


    }
}