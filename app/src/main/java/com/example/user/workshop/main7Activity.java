package com.example.user.workshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class main7Activity extends AppCompatActivity {

    public String pqr;
    TextView kk;
    Button pay1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        pay1 =(Button)findViewById(R.id.pay1) ;

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null)
        {
            pqr = bundle.getString("lm");
            kk =(TextView)findViewById(R.id.ttabc);
             kk.setText(pqr);
        }

        pay1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8 = new Intent(main7Activity.this,main8Activity.class);
                intent8.putExtra("pt", pqr);
                startActivity(intent8);
            }
        });
    }
}
