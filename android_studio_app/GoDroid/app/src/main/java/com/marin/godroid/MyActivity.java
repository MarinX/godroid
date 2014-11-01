package com.marin.godroid;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import go.Go;
import go.godroid.Godroid;


public class MyActivity extends ActionBarActivity {
    Button send_to_go;
    Button web;
    EditText txt_to_go;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
       send_to_go = (Button)findViewById(R.id.b_to_go);
        web = (Button)findViewById(R.id.b_web);
        txt_to_go =(EditText)findViewById(R.id.e_txt);

        //Magic
        Go.init(getApplicationContext());

        send_to_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = txt_to_go.getText().toString();

                 //Push message to go
                Godroid.SayGo(message);

                Toast.makeText(getApplicationContext(),"Check your ADB log", Toast.LENGTH_SHORT).show();
            }
        });

        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MyActivity.this,Browser.class);
                startActivity(i);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
