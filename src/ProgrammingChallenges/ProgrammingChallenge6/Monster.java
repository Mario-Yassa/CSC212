package ProgrammingChallenges.ProgrammingChallenge6;

import painter.SPainter;
import shapes.SCircle;
import shapes.SRectangle;

import java.awt.*;

public class Monster {
    private String name;
    private double size;
    private int eyes;

    public Monster(){
        name = "Default";
        size = 200;
        eyes = 10;
    }

    public Monster(String n,double s,int e){
        name = n;
        size = s;
        eyes = e;
    }

    public String toString() {
        String monster = "Name is " + name + "\n" + "Size is " + size + "\n" + "Number of Eyes is " + eyes;
        return monster;
    }

    private Color Color(){
        int r = (int) ((Math.random() * 256));
        int g = (int) ((Math.random() * 256));
        int b = (int) ((Math.random() * 256));
        return new Color(r,g,b);
    }

    private Color color = Color();

    private void DrawEye(SPainter painter){
        SCircle eye = new SCircle(size / 6);
        painter.setColor(Color.white);
        painter.paint(eye);
        painter.setBrushWidth(2);
        painter.setColor(Color.BLACK);
        painter.draw(eye);
        SCircle blackEye = new SCircle(size / 16);
        painter.paint(blackEye);

    }
    public double space(){
        double h = size/7;
        double w = h*7;
        SRectangle rec = new SRectangle(h, w);
        return size + rec.diagonal() / 2.5;
    }
    public void paint(SPainter painter){
        double h = size/7;
        double w = h*7;
        SRectangle rec = new SRectangle(h, w);
        painter.setColor(Color.BLACK);

        // Draw the Right ARM
        painter.mrt(size);
        painter.mbk(size / 10);
        painter.tr(45);
        painter.paint(rec);
        painter.tl(45);
        painter.mlt(size);
        painter.mfd(size / 10);


        // Draw the Left ARM
        painter.mlt(size);
        painter.mbk(size / 10);
        painter.tl(45);
        painter.paint(rec);
        painter.tr(45);
        painter.mrt(size);
        painter.mfd(size / 10);

        // Draw the left LEG
        painter.mbk(size);
        painter.mlt(size/5);
        painter.tr(100);
        painter.paint(rec);
        painter.tl(100);

        // Draw the Right LEG
        painter.mrt(2*(size/5));
        painter.tl(100);
        painter.paint(rec);
        painter.tr(100);
        painter.mlt((size/5));
        painter.mfd(size);

        // Draw the BODY
        SCircle body = new SCircle(size);
        painter.setColor(color);
        painter.paint(body);
        painter.setBrushWidth(4);
        painter.setColor(Color.BLACK);
        painter.draw(body);

        // Draw the EYE
        double scale = 180.0/(eyes);
        painter.tl();
        painter.tr(scale/2);
        for (int i = 0 ; i < eyes ; i++){
            painter.mfd(size);
            DrawEye(painter);
            painter.mbk(size);
            painter.tr(scale);
        }
        painter.tl(scale/2);
        painter.tl();

    }

}
