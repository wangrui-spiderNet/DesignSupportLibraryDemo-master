package com.hujiang.designsupportlibrarydemo;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

//    private ListView listView;
//    private ArrayList<Info> list;
    private LinearLayout layoutContainer;
    private LayoutInflater inflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        layoutContainer=(LinearLayout)findViewById(R.id.layout_container);
        inflater=LayoutInflater.from(this);

        Toolbar toolbar = (Toolbar) this.findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle("我的课程");

//        list=new ArrayList<Info>();
//
        for(int i=0;i<5;i++){
//            list.add(new Info());
            layoutContainer.addView(inflater.inflate(R.layout.list_item_card_detail,null));
        }
//
//        listView=(ListView)findViewById(R.id.listView);
//        MyAdapter myAdapter=new MyAdapter();
//        listView.setAdapter(myAdapter);

    }

    public void checkin(View view) {
        Snackbar.make(view, "checkin success!", Snackbar.LENGTH_SHORT).show();
    }

//    class MyAdapter extends BaseAdapter{
//        @Override
//        public int getCount() {
//            return list.size();
//        }
//
//        @Override
//        public Object getItem(int position) {
//            return list.get(position);
//        }
//
//        @Override
//        public long getItemId(int position) {
//            return position;
//        }
//
//        @Override
//        public View getView(int position, View convertView, ViewGroup parent) {
//
//            if(convertView==null){
//               convertView= LayoutInflater.from(DetailActivity.this).inflate(R.layout.list_item_card_detail,null);
//            }
//
//            return convertView;
//        }
//    }

}
