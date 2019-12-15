package com.company;
import javax.swing.*;
import java.awt.*;
public class MyWindow extends JFrame{
    private  Flock f;
    public static int w=800, h=800;
    public  MyWindow(Flock f){
        this.f=f;
        this.setSize(w,h);
        this.setBackground(Color.BLACK);
        this.setVisible(true);
        this.setTitle("Okno");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void paint(Graphics g){
        int x = getWidth()/2;
        int y = getHeight()/2;
        g.translate(x, y);
        g.setColor(Color.white);
        g.fillRect(-x, -y, 2*x, 2*x);
        Color pColor = new Color(196, 0, 11);
        g.setColor(pColor);
        g.drawLine(-x, 0, x, 0);
        g.drawLine(0, -y, 0, y);
        f.draw(g);
        g.setColor(new Color(255,153,116));
        g.drawRect(Penguin.MinX, Penguin.MinY, (Penguin.MaxX-Penguin.MinX+Penguin.d), (Penguin.MaxY-Penguin.MinY+Penguin.d));
        g.setColor(new Color(0,170,176));
        g.drawRect(Vorobey.MinX, Vorobey.MinY, (Vorobey.MaxX-Vorobey.MinX+Vorobey.d), (Vorobey.MaxY-Vorobey.MinY+Vorobey.d));
    }
    private void paintStuff(Graphics g) {
    }
}







