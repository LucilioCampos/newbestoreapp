package com.example.newbesoftstorebackend;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btnLogin = (Button) findViewById(R.id.btnLogin);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("newbesoft") && password.getText().toString().equals("12345678")) {
                    Intent listProducts = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(listProducts);

                }else {
                    System.out.println(username.getText().toString());
                    System.out.println(password.getText().toString());
                    Toast.makeText(MainActivity.this, "Credênciais inválidas, tente novamente!", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
