package org.yxf.app;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by yaxiongfang on 8/23/15.
 */
public class ViewHolder
{
    private Context context;
    private View convertView;
    private int layoutId;

    private SparseArray viewMap;

    public ViewHolder(Context context, View convertView, int layoutId)
    {
        this.context = context;
        this.convertView = convertView;
        this.layoutId = layoutId;

        this.viewMap = new SparseArray();
    }

    public static ViewHolder getViewHolder(Context context, View convertView, ViewGroup parent, int layoutId)
    {
        ViewHolder viewHolder = null;

        if (convertView == null)
        {
            convertView = LayoutInflater.from(context).inflate(layoutId, parent, false);
            viewHolder = new ViewHolder(context, convertView, layoutId);
            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        return viewHolder;
    }

    public <T extends View> T getView(int id)
    {
        View view = (View) viewMap.get(id);
        if (view == null)
        {
            view = convertView.findViewById(id);
            viewMap.put(id, view);
        }

        return (T) view;
    }

    public View getConvertView()
    {
        return convertView;
    }

    public ViewHolder setText(int tvId, String str)
    {
        TextView tv = getView(tvId);
        tv.setText(str);
        return this;
    }

    public ViewHolder setText(int tvId, int strId)
    {
        return setText(tvId, context.getString(strId));
    }

    public ViewHolder setImageUrl(int ivId, String imgUrl)
    {
        ImageView imageView = getView(ivId);
        // go load net img;
        return this;
    }

    public ViewHolder setImageResourse(int ivId, int resId)
    {
        ImageView imageView = getView(ivId);
        imageView.setBackgroundResource(resId);
        return this;
    }
}
