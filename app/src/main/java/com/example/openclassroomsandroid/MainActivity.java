package com.example.openclassroomsandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        //username = martin  && password = martin

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("martin") && password.getText().toString().equals("martin")){
                    //correct
                    Toast.makeText(MainActivity.this,"CONNEXION REUSSI",Toast.LENGTH_SHORT).show();
                    Intent secondPage = new Intent(MainActivity.this,SecondActivity.class);
                    Bundle b=new Bundle();
                    b.putString("user", username.getText().toString());
                    b.putString("password", password.getText().toString());

                    secondPage.putExtras(b);
                    startActivity(secondPage);
                }else
                    //incorrect
                    Toast.makeText(MainActivity.this,"ECHEC DE CONNEXION !!!",Toast.LENGTH_SHORT).show();
            }

        });


    }
}