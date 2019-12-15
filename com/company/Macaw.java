package com.company;
import java.awt.*;
public class Macaw extends Bird {
    public static  int d=30;
    //private static  int num=0;
    public static int /*MinX = 1000, MaxX = -1000, MinY = 1000, MaxY = -1000,*/ x1=0, y1=0;
   // int x1, x2, y1, y2;
    public  String name = "Seny";

    public Macaw(){
        System.out.println(name);
        //num++;
         this.color = new Color(155, 76, 98);
         this.size = d;
         this.x = (int) (Math.random()*MyWindow.w-MyWindow.w/2);
         this.y = (int) (Math.random()*MyWindow.h-MyWindow.h/2);
        /* if((x1==0)&&(x2==0)&&(y1==0)&&(y2==0)){
          x1=this.x;
          y1=this.y;
         }else{
                       x2=x1;
                       y2=y1;
                       x1=this.x;
                       y1=this.y;
         }*/
        /* MinX = Math.min(MinX, x);
        MinY = Math.min(MinY, y);
        MaxX = Math.max(MaxX, x);
        MaxY = Math.max(MaxY, y);*/

    }

    public void draw(Graphics g) {
        g.setColor(this.color);
        g.fillOval(this.x, this.y, this.size, this.size);
        g.setColor(new Color(255, 91, 90));
       // g.drawLine(x1+d/2, y1+d/2, x2+d/2, y2+d/2);
        if((x1!=0)&&(y1!=0)){
            g.drawLine(x1+d/2, y1+d/2, x+d/2, y+d/2);
        }
            x1=x; y1=y;

    }
    public void fly(){
        System.out.println("I fly");
    }

}
