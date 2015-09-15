package org.yxf.app;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by yaxiongfang on 8/23/15.
 */
public abstract class CommonAdapter<T> extends BaseAdapter
{
    protected Context context;
    protected List<T> data;;
    protected  int layoutId;

    public CommonAdapter(Context context, List<T> data, int layoutId)
    {
        this.context = context;
        this.data = data;
        this.layoutId = layoutId;
    }

    @Override
    public int getCount()
    {
        return data == null ? 0 : data.size();
    }

    @Override
    public T getItem(int position)
    {
        return data == null ? null : data.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ViewHolder viewHolder = ViewHolder.getViewHolder(context, convertView, parent, layoutId);

        if(data != null)
        {
            fillData(viewHolder, data.get(position));
        }

        return viewHolder.getConvertView();
    }

    public abstract void fillData(ViewHolder viewHolder, T t);
}
