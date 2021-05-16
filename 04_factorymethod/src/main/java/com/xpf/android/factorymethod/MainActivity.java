package com.xpf.android.factorymethod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xpf.android.factorymethod.factory.SimpleFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String data = "123";
        SimpleFactory.getExport(SimpleFactory.TYPE_DB).export(data);
        SimpleFactory.getExport(SimpleFactory.TYPE_TEXT).export(data);
        SimpleFactory.getExport(SimpleFactory.TYPE_EXCEL).export(data);
        SimpleFactory.getExport(4).export(data);
    }
}