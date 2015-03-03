package com.example.skill.myapplication_224;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<user> list = new ArrayList<user>();
        user user1 = new user();
        user1.setmIcon(getResources().getDrawable(R.drawable.ic_launcher));
        user1.setmTitle("タイトル01");
        user1.setmMessage("出版社01");
        user1.setmMessage2("0円");

        user user2 = new user();
        user2.setmIcon(getResources().getDrawable(R.drawable.ic_launcher));
        user2.setmTitle("タイトル02");
        user2.setmMessage("出版社02");
        user2.setmMessage2("message201");


        user user3 = new user();
        user3.setmIcon(getResources().getDrawable(R.drawable.ic_launcher));
        user3.setmTitle("タイトル03");
        user3.setmMessage("出版社03");
        user3.setmMessage2("message201");

        list.add(user1);
        list.add(user2);
        list.add(user3);

        //TODO:文字白。アプリケーション全体のコンテキストをとってくる
        // ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,new String[]{ "hoge1","hoge2","hoge3","hoge4","hoge5","hoge6","hoge7"});

        //TODO:文字黒
        // ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,new String[]{ "hoge1","hoge2","hoge3","hoge4","hoge5","hoge6","hoge7"});
        Log.d("wara", "abc1");

        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.listite, new String[]{"hoge1", "hoge2", "hoge3", "hoge4", "hoge5", "hoge6", "hoge7"});

        Log.d("wara", "abc");
        CustomListAdapter customListAdapter = new CustomListAdapter(this, R.layout.listite, list);


        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(customListAdapter);
        listView.setOnItemClickListener(this);
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

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Log.i("wara", "position:" + position);
        String item = (String) parent.getItemAtPosition(position);

        Log.i("wara", "Posion item:" + item);

    }
}
