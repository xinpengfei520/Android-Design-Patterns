package com.xpf.observer2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Magazine magazine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnSend = findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                subscriberMagazine();
            }
        });

        // 1.杂志(被观察者对象)
        magazine = new Magazine();
        // 2.小李(观察者对象1)
        Lee lee = new Lee();
        // 3.小王(观察者对象2)
        Wang wang = new Wang();
        // 4.小李和小王实现订阅(绑定订阅通知)
        magazine.addObserver(lee);
        magazine.addObserver(wang);
    }

    private void subscriberMagazine() {
        // 5.分发订阅的杂志
        magazine.deliverMagazine();
    }
}
