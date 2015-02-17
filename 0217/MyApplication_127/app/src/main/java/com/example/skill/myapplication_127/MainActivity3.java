package com.example.skill.myapplication_127;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity3 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3);

        Button btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View v) {
                //TODO: Activity1の呼び出し
                Intent intent = new Intent();
                intent.setClassName(getApplicationContext(), "com.example.skill.myapplication_127.MainActivity");

                //  intent.setClassName("com.google.android.GoogleCamera", "com.android.camera.CameraLauncher");

                setResult(RESULT_OK, intent);
                finish();
            }

        });

        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity.KeY_INTENT);
        TextView textView = (TextView)findViewById(R.id.textview);

        textView.setText(text);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity3, menu);
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
