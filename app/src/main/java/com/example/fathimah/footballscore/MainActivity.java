package com.example.fathimah.footballscore;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnDetails1, btnDetails2;
    Button plusA , plusB , minusA , minusB;
    Button reset, berita, map;
    TextView textA , textB ;
    int valA , valB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDetails1 = (Button) findViewById(R.id.btn_details1);
        btnDetails1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DetailActivity1.class);
                startActivity(i);
            }
        });
        btnDetails2 = (Button) findViewById(R.id.btn_details2);
        btnDetails2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DetailActivity2.class);
                startActivity(i);
            }
        });
        plusA = (Button) findViewById(R.id.plusA);
        plusB = (Button) findViewById(R.id.plusB);
        minusA = (Button) findViewById(R.id.minusA);
        minusB = (Button) findViewById(R.id.minusB);
        textA = (TextView) findViewById(R.id.textA);
        textB = (TextView) findViewById(R.id.textB);
        valA = 0;
        valB = 0;

        plusA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valA = valA + 1;
                textA.setText(String.valueOf(valA));
            }
        });

        plusB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valB = valB + 1;
                textB.setText(String.valueOf(valB));
            }
        });

        minusA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valA = valA - 1;
                if (valA<0)
                    valA = 0;
                textA.setText(String.valueOf(valA));
            }
        });

        minusB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valB = valB - 1;
                if (valB<0)
                    valB = 0;
                textB.setText(String.valueOf(valB));
            }
        });

        reset = (Button) findViewById(R.id.reset);
        berita = (Button) findViewById(R.id.berita);
        map = (Button) findViewById(R.id.map);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valA = 0;
                valB = 0;
                textA.setText(String.valueOf(valA));
                textB.setText(String.valueOf(valB));
            }
        });

        berita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browser = new Intent(Intent.ACTION_VIEW);
                String url = "https://www.youtube.com/channel/UCkmW74fsm-A5GDatqz40bcw/videos";
                browser.setData(Uri.parse(url));
                startActivity(browser);
            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri loc = Uri.parse("geo:-6.996230, 107.529716");
                Intent map = new Intent(Intent.ACTION_VIEW, loc);
                map.setPackage("com.google.android.apps.maps");
                if(map.resolveActivity(getPackageManager()) != null){
                    startActivity(map);
                }
            }
        });

    }
}








    }
}