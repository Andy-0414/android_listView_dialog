package com.example.sunrin_08.myapplication;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class createDialog extends Dialog {
    private Context context;

    private TextView btn_c,btn_o;

    private EditText name,num,birth;
    public createDialog(@NonNull Context context) {
        super(context);
        this.context = context;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.dialog_main);
        btn_c = findViewById(R.id.c);
        btn_o = findViewById(R.id.o);

        name = findViewById(R.id.nameIn);
        num = findViewById(R.id.numIn);
        birth = findViewById(R.id.birthIn);

        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
        btn_o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.ma.putItem(name.getText().toString(),num.getText().toString(),birth.getText().toString());
                dismiss();
            }
        });
    }
}
