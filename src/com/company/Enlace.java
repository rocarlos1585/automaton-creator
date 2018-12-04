package com.company;

import java.awt.*;

public class Enlace {

    private int enlaceX1, enlaceY1, enlaceX2, enlaceY2;
    private String simbolo;
    private String from;
    private String aceptacionFrom;
    private String to;
    private String aceptacionTo;

    public Enlace(int enlaceX1, int enlaceY1, String from, String aceptacionFrom,  int enlaceX2, int enlaceY2, String to, String aceptacionTo,String simbolo) {
        this.enlaceX1 = enlaceX1;
        this.enlaceY1 = enlaceY1;
        this.from = from;
        this.aceptacionFrom = aceptacionFrom;
        this.enlaceX2 = enlaceX2;
        this.enlaceY2 = enlaceY2;
        this.to = to;
        this.aceptacionTo = aceptacionTo;
        this.simbolo = simbolo;
    }

    public void pintar(Graphics g){

        g.drawLine(enlaceX1, enlaceY1, enlaceX2, enlaceY2);

        if(enlaceX1 > enlaceX2 && enlaceY1 > enlaceY2){
            g.drawString(simbolo, enlaceX1 - Math.abs((enlaceX1 - enlaceX2)/2), enlaceY1 - Math.abs((enlaceY1 - enlaceY2)/2));
        }
        else if(enlaceX1 < enlaceX2 && enlaceY1 < enlaceY2){
            g.drawString(simbolo, enlaceX2 - Math.abs((enlaceX1 - enlaceX2)/2), enlaceY2 - Math.abs((enlaceY1 - enlaceY2)/2));
        }
        else if(enlaceX1 > enlaceX2 && enlaceY1 < enlaceY2){
            g.drawString(simbolo, enlaceX1 - Math.abs((enlaceX1 - enlaceX2)/2), enlaceY2 - Math.abs((enlaceY1 - enlaceY2)/2));
        }
        else if(enlaceX1 < enlaceX2 && enlaceY1 > enlaceY2){
            g.drawString(simbolo, enlaceX2 - Math.abs((enlaceX1 - enlaceX2)/2), enlaceY1 - Math.abs((enlaceY1 - enlaceY2)/2));
        }
    }

    public String getAceptacionFrom() {
        return aceptacionFrom;
    }

    public void setAceptacionFrom(String aceptacionFrom) {
        this.aceptacionFrom = aceptacionFrom;
    }

    public String getAceptacionTo() {
        return aceptacionTo;
    }

    public void setAceptacionTo(String aceptacionTo) {
        this.aceptacionTo = aceptacionTo;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
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
