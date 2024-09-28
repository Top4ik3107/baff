package com.example.a11111;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

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
//        WebView myWebView = findViewById(R.id.videoView3);
//        myWebView.setWebViewClient(new WebViewClient()); // Чтобы открывать ссылки внутри WebView
//
//        // Настройки WebView
//        WebSettings webSettings = myWebView.getSettings();
//        webSettings.setJavaScriptEnabled(true); // Включите JavaScript, если нужно
//
//        // Загрузка URL с видео
     //   myWebView.loadUrl("https://youtu.be/GpsuggEpQEQ?si=Edl9-zhkmCINr98j"); // Замените на нужный вам URL с видео
    }
}