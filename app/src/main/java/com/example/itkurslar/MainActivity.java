package com.example.itkurslar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.itkurslar.activty_lar.java_view;
import com.example.itkurslar.activty_lar.js_view;
import com.example.itkurslar.activty_lar.kt_view;
import com.example.itkurslar.activty_lar.phyton_view;

public class MainActivity extends AppCompatActivity {
LinearLayout salom, assallom , px , fk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        salom =findViewById(R.id.kt_ln);
        assallom =findViewById(R.id.java_ln);
        px =findViewById(R.id.javasc_ln);
        fk =findViewById(R.id.python_ln);

        salom.setOnClickListener(view -> {
            Intent intent= new Intent(MainActivity.this, kt_view.class);
            startActivity(intent);
        });
        assallom.setOnClickListener(view -> {
            Intent intent= new Intent(MainActivity.this, java_view.class);
            startActivity(intent);
        });
        px.setOnClickListener(view -> {
            Intent intent= new Intent(MainActivity.this, js_view.class);
            startActivity(intent);
        });
        fk.setOnClickListener(view -> {
            Intent intent= new Intent(MainActivity.this, phyton_view.class);
            startActivity(intent);
        });

    }
}