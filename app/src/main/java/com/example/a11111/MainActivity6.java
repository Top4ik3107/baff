package com.example.a11111;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity6 extends AppCompatActivity {

    private RadioGroup radioGroup;
    private FrameLayout container;

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main6);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        radioGroup = findViewById(R.id.radio2);
        container = findViewById(R.id.block); // Initialize the container once

        radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            int layoutId = 0; // Initialize layoutId

            switch (checkedId) {
                case R.id.radio6:
                    layoutId = R.layout.activity_mge;
                    break;
                case R.id.radio7:
                    layoutId = R.layout.activity_mge2;
                    break;
                case R.id.radio9:
                    layoutId = R.layout.activity_mge3;
                    break;
                case R.id.radio10:
                    layoutId = R.layout.activity_mge4;
                    break;
            }

            // If a valid layoutId is set, inflate and add the view
            if (layoutId != 0) {
                container.removeAllViews();
                View view = getLayoutInflater().inflate(layoutId, container, false);
                container.addView(view);
            }
        });
    }
}
