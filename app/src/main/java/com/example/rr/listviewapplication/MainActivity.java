package com.example.rr.listviewapplication;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SimpleAdapter;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button1;
    private Button button2;
    private Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1= (Button) findViewById(R.id.button1);
        button2= (Button) findViewById(R.id.button2);
        button3= (Button) findViewById(R.id.button3);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
      Intent intent=new Intent();
        switch ( v.getId()){

            case R.id.button1:
              intent.setComponent(new ComponentName(MainActivity.this,ArrayActivity.class));
               startActivity(intent);break;
            case R.id.button2:
                intent.setComponent(new ComponentName(MainActivity.this,SimpleAdapter.class));
                startActivity(intent);
                break;
            case R.id.button3:
                intent.setComponent(new ComponentName(MainActivity.this,MyBase.class));
                startActivity(intent); break;
            default:  break;


        }
    }

    }

