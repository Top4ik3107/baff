package com.example.a11111;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.VideoView;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity6 extends AppCompatActivity {

    private RadioGroup radioGroup;
    private FrameLayout container;

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
    }

    public void sq(View view) {
        loadLayout(R.layout.activity_mge, container);
    }

    public void sw(View view) {
        loadLayout(R.layout.activity_mge2, container);
    }

    public void se(View view) {
        loadLayout(R.layout.activity_mge3, container);
    }

    public void sr(View view) {
        loadLayout(R.layout.activity_mge4, container);
    }

    private void loadLayout(int layoutResId, FrameLayout container) {
        if (container != null) {
            container.removeAllViews();
            View view = getLayoutInflater().inflate(layoutResId, container, false);
            container.addView(view);

            // Запустите код из mge после инфляции
            if (layoutResId == R.layout.activity_mge) {
                VideoView myWebView = view.findViewById(R.id.mge);
                String vidp = "android.resource://" + getPackageName() + "/" + R.raw.shtraf;
                myWebView.setVideoURI(Uri.parse(vidp));
                myWebView.start();
            }
            if (layoutResId == R.layout.activity_mge2) {
                VideoView myWebView = view.findViewById(R.id.mge);
                String vidp = "android.resource://" + getPackageName() + "/" + R.raw.foryou;
                myWebView.setVideoURI(Uri.parse(vidp));
                myWebView.start();
            }
            if (layoutResId == R.layout.activity_mge3) {
                VideoView myWebView = view.findViewById(R.id.mge);
                String vidp = "android.resource://" + getPackageName() + "/" + R.raw.mge;
                myWebView.setVideoURI(Uri.parse(vidp));
                myWebView.start();
            }
            if (layoutResId == R.layout.activity_mge4) {
                VideoView myWebView = view.findViewById(R.id.mge);
                String vidp = "android.resource://" + getPackageName() + "/" + R.raw.special;
                myWebView.setVideoURI(Uri.parse(vidp));
                myWebView.start();
            }




        }
    }
}
