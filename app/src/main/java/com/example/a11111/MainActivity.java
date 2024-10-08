package com.example.a11111;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.service.voice.VoiceInteractionSession;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView val4;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        try {
            val4 = findViewById(R.id.textView);
            if (val4 != null) {
                ObjectAnimator animation = ObjectAnimator.ofFloat(val4, "translationY", 0f, -100f, 0f);
                animation.setDuration(1000);
                animation.setRepeatCount(ObjectAnimator.INFINITE);
                animation.setRepeatMode(ObjectAnimator.REVERSE);
                animation.start();
            } else {
                Log.e("MainActivity", "val is null");
            }
        } catch (Exception e) {
            e.printStackTrace(); // Лоауыаыание ошибкиczbzddv
        }

    }

    public void ab(View view) {
        Intent aboba = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(aboba);
    }

    public void abb(View view) {
        Intent aboba = new Intent(MainActivity.this, tests.class);
        startActivity(aboba);
    }

    public void abbb(View view) {
        Intent aboba = new Intent(MainActivity.this, MainActivity3.class);
        startActivity(aboba);

    }

    public void abbf(View view) {
        Intent aboba = new Intent(MainActivity.this, MainActivity6.class);
        startActivity(aboba);
    }
}
