package com.example.openclassroomsandroid;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.openclassroomsandroid.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    private TextView Home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Home=findViewById(R.id.txtHome);
        Bundle b=getIntent().getExtras();
        Home.setText("Bienvenue Mr "+b.getString("user")+" votre MDP: "+b.getString("password"));

        MaterialButton retour = (MaterialButton) findViewById(R.id.retour);

        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent secondPage = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(secondPage);
            }
        });

    }
}