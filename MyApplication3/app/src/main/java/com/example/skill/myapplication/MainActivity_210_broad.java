package com.example.skill.myapplication;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity_210_broad extends ActionBarActivity {

    private MyReceiver mReceiver;
    private IntentFilter mIntentFilter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_210_broad);
        {
            //TODO:register broadcast receiver
            mReceiver = new MyReceiver();
            IntentFilter mIntentFilter = new IntentFilter();
            mIntentFilter.addAction("com.example.skill.myapplication_203.BROADCASTSAMPLE");


            Intent intent = getIntent();
           // String text = intent.getStringExtra(MainActivity.KeY_INTENT);
            TextView textView = (TextView)findViewById(R.id.textview);

           // textView.setText(text);

        }


    }

    @Override
    protected void onStart() {
        registerReceiver(mReceiver, mIntentFilter);

        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(mReceiver);

    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity_210_broad, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
