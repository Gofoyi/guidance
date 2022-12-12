package com.example;

public class Item {

    String name;
    String desc;
    int pic;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public Item(String name, String desc, int pic) {
        this.name = name;
        this.desc = desc;
        this.pic = pic;
    }
}
