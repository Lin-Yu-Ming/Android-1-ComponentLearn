package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button=(Button) findViewById(R.id.button2);
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public  void onClick(View v) {
                 button.setText("logout");
            }

        });
    }
}
