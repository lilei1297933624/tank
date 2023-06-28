package com.lei.tank;

import java.awt.*;

public class Bullet {
    private static final int SPEED = 10;
    private static final int WIDTH = 15;
    private static final int HEIGHT = 15;

    private int x , y;
    private Dir dir;

    public Bullet(int x,int y ,Dir dir){
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public void paint(Graphics g){
        Color color = g.getColor();
        g.setColor(Color.RED);
        g.fillOval(x,y,WIDTH,HEIGHT);
        g.setColor(color);
        move();
    }

    private void move() {
        switch (dir){
            case LEFT:
                x -= SPEED;
                break;
            case UP:
                y -= SPEED;
                break;
            case DOWN:
                y += SPEED;
                break;
            case RIGHT:
                x += SPEED;
                break;
            default:
                break;
        }
    }

}
