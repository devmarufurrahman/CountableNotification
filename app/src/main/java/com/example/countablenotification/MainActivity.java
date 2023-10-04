package com.example.countablenotification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    NotificationCounter notificationCounter;
    AppCompatButton notificationBtn;
    CardView notificationCardCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        notificationBtn = findViewById(R.id.notificationBtn);
        notificationCardCount = findViewById(R.id.notificationCountCard);

        notificationCounter = new NotificationCounter(findViewById(R.id.notificationBell));

        notificationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notificationCardCount.setVisibility(View.VISIBLE);
                notificationCounter.increaseNumber();
            }
        });
    }
}