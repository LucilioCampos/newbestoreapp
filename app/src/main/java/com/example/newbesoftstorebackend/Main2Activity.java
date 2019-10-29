package com.example.newbesoftstorebackend;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ScrollView sv = new ScrollView(this);
        FrameLayout.LayoutParams lpsv = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT);
        sv.setLayoutParams(lpsv);

        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams lpll = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        ll.setLayoutParams(lpll);
        sv.addView(ll);

        for(int i = 0; i < 50; i++){
            ImageView imgView = new ImageView(this);
            imgView.setImageResource(R.drawable.ic_launcher_background);
            ll.addView(imgView);

            TextView txtView = new TextView(this);
            txtView.setText("Produto " + i);
            ll.addView(txtView);

            TextView txtView1 = new TextView(this);
            txtView1.setText(298 + i);
            ll.addView(txtView1);
        }

        setContentView(R.layout.activity_main2);
    }
}
