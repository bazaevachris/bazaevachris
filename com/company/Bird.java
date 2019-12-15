package com.company;
import java.awt.*;
import java.util.Calendar;
import java.util.Date;

public abstract class Bird {
    protected int x;
    protected int y;
    protected int size;
    protected Color color;
    public Bird(){
        System.out.println("I'm a bird");
        System.out.print("I flew at: ");
        Date date = new Date();
        System.out.println(date.toString());
        String greeting;
        int temp = Calendar.getInstance().getTime().getHours();
        if (temp>=6 && temp<12){
            System.out.println(Calendar.getInstance().getTime().getHours()+"доброе утро");
        }
        if (temp>=12 && temp<18){
            System.out.println(Calendar.getInstance().getTime().getHours()+"добрый день");
        }
        if (temp < 4) greeting = "night";
        else if (temp < 12) greeting = "morning";
        else if (temp < 18) greeting = "afternoon";
        else greeting = "evening";
         System.out.print("Good " + greeting+ ", this is ");
    }
    public void draw(Graphics g){
        g.setColor(this.color);
        g.fillOval(this.x, this.y, this.size, this.size);
    }
    public void fly(){
        System.out.println("Fly");
    }

}
