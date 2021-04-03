package com.example.dbdbdeep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    private Button btnFinRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnFinRegister = findViewById(R.id.btnFinRegister);

        btnFinRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toastRegister;
                toastRegister = Toast.makeText(getApplicationContext(), "회원가입이 완료되었습니다!", Toast.LENGTH_SHORT);
                toastRegister.show();

                Intent SignUpIntent = new Intent(Register.this, MainActivity.class);
                startActivity(SignUpIntent);

            }
        });

    }
}