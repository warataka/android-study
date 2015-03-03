package com.example.skill.myapplication_224;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


/**
 * Created by skill on 2015/02/24.
 */
public class CustomListAdapter extends ArrayAdapter<user>{
    LayoutInflater mLayoutInflater;
    public CustomListAdapter(Context context, int resource,List<user> object ){
        super(context,resource,object);
        mLayoutInflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        //mLayoutInflater.

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = null;
        if(convertView == null){
            view = mLayoutInflater.inflate(R.layout.listite,parent,false);
        }else{
            view = convertView;
        }

        user User = getItem(position);
        ((TextView)view.findViewById(R.id.title)).setText(User.getmTitle());
        ((TextView)view.findViewById(R.id.message)).setText(User.getmMessage());
        ((TextView)view.findViewById(R.id.message2)).setText(User.getmMessage2());
        ((ImageView)view.findViewById(R.id.icon)).setImageDrawable(User.getmIcon());

        return view;
    }
}
