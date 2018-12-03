package com.company;

import java.awt.*;

public class Enlace {

    private int enlaceX1, enlaceY1, enlaceX2, enlaceY2;

    public Enlace(int enlaceX1, int enlaceY1, int enlaceX2, int enlaceY2) {
        this.enlaceX1 = enlaceX1;
        this.enlaceY1 = enlaceY1;
        this.enlaceX2 = enlaceX2;
        this.enlaceY2 = enlaceY2;
    }

    public void pintar(Graphics g){
        g.drawLine(enlaceX1, enlaceY1, enlaceX2, enlaceY2);
    }

    public int getEnlaceX1() {
        return enlaceX1;
    }

    public void setEnlaceX1(int enlaceX1) {
        this.enlaceX1 = enlaceX1;
    }

    public int getEnlaceY1() {
        return enlaceY1;
    }

    public void setEnlaceY1(int enlaceY1) {
        this.enlaceY1 = enlaceY1;
    }

    public int getEnlaceX2() {
        return enlaceX2;
    }

    public void setEnlaceX2(int enlaceX2) {
        this.enlaceX2 = enlaceX2;
    }

    public int getEnlaceY2() {
        return enlaceY2;
    }

    public void setEnlaceY2(int enlaceY2) {
        this.enlaceY2 = enlaceY2;
    }
}
