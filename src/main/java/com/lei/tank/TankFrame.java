package com.lei.tank;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame extends Frame {
    int x = 200 , y = 200;

    public TankFrame()  {
        this.setSize(800,600);
        this.setResizable(false);
        this.setTitle("tank war");
        this.setVisible(true);
        this.addKeyListener(new MyKeyListener());
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }



    @Override
    public void paint(Graphics g) {
//        super.paint(g);
        g.fillRect(x,y,100,50);
//        x += 10;
//        y += 10;
    }

    class MyKeyListener extends KeyAdapter {

        boolean bL = false;
        boolean bU = false;
        boolean bR = false;
        boolean bD = false;
        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch (keyCode) {
                case KeyEvent.VK_LEFT:
                    bL = true;
                    x -= 10;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR = true;
                    x += 10;
                    break;
                case KeyEvent.VK_UP:
                    bU = true;
                    y -= 10;
                    break;
                case KeyEvent.VK_DOWN:
                    bD = true;
                    y += 10;
                    break;
                default:
                    break;
            }
            repaint();
            System.out.println("key pressed");
        }

        @Override
        public void keyReleased(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch (keyCode) {
                case KeyEvent.VK_LEFT:
                    bL = false;
                    x -= 10;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR = false;
                    x += 10;

                    break;
                case KeyEvent.VK_UP:
                    bU = false;
                    y -= 10;
                    break;
                case KeyEvent.VK_DOWN:
                    bD = false;
                    y += 10;
                    break;
                default:
                    break;
            }
            System.out.println("key release");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TankFrame tankFrame = new TankFrame();
//        while (true){
//            Thread.sleep(1000);
//            tankFrame.repaint();
//        }
    }
}
