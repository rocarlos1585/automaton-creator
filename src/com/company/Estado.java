package com.company;

import java.awt.*;

public class Estado {



    private int coordX, coordY;
    private String salida;
    private String simbolo;
    private String llegada;
    private String aceptacion;
    public static final int radio = 60;
    public static final int radioAceptacion = 70;

    public Estado( int coordX, int coordY, String salida, String simbolo, String llegada, String aceptacion) {

        this.coordX = coordX;
        this.coordY = coordY;
        this.salida = salida;
        this.simbolo = simbolo;
        this.llegada = llegada;
        this.aceptacion = aceptacion;
    }

    public void pintar(Graphics g){

            g.drawOval(this.coordX - radio / 2, this.coordY - radio / 2, radio, radio);

    }

    public void pintarAceptacion(Graphics g){
        g.setColor(Color.BLUE);
        g.drawOval(this.coordX - radio / 2, this.coordY - radio / 2, radio, radio);
        g.drawOval(this.coordX  - radioAceptacion / 2, this.coordY - radioAceptacion / 2, radioAceptacion, radioAceptacion);
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getLlegada() {
        return llegada;
    }

    public void setLlegada(String llegada) {
        this.llegada = llegada;
    }

    public String getAceptacion() {
        return aceptacion;
    }

    public void setAceptacion(String aceptacion) {
        this.aceptacion = aceptacion;
    }
}
