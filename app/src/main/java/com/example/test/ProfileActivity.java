package com.example.test;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;

public class ProfileActivity extends AppCompatActivity {


    private AppCompatTextView logint;
    private AppCompatButton backBtm, nastroykiBtm;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        backBtm = findViewById(R.id.exit_btm);
        nastroykiBtm = findViewById(R.id.NastroykiBtm);
        logint = findViewById(R.id.textViewLog);

        String log = getIntent().getExtras().getString("login");

        logint.setText(log);

        backBtm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        nastroykiBtm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, SetingsActivity.class);
                startActivity(intent);
            }
        });
    }
}
