package com.example.fuely;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    Button button;
    Button singup;
    Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });




        button = findViewById(R.id.login_b);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity2.this, login.class);
            startActivity(intent);
            });

        button = findViewById(R.id.singup);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity2.this, login.class);
        });


        button = findViewById(R.id.singup);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity2.this, singup1.class);
            startActivity(intent);
        });



    }
}