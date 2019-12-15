package com.company;
import java.awt.*;
public class Vorobey extends Bird{
    public static  int d=40;
    public static int MinX = 1000, MaxX = -1000, MinY = 1000, MaxY = -1000;
    public  String name = "Cosy";
    public Vorobey (){
        System.out.println(name);
        this.color = new Color(0, 170, 176);
        this.size = d;
        this.x = (int) (Math.random()*MyWindow.w-MyWindow.w/2);
        this.y = (int) (Math.random()*MyWindow.h-MyWindow.h/2);
        MinX = Math.min(MinX, x);
        MinY = Math.min(MinY, y);
        MaxX = Math.max(MaxX, x);
        MaxY = Math.max(MaxY, y);
    }
    public void paint(Graphics g){
        g.drawOval(20,40,200,150);
    }
    public void fly(){
        System.out.println("I fly");
    }

}
