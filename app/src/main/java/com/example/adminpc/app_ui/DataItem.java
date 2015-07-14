package com.example.adminpc.app_ui;

public class DataItem {
    //int id;
    String name;
    String price;
    DataItem( String name,String price){
       // this.id = id;
        this.name = name;
        this.price = price;
    }
    String getPrice(){
        return this.price;
    }
    String getName(){
        return this.name;
    }



}
