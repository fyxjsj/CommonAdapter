package org.yxf.app;

/**
 * Created by yaxiongfang on 8/23/15.
 */
public class DemoBean
{
    private String title;
    private String name;

    public DemoBean(String title, String name)
    {
        this.title = title;
        this.name = name;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}
