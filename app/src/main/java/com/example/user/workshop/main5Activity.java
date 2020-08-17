package com.example.user.workshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class main5Activity extends AppCompatActivity {

    Button btn7;
    EditText et1;
    EditText et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        et1 = (EditText) findViewById(R.id.nameedit);
        et2 = (EditText) findViewById(R.id.emailedit);
        btn7 = (Button) findViewById(R.id.done);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x = et1.getText().toString();
                String y = et2.getText().toString();
                String z = "Customer Name : " + x + "\n"+"City : "+y;
                Intent intent6 = new Intent(main5Activity.this,main6Activity.class);
                intent6.putExtra("ab",z);
                startActivity(intent6);

            }
        });
    }
}
