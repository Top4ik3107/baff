package com.example.a11111;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity4 extends AppCompatActivity {
    @SuppressLint({"WrongViewCast", "SetJavaScriptEnabled", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
       VideoView myWebView = findViewById(R.id.videoView3);
       String vidp = "android.resource://" + getPackageName() + "/" + R.raw.vid;
       myWebView.setVideoURI(Uri.parse(vidp));
       myWebView.start();




    }

    public void abbg(View view) {
        Intent abobaa = new Intent(MainActivity4.this, MainActivity5.class);
        startActivity(abobaa);
    }

    public void play(View view) {
        VideoView myWebView = findViewById(R.id.videoView3);
        String vidp = "android.resource://" + getPackageName() + "/" + R.raw.vid;
        myWebView.setVideoURI(Uri.parse(vidp));
        myWebView.start();
    }
}