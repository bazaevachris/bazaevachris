package com.company;
import java.awt.*;
public class Penguin extends Bird{
    public static  int d=20;
   public static int MinX = 1000, MaxX = -1000, MinY = 1000, MaxY = -1000;
    public  String name = "Rosy";
    public Penguin(){
        System.out.println(name);
        this.color = new Color(104, 23, 141);
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
    public void draw(Graphics g) {
        g.setColor(this.color);
        g.fillOval(this.x, this.y, this.size, this.size);
        g.setColor(new Color(255, 153, 116));
        g.fillOval(this.x + 8, this.y + 8, this.size / 5, this.size / 5);
    }
        public void fly(){
        System.out.println("I fly");
    }
}
