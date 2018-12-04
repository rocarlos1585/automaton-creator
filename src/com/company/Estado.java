package com.company;

import java.awt.*;

public class Estado {



    private int coordX, coordY;
    private String nombre;
    private String aceptacion;
    public static final int radio = 60;
    public static final int radioAceptacion = 70;

    public Estado( int coordX, int coordY, String nombre, String aceptacion) {

        this.coordX = coordX;
        this.coordY = coordY;
        this.nombre = nombre;

        this.aceptacion = aceptacion;
    }

    public void pintar(Graphics g){

            g.drawOval(this.coordX - radio / 2, this.coordY - radio / 2, radio, radio);
            g.drawString(nombre, coordX, coordY);

    }

    public void pintarAceptacion(Graphics g){
        g.setColor(Color.BLUE);
        g.drawOval(this.coordX - radio / 2, this.coordY - radio / 2, radio, radio);
        g.drawOval(this.coordX  - radioAceptacion / 2, this.coordY - radioAceptacion / 2, radioAceptacion, radioAceptacion);
        g.drawString(nombre, coordX, coordY);
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getAceptacion() {
        return aceptacion;
    }

    public void setAceptacion(String aceptacion) {
        this.aceptacion = aceptacion;
    }
}
