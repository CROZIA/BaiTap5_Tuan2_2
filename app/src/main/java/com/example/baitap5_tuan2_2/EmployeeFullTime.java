package com.example.baitap5_tuan2_2;

public class EmployeeFullTime extends Employee{

    @Override
    public float TinhLuong() {
        return 500;
    }
    @Override
    public String toString(){
        return super.toString() + " --> Full time : "+TinhLuong();
    }
}
