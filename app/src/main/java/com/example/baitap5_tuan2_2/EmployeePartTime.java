package com.example.baitap5_tuan2_2;

public class EmployeePartTime extends Employee{

    @Override
    public float TinhLuong() {
        return 150;
    }
    @Override
    public String toString(){
        return super.toString()+" --> Part time : "+TinhLuong();
    }
}
