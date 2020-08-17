package com.example.user.workshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class main6Activity extends AppCompatActivity {

  // public TextView abc;
   public Button dd1,dd2,dd3,dd4,dd5,dd6,dd7,dd8,dd9;
    public String vv="";
   public String xyz,yy,rst;
   public  int price=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null)
        {
            xyz = bundle.getString("ab");
          // abc =(TextView)findViewById(R.id.tabc);
          // abc.setText(xyz);
        }
        dd1=(Button)findViewById(R.id.cc1);
        dd2=(Button)findViewById(R.id.cc2);
        dd3=(Button)findViewById(R.id.cc3);
        dd4=(Button)findViewById(R.id.cc4);
        dd5=(Button)findViewById(R.id.cc5);
        dd6=(Button)findViewById(R.id.done1);
        dd7=(Button)findViewById(R.id.cc6);
        dd8=(Button)findViewById(R.id.cc7);
        dd9=(Button)findViewById(R.id.cc8);

        dd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vv= vv+"\nBolaka 250/=";
                price=price+250;
            }
        });
        dd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vv= vv+"\nLal Nil Dipaboli 150/=";
                price = price+150;
            }
        });
        dd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vv= vv+"\nHarry Potter and The Philosophers Stone 300/=";
                price = price+300;
            }
        });
        dd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vv= vv+"\nTukunjil 140/=";
                price = price+140;
            }
        });

        dd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vv= vv+"\nAronnok 230/=";
                price=price+230;
            }
        });
        dd7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vv= vv+"\nSatkahon 330/=";
                price=price+330;
            }
        });
        dd8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vv= vv+"\nHajar Bochor Dhore 100/=";
                price=price+100;
            }
        });
        dd9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vv= vv+"\nkalpurush 400/=";
                price=price+400;
            }
        });

      // xyz = xyz +"\n" + vv ;


        dd6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                yy = String.valueOf(price);
                rst = xyz + "\n\nPurchased Items =" + vv + "\n\nTotal Cost = " + yy;
                Intent intent7 = new Intent(main6Activity.this, main7Activity.class);
                intent7.putExtra("lm", rst);
                startActivity(intent7);

            }

        });
    }

}
