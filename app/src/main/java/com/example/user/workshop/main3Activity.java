package com.example.user.workshop;

import android.app.Activity;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class main3Activity extends Activity {
    TextView myText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        myText = (TextView) findViewById(R.id.tvcId);

        new MyTask().execute("http://www.json-generator.com/api/json/get/bRCFkwFbxe?indent=2");



    }
    private class MyTask extends AsyncTask<String, String, String> {


        @Override
        protected void onPostExecute(String result) {
            // TODO Auto-generated method stub
            JSONObject jsonObj = null;
            try {
                jsonObj = new JSONObject(result);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            StringBuilder re = new StringBuilder();
            // Getting JSON Array node
            JSONArray books = jsonObj.optJSONArray("books");

            // looping through All Contacts
            for (int i = 0; i < books.length(); i++) {
                JSONObject c = books.optJSONObject(i);
                String id = c.optString("id");
                String name = c.optString("name");
                String writer = c.optString("writer");
                String type = c.optString("type");
                String avail = c.optString("avail");

                // Phone node is JSON Object

                String res = "\n\n"+id+"\n"+name+"\n"+writer+"\n"+type+"\n"+avail+"\n";
                re.append(res);
                Log.d("TAG", "onPostExecute: "+res);
            }
            myText.setText(re.toString());

        }
        @Override
        protected String doInBackground(String... strings) {
            StringBuilder result = new StringBuilder();

            HttpURLConnection urlConnection = null;
            try {
                URL url = new URL(strings[0]);
                urlConnection = (HttpURLConnection) url.openConnection();
                InputStream in = new BufferedInputStream(urlConnection.getInputStream());

                BufferedReader reader = new BufferedReader(new InputStreamReader(in));

                String line;
                while ((line = reader.readLine()) != null) {
                    result.append(line);
                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                urlConnection.disconnect();
            }
            return result.toString();
        }

    }

}





