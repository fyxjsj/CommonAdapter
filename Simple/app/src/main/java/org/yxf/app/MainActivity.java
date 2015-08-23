package org.yxf.app;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity
{

    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.lv);

        List<DemoBean> data = new ArrayList<DemoBean>();

        for(int i=0; i < 2000;i++)
        {
            data.add(new DemoBean("我是标题" + i, "我是内容"+ i));
        }

        lv.setAdapter(new LvAdapter(this, data));

    }

}
