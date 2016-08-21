package com.app01.lianxi.biying;

import android.support.v4.content.ContextCompat;
import android.support.v4.view.ScrollingView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextPaint;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.app01.lianxi.biying.mode.Conntent;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.title);
        toolbar.setLogo(R.drawable.l);
        toolbar.setTitle(R.string.tit_name);
        toolbar.setTitleTextColor(ContextCompat.getColor(toolbar.getContext(), R.color.white));
        toolbar.setBackgroundColor(ContextCompat.getColor(toolbar.getContext(), R.color.colorPrimary));

        setSupportActionBar(toolbar);


        ListView listView = (ListView) findViewById(R.id.list);


        BaseAdapter baseAdapter = new BaseAdapter() {
            @Override
            public int getCount() {
                return 2;
            }

            @Override
            public Object getItem(int position) {
                return null;
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {

                RelativeLayout relativeLayout = new RelativeLayout(MainActivity.this);
                relativeLayout.setPadding(80, 50, 80, 50);


                //日期
                TextView textView = new TextView(MainActivity.this);
                textView.setId(View.generateViewId());
                textView.setTextSize(25);
                //字体加粗
                TextPaint textPaint = textView.getPaint();
                textPaint.setFakeBoldText(true);
                textView.setPadding(5, 20, 0, 20);
                textView.setText(R.string.today);
                RelativeLayout.LayoutParams dateparam = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
                textView.setTextColor(ContextCompat.getColor(textView.getContext(), R.color.colorPrimaryDark));
                dateparam.addRule(RelativeLayout.RIGHT_OF, R.id.solid);
                textView.setLayoutParams(dateparam);
                relativeLayout.addView(textView);

                //间隔
                View jiange = new View(MainActivity.this);
                jiange.setId(View.generateViewId());
                jiange.setBackgroundResource(R.color.lightgrey);
                RelativeLayout.LayoutParams jiangeParam = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, 50);
                jiangeParam.addRule(RelativeLayout.BELOW, textView.getId());
                jiange.setLayoutParams(jiangeParam);
                relativeLayout.addView(jiange);

                //每日一词
                RelativeLayout relativeLayout1 = new RelativeLayout(MainActivity.this);
                relativeLayout1.setId(View.generateViewId());
                relativeLayout1.setBackgroundColor(ContextCompat.getColor(relativeLayout1.getContext(), R.color.white));
                RelativeLayout.LayoutParams word = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
                word.addRule(RelativeLayout.BELOW, jiange.getId());
                relativeLayout1.setLayoutParams(word);
                relativeLayout.addView(relativeLayout1);

                //图片
                ImageView imageView = new ImageView(MainActivity.this);
                imageView.setId(View.generateViewId());
                imageView.setPadding(15, 15, 15, 15);
                imageView.setImageResource(R.drawable.word);
                RelativeLayout.LayoutParams image = new RelativeLayout.LayoutParams(300, 300);
                imageView.setLayoutParams(image);
                relativeLayout1.addView(imageView);

                //单词
                TextView textView1 = new TextView(MainActivity.this);
                textView1.setId(View.generateViewId());
                textView1.setPadding(50, 5, 5, 5);
                textView1.setText(R.string.word);
                textView1.setTextSize(25);
                textView1.setTextColor(ContextCompat.getColor(textView1.getContext(), R.color.today));
                RelativeLayout.LayoutParams textparm = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
                textparm.addRule(RelativeLayout.RIGHT_OF, imageView.getId());
                textView1.setLayoutParams(textparm);
                relativeLayout1.addView(textView1);


                //                音标
                TextView textView2 = new TextView(MainActivity.this);
                textView2.setId(View.generateViewId());
                textView2.setTextSize(20);
                textView2.setPadding(50, 5, 5, 10);
                textView2.setText(R.string.yinbiao);
                RelativeLayout.LayoutParams yinparam = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
                yinparam.addRule(RelativeLayout.BELOW, textView1.getId());
                yinparam.addRule(RelativeLayout.RIGHT_OF, imageView.getId());
                textView2.setLayoutParams(yinparam);
                relativeLayout1.addView(textView2);

                //词义
                TextView textView3 = new TextView(MainActivity.this);
                textView3.setId(View.generateViewId());
                textView3.setPadding(50, 15, 5, 5);
                textView3.setText(R.string.ciyi);
                RelativeLayout.LayoutParams yiparam = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
                yiparam.addRule(RelativeLayout.BELOW, textView2.getId());
                yiparam.addRule(RelativeLayout.RIGHT_OF, imageView.getId());
                textView3.setLayoutParams(yiparam);
                relativeLayout1.addView(textView3);

                //线
                View view = new View(MainActivity.this);
                view.setBackgroundColor(ContextCompat.getColor(view.getContext(), R.color.line));
                view.setId(View.generateViewId());
                RelativeLayout.LayoutParams lineparam = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, 1);
                lineparam.addRule(RelativeLayout.BELOW, imageView.getId());
                view.setLayoutParams(lineparam);
                relativeLayout1.addView(view);

                //每日一词
                TextView textView4 = new TextView(MainActivity.this);
                textView4.setId(View.generateViewId());
                textView4.setPadding(40, 50, 30, 50);
                textView4.setText(R.string.dayword);
                RelativeLayout.LayoutParams wordparm = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
                wordparm.addRule(RelativeLayout.BELOW, view.getId());
                textView4.setLayoutParams(wordparm);
                relativeLayout1.addView(textView4);

                //                添加的生词
                ImageView imageView1 = new ImageView(MainActivity.this);
                imageView1.setId(View.generateViewId());
                imageView1.setPadding(10, 10, 10, 0);
                imageView1.setImageResource(R.drawable.tian);
                RelativeLayout.LayoutParams imgparam = new RelativeLayout.LayoutParams(130, 130);
                imgparam.addRule(RelativeLayout.BELOW, view.getId());
                imgparam.addRule(RelativeLayout.ALIGN_PARENT_END);
                imageView1.setLayoutParams(imgparam);
                relativeLayout1.addView(imageView1);

                View kong = new View(MainActivity.this);
                kong.setId(View.generateViewId());
                kong.setBackgroundResource(R.color.lightgrey);
                RelativeLayout.LayoutParams kongParam = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, 50);
                kongParam.addRule(RelativeLayout.BELOW, relativeLayout1.getId());
                kong.setLayoutParams(kongParam);
                relativeLayout.addView(kong);

                //            布局
                RelativeLayout relate = new RelativeLayout(MainActivity.this);
                relate.setId(View.generateViewId());
                relate.setHorizontalScrollBarEnabled(true);
                relate.setBackgroundColor(ContextCompat.getColor(relate.getContext(),R.color.white));
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
                layoutParams.addRule(RelativeLayout.BELOW,kong.getId());
                relate.setLayoutParams(layoutParams);
                relativeLayout.addView(relate);

                ImageView imageView2 = new ImageView(MainActivity.this);
                imageView2.setPadding(10,10,10,10);
                imageView2.setId(View.generateViewId());
                imageView2.setImageResource(R.drawable.scb);
                RelativeLayout.LayoutParams layoutParam1 = new RelativeLayout.LayoutParams(130,130);
                layoutParam1.addRule(RelativeLayout.BELOW,kong.getId());
                imageView2.setLayoutParams(layoutParam1);
                relate.addView(imageView2);

                  //     短文标题
                TextView textView5 = new TextView(MainActivity.this);
                textView5.setId(View.generateViewId());
                textView5.setText(R.string.texttitle);
                textView5.setPadding(10,15,10,15);
                textView5.setTextColor(ContextCompat.getColor(textView5.getContext(),R.color.black));
                RelativeLayout.LayoutParams layoutParams1 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
                layoutParams1.addRule(RelativeLayout.RIGHT_OF,imageView2.getId());
                layoutParams1.addRule(RelativeLayout.BELOW,kong.getId());
                textView5.setLayoutParams(layoutParams1);
                relate.addView(textView5);

                TextView textaut = new TextView(MainActivity.this);
                textaut.setId(View.generateViewId());
                textaut.setText(R.string.textauthor);
                textaut.setTextColor(ContextCompat.getColor(textaut.getContext(),R.color.colorPrimary));
                RelativeLayout.LayoutParams auparam = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
                auparam.addRule(RelativeLayout.RIGHT_OF,imageView2.getId());
                auparam.addRule(RelativeLayout.BELOW,textView5.getId());
                textaut.setLayoutParams(auparam);
                relate.addView(textaut);
















                return relativeLayout;
            }


        };


        listView.setAdapter(baseAdapter);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.listmenu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }


    public List<Conntent> conntext() {
        List<Conntent> list = new ArrayList<Conntent>();


        return list;
    }




}
