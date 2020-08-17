package com.example.user.workshop;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class main8Activity extends AppCompatActivity {

    Button btnSendSMS;
    EditText txtPhoneNo;
     String bnm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        btnSendSMS = (Button) findViewById(R.id.phbtn);
        txtPhoneNo = (EditText) findViewById(R.id.phone);
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null)
        {
            bnm = bundle.getString("pt");

        }
        btnSendSMS.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                String phoneNo = txtPhoneNo.getText().toString();
                String message = bnm;
                if (phoneNo.length()>0 && message.length()>0) {
                   // sendSMS(phoneNo, message);
                    Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                    sendIntent.putExtra("address", phoneNo);
                    sendIntent.putExtra("sms_body", message);
                    sendIntent.setType("vnd.android-dir/mms-sms");
                    startActivity(sendIntent);


                }
                else
                    Toast.makeText(getBaseContext(),
                            "Please enter both phone number and message.",
                            Toast.LENGTH_SHORT).show();
            }
        });
    }

}
