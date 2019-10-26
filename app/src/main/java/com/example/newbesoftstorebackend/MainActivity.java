package com.example.newbesoftstorebackend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.textclassifier.TextLinks;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.newbesoftstorebackend.model.Product;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {
    private TextView mTextViewResult;
    LinearLayout linearLayout;
    Product product;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

//        mTextViewResult = findViewById(R.id.text_view_result);

        final ArrayList<Product> products = new ArrayList<>();
        linearLayout = findViewById(R.id.linearLayout);

        OkHttpClient client = new OkHttpClient();
//
        String url = " https://newbestore.herokuapp.com/products";
//
        Request request = new Request.Builder()
                .url(url)
                .get()
                .addHeader("content-type", "application/json")
                .addHeader("accept-type", "application/json")
                .build();
//
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if(response.isSuccessful()) {
                    System.out.println(response.body().toString());
                    for(int i = 0;i <= response.body().contentLength(); i++){

                        Intent intent = new Intent();
    //                        products.add(new Product(Integer.parseInt(jsonObject.getJSONObject(i).id)), jsonObject[i].);
    //                            TextView textView = new TextView(MainActivity.this);
    //                            textView.setText("TextView ");
    //                            linearLayout.addView(textView);
                    }

                    String myResponse = response.body().string();
                    System.out.println(myResponse.getClass());
                }
            }
        });

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
