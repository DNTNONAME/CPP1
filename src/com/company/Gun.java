package com.company;

import java.sql.SQLOutput;

public class Gun {
    private String Name;
    private int Length;
    private String Target;
    private int Price;

    public Gun() {};

    public Gun(String name, int length, String target, int price) {
        Name = name;
        Length = length;
        Target = target;
        Price = price;
    }
    String GetName(){
        return Name;
    }
    String GetTarget(){
        return Target;
    }
    int GetLength(){
        return Length;
    }
    int GetPrice(){
        return Price;
    }
}