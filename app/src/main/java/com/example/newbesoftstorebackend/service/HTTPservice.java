package com.example.newbesoftstorebackend.service;

import android.os.AsyncTask;

import com.example.newbesoftstorebackend.model.Product;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

public class HTTPservice extends AsyncTask<Void, Void, Product> {

    private final String productId;

    public HTTPservice(String productId){
        this.productId = productId;
    }

    @Override
    protected Product doInBackground(Void... voids) {
        StringBuilder response = new StringBuilder();
        try {
            String myUrl = "https://newbestore.herokuapp.com/products/1";
            URL url = new URL(myUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/json");
            connection.setConnectTimeout(10000);
            connection.connect();
            System.out.println(connection);
            Scanner scanner = new Scanner(url.openStream());

            while(scanner.hasNext()) {
                response.append(scanner.next());
            }
            return new Gson().fromJson(connection.getResponseMessage(), Product.class);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Gson().fromJson(response.toString(), Product.class);
    }
}
