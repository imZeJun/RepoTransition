package com.demo.lizejun.repotransition.bean;


public class GridItemBean {

    private int icon;
    private String title;

    public GridItemBean(int icon, String title) {
        this.icon = icon;
        this.title = title;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public int getIcon() {
        return icon;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
