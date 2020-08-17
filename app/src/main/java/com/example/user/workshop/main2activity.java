package com.example.user.workshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class main2activity extends AppCompatActivity {

    Button btn3;
    Button btn4;
    Button btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2activity);
        btn3 =(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.bttn4);
        btn5 =(Button)findViewById(R.id.btn5) ;
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(main2activity.this,main3Activity.class);
                startActivity(intent2);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(main2activity.this,main4Activity.class);
                startActivity(intent3);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(main2activity.this,main5Activity.class);
                startActivity(intent4);
            }
        });


    }
}
