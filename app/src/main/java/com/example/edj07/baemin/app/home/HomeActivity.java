package com.example.edj07.baemin.app.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.edj07.baemin.R;

public class HomeActivity extends AppCompatActivity {

    private LinearLayout home_call_li;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_main);

        home_call_li = (LinearLayout) findViewById(R.id.home_call_li);
        home_call_li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
