package com.example.jsontest;

import java.util.Map;

public class GsonObj {

    Map<String,String> map;

    public GsonObj(Map<String, String> map) {
        this.map = map;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }
}
