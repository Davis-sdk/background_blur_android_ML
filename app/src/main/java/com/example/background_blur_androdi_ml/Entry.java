package com.example.background_blur_androdi_ml;

import java.io.Serializable;

public class Entry implements Serializable
{
    int _id;
    String path;
    String map;


    public int get_id() { return _id; }
    public void set_id(int _id){this._id = _id;}

    public String getPath(){return path;}
    public void setPath(String path){this.path = path;}

    public String getMap() {return map; }
    public void setMap(String map) {this.map = map;}

}
