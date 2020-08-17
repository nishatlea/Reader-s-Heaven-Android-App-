package com.example.user.workshop;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class main4Activity extends AppCompatActivity {

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5,b6,b7,b8,b9,b10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        b1= (Button)findViewById(R.id.book1);
        b2=(Button)findViewById(R.id.book2);
        b3 =(Button)findViewById(R.id.book3);
        b4=(Button) findViewById(R.id.book4);
        b5=(Button)findViewById(R.id.book5);
        b6=(Button)findViewById(R.id.book6);
        b7=(Button)findViewById(R.id.book7);
        b8=(Button)findViewById(R.id.book8);
        b9=(Button)findViewById(R.id.book9);
        b10=(Button)findViewById(R.id.book10);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("http://bdebooks.com/books/"));
                startActivity(myWebLink);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("http://bdebooks.com/books/mrinmoyee-by-humayun-ahmed/"));
                startActivity(myWebLink);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("http://mediafire.com/file/pb8a8052djkxv9m/"));
                startActivity(myWebLink);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("http://mediafire.com/file/3gd05bidzc009af/"));
                startActivity(myWebLink);

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("http://mediafire.com/file/43wnvxv946a2yz0/"));
                startActivity(myWebLink);

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("http://bit.ly/2JxyhS9"));
                startActivity(myWebLink);

            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("https://bit.ly/2uBCGi8"));
                startActivity(myWebLink);

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("https://bit.ly/2mtXcNc"));
                startActivity(myWebLink);

            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("https://bit.ly/2zU5h7C"));
                startActivity(myWebLink);

            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("https://bit.ly/2L6aoqy "));
                startActivity(myWebLink);

            }
        });

    }
}
