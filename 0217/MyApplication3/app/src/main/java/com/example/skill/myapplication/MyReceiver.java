package com.example.skill.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("wara","getAcion:"+ intent.getAction());

        Intent activity = new Intent();
        String text = intent.getStringExtra("text_data");
        activity.putExtra("text_data",text);
        activity.setClass(context,MainActivity_210_broad.class);
        activity.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        context.startActivity(activity);

    }
}
