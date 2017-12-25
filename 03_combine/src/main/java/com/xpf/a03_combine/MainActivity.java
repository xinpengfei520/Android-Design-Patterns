package com.xpf.a03_combine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

// 组合模式
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Organization organization = new Organization();
        School school = organization.producer();
        school.doSomething();
    }
}
