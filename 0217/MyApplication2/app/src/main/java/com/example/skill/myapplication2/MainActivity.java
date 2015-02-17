package com.example.skill.myapplication2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    private static String TAG = "wara";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "-----onCreate");

       Button btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
             public void onClick(View v) {
                //TODO: Activity2の呼び出し
                Intent intent = new Intent();
                intent.setClassName(getApplicationContext(),"com.example.skill.myapplication2.MainActivity3");
                startActivity(intent);
            }
        });


        Context context = getApplicationContext();
        CharSequence text = "Hello onCreate!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "-----onStart");

        Context context = getApplicationContext();
        CharSequence text = "Hello onStart!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "-----onResume");

        Context context = getApplicationContext();
        CharSequence text = "Hello onResume!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "-----onPause");

        Context context = getApplicationContext();
        CharSequence text = "Hello onPause!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "-----onStop");

        Context context = getApplicationContext();
        CharSequence text = "Hello onStop!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "-----onDestroy");

        Context context = getApplicationContext();
        CharSequence text = "Hello onDestroy!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "-----onRestart");

        Context context = getApplicationContext();
        CharSequence text = "Hello onRestart!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
