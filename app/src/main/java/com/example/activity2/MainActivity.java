package com.example.activity2;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;

    EditText edEmail, edPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin=findViewById(R.id.btSignin);

        edEmail=findViewById(R.id.edEmail);

        edPassword=findViewById(R.id.edPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = edEmail.getText().toString();

                String password =edPassword.getText().toString();


                if(nama.equals("admin") && password.equals("admin")){
                    Toast.makeText(getApplicationContext(),"Login Sukses",
                            Toast.LENGTH_SHORT).show();
                }
                else if(nama.equals("admin") != nama.equals("")) {
                    Toast.makeText(getApplicationContext(), "Password salah",
                            Toast.LENGTH_SHORT).show();
                }
                else if(password.equals("admin") != password.equals("")){
                    Toast.makeText(getApplicationContext(),"email salah",
                            Toast.LENGTH_SHORT).show();
                }

                else {
                    Toast.makeText(getApplicationContext(), "email dan Password Anda Salah",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}