package com.example.a11111;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class tests extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tests);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        FrameLayout container = findViewById(R.id.kudadobovlat);



        TextView buttonLayoutOne = findViewById(R.id.textView15);
        TextView buttonLayoutTwo = findViewById(R.id.textView14);
        TextView buttonLayoutThree = findViewById(R.id.textView13);


        buttonLayoutOne.setOnClickListener(v -> loadLayout(R.layout.activity_dop1, container));
        buttonLayoutTwo.setOnClickListener(v -> loadLayout(R.layout.activity_dop2, container));
        buttonLayoutThree.setOnClickListener(v -> loadLayout(R.layout.activity_dop3, container));
    }

    private void loadLayout(int layoutResId, FrameLayout container) {
        container.removeAllViews();
        View view = getLayoutInflater().inflate(layoutResId, container, false);
        container.addView(view);
    }
    public void ghh(View view) {
        Intent aboba = new Intent(tests.this, MainActivity.class);
        startActivity(aboba);
    }



}