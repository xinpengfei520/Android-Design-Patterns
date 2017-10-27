package com.xpf.observerdemo;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSecond = (Button) findViewById(R.id.btnSecond);
        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });

        startService(new Intent(MainActivity.this, MyService.class));
    }

    @Override
    protected void onChange(String message) {
        Log.e("MainActivity", "message===" + message);
        Toast.makeText(MainActivity.this, "MainActivity:" + message, Toast.LENGTH_SHORT).show();
    }

}
