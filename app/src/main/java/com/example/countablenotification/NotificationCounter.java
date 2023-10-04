package com.example.countablenotification;

import android.view.View;
import android.widget.TextView;

public class NotificationCounter {
    private TextView notificationCounterText;
    private final int MAX_NUMBER = 99;
    private int NOTIFICATION_NUMBER_COUNTER = 0;


    public NotificationCounter (View view){
        notificationCounterText = view.findViewById(R.id.counterText);

    }

    public void increaseNumber(){
        NOTIFICATION_NUMBER_COUNTER ++;
        if (NOTIFICATION_NUMBER_COUNTER > MAX_NUMBER){
            notificationCounterText.setText("99+");
        } else {
            notificationCounterText.setText(String.valueOf(NOTIFICATION_NUMBER_COUNTER));
        }
    }
}
