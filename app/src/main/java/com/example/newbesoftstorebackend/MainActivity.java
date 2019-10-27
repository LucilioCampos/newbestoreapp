package com.example.newbesoftstorebackend;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.widget.TextView;

import com.example.newbesoftstorebackend.model.Product;
import com.example.newbesoftstorebackend.service.HTTPservice;

import java.util.concurrent.ExecutionException;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView resposta = findViewById(R.id.mainResponse);

        HTTPservice httPservice = new HTTPservice("1");
        try {
            Product product = httPservice.execute().get();
            System.out.println(product.toString());
            resposta.setText(product.toString());
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
