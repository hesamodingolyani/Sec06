package com.example.hesamodin.sec06;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;



public class Registering extends AppCompatActivity {

    Button btn_register,btn_cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registering);

        List<String> list=new ArrayList<String>();
        list.add(0,"کاردانی");
        list.add(1,"کارشناسی");
        list.add(2,"کارشناسی ارشد");
        list.add(3,"دکتری");
        Spinner education=(Spinner)findViewById(R.id.education);
        ArrayAdapter<String> adp_education=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,list);
        education.setAdapter(adp_education);

        btn_register=(Button)findViewById(R.id.btn_register);
        btn_cancel=(Button)findViewById(R.id.btn2_cancel);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertbuilder=new AlertDialog.Builder(Registering.this);
                alertbuilder.setMessage("عملیات ثبت نام با موفقیت انجام شد . به صفحه ورود به سیستم هدایت می شوید");
                alertbuilder.setIcon(R.drawable.person);
                alertbuilder.setCancelable(false);

                alertbuilder.setPositiveButton("تائید", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent =new Intent(Registering.this,Login.class);
                        startActivity(intent);

                    }
                }).show();
            }
        });

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Registering.this,MainActivity.class);
                startActivity(intent);

            }
        });
    }


}
