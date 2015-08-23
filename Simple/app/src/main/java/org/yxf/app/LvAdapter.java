package org.yxf.app;

import android.content.Context;

import java.util.List;

/**
 * Created by yaxiongfang on 8/23/15.
 */
public class LvAdapter extends CommonAdapter<DemoBean>
{
    public LvAdapter(Context context, List<DemoBean> data)
    {
        super(context, data, R.layout.lv_item_layout);
    }

    @Override
    public void fillData(ViewHolder viewHolder, DemoBean bean)
    {
        viewHolder.setText(R.id.tv_title, bean.getTitle()).setText(R.id.tv_content, bean.getName()).setImageResourse(R.id.iv, R.mipmap.ic_launcher);
    }
}
