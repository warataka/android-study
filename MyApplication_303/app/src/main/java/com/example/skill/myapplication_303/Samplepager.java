package com.example.skill.myapplication_303;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by skill on 2015/03/03.
 */
public class Samplepager extends PagerAdapter {

    private Context mContext;

    //TODO:こんすとらくたー
    public Samplepager(Context context) {
        super();
        mContext = context;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        TextView textView = new TextView(mContext);
        textView.setText("position: " + position);

        container.addView(textView);
        return textView;
    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
        //super.destroyItem(container, position, object);
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == (TextView)object;
    }
}
