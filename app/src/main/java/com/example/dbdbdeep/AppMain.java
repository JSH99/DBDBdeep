package com.example.dbdbdeep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AppMain extends AppCompatActivity {

    private Button btnCheckCoupon;
    private Button btnRegisterCoupon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_main);

        btnCheckCoupon = findViewById(R.id.btnCheckCoupon);
        btnRegisterCoupon = findViewById(R.id.btnRegisterCoupon);

        btnCheckCoupon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SignUpIntent = new Intent(AppMain.this, CheckCoupon.class);
                startActivity(SignUpIntent);
            }
        });

        btnRegisterCoupon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SignUpIntent = new Intent(AppMain.this, RegisterCoupon.class);
                startActivity(SignUpIntent);
            }
        });
    }
}