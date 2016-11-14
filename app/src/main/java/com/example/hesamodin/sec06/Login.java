package com.example.hesamodin.sec06;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button btn_login,btn_cancel;
    EditText edt_username,edt_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_login=(Button)findViewById(R.id.btn_login);
        btn_cancel=(Button)findViewById(R.id.btn_cancel);
        edt_username=(EditText)findViewById(R.id.edt_username);
        edt_password=(EditText)findViewById(R.id.edt_password);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // String user=edt_username.getText().toString();
              //  String pass=edt_password.getText().toString();
              //  user.trim();
              //  pass.trim();
              //  Log.d("user",user);
              //  Log.d("pass",pass);
              //  if((user=="1234")&&("1234" == pass))
             //   {
                   Intent intent = new Intent(Login.this, ProfileActivity.class);
                    startActivity(intent);
              //  }
              //  else
               //    Toast.makeText(Login.this,"نام کاربری یا کلمه عبور اشتباه است",Toast.LENGTH_LONG).show();
            }
        });

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent=new Intent(Login.this,MainActivity.class);
                startActivity(intent);

            }
        });
    }


}
