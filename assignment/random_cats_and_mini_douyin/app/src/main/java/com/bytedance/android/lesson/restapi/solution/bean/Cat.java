package com.bytedance.android.lesson.restapi.solution.bean;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Xavier.S
 * @date 2019.01.17 18:08
 */
public class Cat {
    // TODO-C1 (1) Implement your Cat Bean here according to the response json
    private List breeds;
    private String id;
    private String url;
    private int width;
    private int height;

    public List getList() { return breeds;}
    public String getId() {return id;}
    public String getUrl(){return url;}
    public int getWidth(){return width;}
    public int getHeight(){return height;}
}
