package com.example.baitap5_tuan2_2;

public abstract class Employee {
    public String id;
    public String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract float TinhLuong();
    @Override
    public String toString(){
        return this.id +"-"+this.name;
    }


}
