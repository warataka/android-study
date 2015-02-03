package com.example.skill.myapplication_127;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {


    private static final int RESULT_CODE_1 = 0x01;
    public static String KeY_INTENT = "text_data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button3);

        btn.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View v) {

                EditText editText = (EditText)findViewById(R.id.edittext);
                String text = editText.getText().toString();


                //TODO: textの入力値チェックする


                //TODO: Activity1の呼び出し
                Intent intent = new Intent();
                intent.setClassName(getApplicationContext(), "com.example.skill.myapplication_127.MainActivity3");
                intent.putExtra("text_data",text);
                //  intent.setClassName("com.google.android.GoogleCamera", "com.android.camera.CameraLauncher");
                startActivityForResult(intent, RESULT_CODE_1);
            }
        });

    }





    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case RESULT_CODE_1: {
                switch (resultCode) {
                    case RESULT_OK: {
                        Toast.makeText(getApplicationContext(), "RESULT_OK", Toast.LENGTH_SHORT).show();

                    }
                    case RESULT_CANCELED:{
                        Toast.makeText(getApplicationContext(), "RESULT_CANCELED", Toast.LENGTH_SHORT).show();

                    }
                }
            }


        }
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
