package com.example.adminpc.app_ui;

/**
 * Created by Admin PC on 7/10/2015.
 */
public class WaxItems {
    //int id;
    String name;
    String price;
    WaxItems( String name,String price){
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
