package main;

import model.Buoi;

public class main {
    public static void main(String[] args){
        System.out.println("Hello World!!!");
        Buoi buoi = new Buoi();
        buoi.setID(1);
        buoi.setTen("Nam Roi");

        System.out.println(buoi.toString());
    }
}
