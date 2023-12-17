package com.example.mesure_glycemie.vue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mesure_glycemie.R;


public class ConsultActivity extends AppCompatActivity {

    private Button btnReturn;
    private TextView tvReponse;
    private String reponse;

    private void init(){
        btnReturn = findViewById(R.id.btnReturn);
        tvReponse = findViewById(R.id.tvReponse);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consult);
        init();
        Intent intent = getIntent();
        reponse = intent.getStringExtra("reponse");
        tvReponse.setText(reponse);

        btnReturn.setOnClickListener(v -> {
            Intent intent1 = new Intent();
            if(reponse != null)
            {
                setResult(RESULT_OK, intent1);
            }
            else
            {
                setResult(RESULT_CANCELED, intent1);
            }
            finish();
        });
    }
}