package com.company;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Flock
{
    public static int num;
    private ArrayList<Bird> f;
    public Flock() {
        f = new ArrayList<>(0);
        Scanner in = new Scanner(System.in);
        for (int i = 0; ; i++)
        {
            System.out.println("Введите 0, чтобы добавить попугая. Число 1, чтобы добавить пнигвина. Число 2, что бы появился воробушек. И любое другое число, что перестать добавлять птиц и открыть окно: ");
            int num = in.nextInt();
            if (num == 0)
            {
                System.out.println("Вы добавили попугайчика");
                f.add(i, new Macaw());
            }
            if (num == 1)
            {
                    System.out.println("Вы добавили пингвинчика");
                    f.add(i, new Penguin());
            }
            if (num == 2)
            {
                System.out.println("Вы добавили воробушка");
                f.add(i, new Vorobey());
            }
            if (num != 0 && num != 1 && num != 2)
            {
                 break;
            }
        }

    }
    public void fly(){
        for(int i = 0; i < f.size();
            i++) {f.get(i).fly();
        }
    }
    public void draw(Graphics g){
        for(int i = 0;
            i < f.size();
            i++){f.get(i).draw(g);
        }
    }
}
