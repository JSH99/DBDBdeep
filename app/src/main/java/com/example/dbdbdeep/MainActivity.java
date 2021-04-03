package com.example.dbdbdeep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnSignUP;
    private Button btnRegister;
    private EditText editTxtID;
    private EditText editTxtPW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSignUP = findViewById(R.id.btnSignUp);
        btnRegister = findViewById(R.id.btnRegister);
        editTxtID = findViewById(R.id.editTxtID);
        editTxtPW = findViewById(R.id.editTxtPW);

        String ID = "201910832";
        String PW = "990606";

        btnSignUP.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast toastError; //Toast object;

                    if(ID.equals(editTxtID.getText().toString())) {
                        if(PW.equals(editTxtPW.getText().toString())) {
                            Toast toastSignUp;
                            toastSignUp = Toast.makeText(getApplicationContext(), "로그인 되었습니다!", Toast.LENGTH_SHORT);
                            toastSignUp.show();

                            Intent SignUpIntent = new Intent(MainActivity.this, AppMain.class);
                            startActivity(SignUpIntent);
                        }
                        else {
                            toastError = Toast.makeText(getApplicationContext(), "ID 또는 PW가 틀렸습니다.", Toast.LENGTH_SHORT);
                            toastError.show();
                        }
                    }
                    else {
                        toastError = Toast.makeText(getApplicationContext(), "존재하지 않는 ID입니다.", Toast.LENGTH_SHORT);
                        toastError.show();
                    }

                }
            });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SignUpIntent = new Intent(MainActivity.this, Register.class);
                startActivity(SignUpIntent);
            }
        });


    }
}