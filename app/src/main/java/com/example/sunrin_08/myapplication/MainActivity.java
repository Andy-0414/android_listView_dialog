package com.example.sunrin_08.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    final Context context = this;
    ListView lv;
    static MainAdapter ma;
    Button bt;
    createDialog dia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.list);
        ma = new MainAdapter(this);
        bt = findViewById(R.id.btn);
        ma.putItem("test","test","test");
        ma.putItem("test","test","test");
        ma.putItem("test","test","test");

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dia = new createDialog(context);
                dia.setCancelable(false);
                dia.show();
            }
        });

        lv.setAdapter(ma);
    }
}