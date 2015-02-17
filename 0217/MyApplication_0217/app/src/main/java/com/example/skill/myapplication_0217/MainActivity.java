package com.example.skill.myapplication_0217;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(), 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);

                Notification.Builder builder = new Notification.Builder(getApplicationContext());
                Notification notification = builder
                        // 通知の日時
                        .setWhen(System.currentTimeMillis())
                                // 通知のタイトル
                        .setContentTitle("通知だヨ！")
                                // 通知の詳細メッセージ
                        .setContentText("通知の詳しい内容をここに書きます。")
                                // 通知のアイコン
                        .setSmallIcon(R.drawable.ic_launcher)
                                // 通知を表示した瞬間、通知バーに表示するショートメッセージ
                        .setTicker("通知だヨ！")
                                // 通知をタップした時に使う PendingIntent
                        .setContentIntent(pendingIntent)
                                // この通知が未だ表示されていない時だけ、音やバイブレーション、ショートメッセージの表示を行う
                        .setOnlyAlertOnce(true)
                                // タップしたら消えるようにする
                        .setAutoCancel(true)
                        .build();


// 直接インスタンス化せず、Context を経由してインスタンスを取得する
                NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                // 通知の種類に応じて id を割当てることが出来る。
                // id の異なる通知は違うものとして扱われる。
                manager.notify(0, notification);


                //TODO: textの入力値チェックする


                //TODO: Activity1の呼び出し
            }
        });

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
        switch (item.getItemId()) {
            case R.id.action_settings:
                return true;
            case R.id.action_edit:
                Log.i("wara", "option_edit");
                return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
