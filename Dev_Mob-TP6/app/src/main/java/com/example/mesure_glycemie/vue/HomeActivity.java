package com.example.mesure_glycemie.vue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mesure_glycemie.R;

public class HomeActivity extends AppCompatActivity {
    private Button btnConsultation;

    private void init(){
        btnConsultation = findViewById(R.id.btnConsultation);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init();
        btnConsultation.setOnClickListener(v -> {
            //one way intent to access MainActivity
            Intent intent = new Intent(HomeActivity.this, MainActivity.class);
            startActivity(intent);
            //close the previous activity, cant return to it
            finish();
        });
    }
}