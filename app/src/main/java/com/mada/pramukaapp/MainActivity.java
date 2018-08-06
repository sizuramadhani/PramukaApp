package com.mada.pramukaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button ababapbb = (Button) findViewById(R.id.abaabapbb);
        ababapbb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),abaabapbb.class);
                startActivity(a);
            }
        });

        final Button dasadharma = (Button) findViewById(R.id.btndasadharma);
        dasadharma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),dasadharma.class);
                startActivity(a);
            }
        });

        final Button dwidarmadwisatya = (Button) findViewById(R.id.btndwisatyadarma);
        dwidarmadwisatya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),dwidarmadwisatya.class);
                startActivity(a);
            }
        });

        final Button hymnepramuka = (Button) findViewById(R.id.btnhymnepramuka);
        hymnepramuka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),hymnepramuka.class);
                startActivity(a);
            }
        });

        final Button sandisandi = (Button) findViewById(R.id.btnsandi);
        sandisandi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),sandisandi.class);
                startActivity(a);
            }
        });
        final Button sejarahpramukadunia = (Button) findViewById(R.id.btnsejarahpramuka);
        sejarahpramukadunia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),sejarahpramukadunia.class);
                startActivity(a);
            }
        });

        final Button sejarahpramukaindo = (Button) findViewById(R.id.btnsejarahpramukaindo);
        sejarahpramukaindo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),sejarahpramukaindo.class);
                startActivity(a);
            }
        });

        final Button skkdantkk = (Button) findViewById(R.id.btnskktkk);
        skkdantkk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),skkdantkk.class);
                startActivity(a);
            }
        });
        final Button tku = (Button) findViewById(R.id.btntku);
        tku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),tku.class);
                startActivity(a);
            }
        });

        final Button trisatya = (Button) findViewById(R.id.btntrisatya);
        trisatya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(),trisatya.class);
                startActivity(a);
            }
        });
    }
}
