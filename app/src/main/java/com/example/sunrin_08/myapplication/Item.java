package com.example.sunrin_08.myapplication;

public class Item {
    private String name,num,birth;
    public Item(String name,String num,String birth){
        this.name = name;
        this.num = num;
        this.birth = birth;
    }

    public String getBirth() {
        return birth;
    }

    public String getName() {
        return name;
    }

    public String getNum() {
        return num;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
