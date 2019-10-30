package com.example.newbesoftstorebackend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView productName1, productName2, productName3, productName4, productName5, productName6, productName7;
    private TextView productPrice1,  productPrice2, productPrice3, productPrice4, productPrice5, productPrice6, productPrice7;
    private Button btnProduct1, btnProduct2, btnProduct3, btnProduct4, btnProduct5, btnProduct6, btnProduct7;
    private ImageView productImage1, productImage2, productImage3, productImage4, productImage5, productImage6, productImage7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        productImage1 = (ImageView) findViewById(R.id.product_image_1);
        productImage2 = (ImageView) findViewById(R.id.product_image_2);
        productImage3 = (ImageView) findViewById(R.id.product_image_3);
        productImage4 = (ImageView) findViewById(R.id.product_image_4);
        productImage5 = (ImageView) findViewById(R.id.product_image_5);
        productImage6 = (ImageView) findViewById(R.id.product_image_6);
        productImage7 = (ImageView) findViewById(R.id.product_image_7);

        productName1 = (TextView) findViewById(R.id.product_name_1);
        productName2 = (TextView) findViewById(R.id.product_name_2);
        productName3 = (TextView) findViewById(R.id.product_name_3);
        productName4 = (TextView) findViewById(R.id.product_name_4);
        productName5 = (TextView) findViewById(R.id.product_name_5);
        productName6 = (TextView) findViewById(R.id.product_name_6);
        productName7 = (TextView) findViewById(R.id.product_name_7);

        productPrice1 = (TextView) findViewById(R.id.product_price_1);
        productPrice2 = (TextView) findViewById(R.id.product_price_2);
        productPrice3 = (TextView) findViewById(R.id.product_price_3);
        productPrice4 = (TextView) findViewById(R.id.product_price_4);
        productPrice5 = (TextView) findViewById(R.id.product_price_5);
        productPrice6 = (TextView) findViewById(R.id.product_price_6);
        productPrice7 = (TextView) findViewById(R.id.product_price_7);

        btnProduct1 = (Button) findViewById(R.id.btn_product_1);
        btnProduct2 = (Button) findViewById(R.id.btn_product_2);
        btnProduct3 = (Button) findViewById(R.id.btn_product_3);
        btnProduct4 = (Button) findViewById(R.id.btn_product_4);
        btnProduct5 = (Button) findViewById(R.id.btn_product_5);
        btnProduct6 = (Button) findViewById(R.id.btn_product_6);
        btnProduct7 = (Button) findViewById(R.id.btn_product_7);



        btnProduct1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listProducts = new Intent(Main2Activity.this, ShowActivity.class);
                Bitmap image = ((BitmapDrawable)productImage1.getDrawable()).getBitmap();
                listProducts.putExtra("PRODUCT_IMAGE", image);
                listProducts.putExtra("PRODUCT_NAME", productName1.getText().toString());
                listProducts.putExtra("PRODUCT_PRICE", productPrice1.getText().toString());
                startActivity(listProducts);
            }
        });

//        btnProduct2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent listProducts = new Intent(Main2Activity.this, ShowActivity.class);
//                Bitmap image =((BitmapDrawable)productImage2.getDrawable()).getBitmap();
//                listProducts.putExtra("PRODUCT_IMAGE", image);
//                listProducts.putExtra("PRODUCT_NAME", productName2.getText().toString());
//                listProducts.putExtra("PRODUCT_PRICE", productPrice2.getText().toString());
//                startActivity(listProducts);
//            }
//        });
//
//        btnProduct3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent listProducts = new Intent(Main2Activity.this, ShowActivity.class);
//                Bitmap image =((BitmapDrawable)productImage3.getDrawable()).getBitmap();
//                listProducts.putExtra("PRODUCT_IMAGE", image);
//                listProducts.putExtra("PRODUCT_NAME", productName3.getText().toString());
//                listProducts.putExtra("PRODUCT_PRICE", productPrice3.getText().toString());
//                startActivity(listProducts);
//            }
//        });
//
//        btnProduct4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent listProducts = new Intent(Main2Activity.this, ShowActivity.class);
//                Bitmap image =((BitmapDrawable)productImage4.getDrawable()).getBitmap();
//                listProducts.putExtra("PRODUCT_IMAGE", image);
//                listProducts.putExtra("PRODUCT_NAME", productName4.getText().toString());
//                listProducts.putExtra("PRODUCT_PRICE", productPrice4.getText().toString());
//                startActivity(listProducts);
//            }
//        });
//
//        btnProduct5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent listProducts = new Intent(Main2Activity.this, ShowActivity.class);
//                Bitmap image =((BitmapDrawable)productImage5.getDrawable()).getBitmap();
//                listProducts.putExtra("PRODUCT_IMAGE", image);
//                listProducts.putExtra("PRODUCT_NAME", productName5.getText().toString());
//                listProducts.putExtra("PRODUCT_PRICE", productPrice5.getText().toString());
//                startActivity(listProducts);
//            }
//        });
//
//        btnProduct6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent listProducts = new Intent(Main2Activity.this, ShowActivity.class);
//                Bitmap image =((BitmapDrawable)productImage6.getDrawable()).getBitmap();
//                listProducts.putExtra("PRODUCT_IMAGE", image);
//                listProducts.putExtra("PRODUCT_NAME", productName6.getText().toString());
//                listProducts.putExtra("PRODUCT_PRICE", productPrice6.getText().toString());
//                startActivity(listProducts);
//            }
//        });
//
//        btnProduct7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent listProducts = new Intent(Main2Activity.this, ShowActivity.class);
//                Bitmap image =((BitmapDrawable)productImage7.getDrawable()).getBitmap();
//                listProducts.putExtra("PRODUCT_IMAGE", image);
//                listProducts.putExtra("PRODUCT_NAME", productName7.getText().toString());
//                listProducts.putExtra("PRODUCT_PRICE", productPrice7.getText().toString());
//                startActivity(listProducts);
//            }
//        });
//        ScrollView sv = new ScrollView(this);
//        FrameLayout.LayoutParams lpsv = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT);
//        sv.setLayoutParams(lpsv);
//
//        LinearLayout ll = new LinearLayout(this);
//        ll.setOrientation(LinearLayout.VERTICAL);
//        LinearLayout.LayoutParams lpll = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
//        ll.setLayoutParams(lpll);
//        sv.addView(ll);
//
//        for(int i = 0; i < 50; i++){
//            ImageView imgView = new ImageView(this);
//            imgView.setImageResource(R.drawable.ic_launcher_background);
//            ll.addView(imgView);
//
//            TextView txtView = new TextView(this);
//            txtView.setText("Produto " + i);
//            ll.addView(txtView);
//
//            TextView txtView1 = new TextView(this);
//            txtView1.setText(298 + i);
//            ll.addView(txtView1);
//        }


    }
}
