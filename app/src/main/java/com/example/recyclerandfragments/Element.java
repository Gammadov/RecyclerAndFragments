package com.example.recyclerandfragments;

public class Element {
    private String txt;
    private int id;

    public Element(String txt, int id){
        this.txt = txt;
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public int getId() {
        return id;
    }

    public String getTxt() {
        return txt;
    }
}
