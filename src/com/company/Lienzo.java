package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

public class Lienzo extends JPanel implements MouseListener {

    private Vector<Estado> vectorEstados;
    private Vector<Enlace> vectorEnlaces;
    private Point p1, p2;


    public Lienzo(){

        this.vectorEstados = new Vector<>();
        this.vectorEnlaces = new Vector<>();
        this.addMouseListener(this);
    }

    @Override
    public void paint(Graphics g){
        for(Estado estados : vectorEstados){

            if (estados.getAceptacion().equals("yes") || estados.getAceptacion().equals("si") || estados.getAceptacion().equals("true")) {
                estados.pintarAceptacion(g);
            }

            else{
                estados.pintar(g);
            }
        }

        for(Enlace enlace : vectorEnlaces){
            enlace.pintar(g);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if( e.getButton() == MouseEvent.BUTTON1){

            if(this.vectorEstados.size()>=2){

                int respuesta = JOptionPane.showConfirmDialog(this, "desea ingresar la palabra");

                if(respuesta==0){

                    System.out.println("entro");
                }

                else{

                    String salida = JOptionPane.showInputDialog("ingrese la salida");
                    String simbolo = JOptionPane.showInputDialog("ingrese el simbolo");
                    String llegada = JOptionPane.showInputDialog("ingrese la llegada");
                    String aceptacion = JOptionPane.showInputDialog("es un estado de aceptacion?");

                    this.vectorEstados.add(new Estado(e.getX(), e.getY(), salida, simbolo, llegada, aceptacion));

                    repaint();


                }
            }

            else {
                String salida = JOptionPane.showInputDialog("ingrese la salida");
                String simbolo = JOptionPane.showInputDialog("ingrese el simbolo");
                String llegada = JOptionPane.showInputDialog("ingrese la llegada");
                String aceptacion = JOptionPane.showInputDialog("es un estado de aceptacion?");

                this.vectorEstados.add(new Estado(e.getX(), e.getY(), salida, simbolo, llegada, aceptacion));

                repaint();
            }
        }

        if(e.getButton() == MouseEvent.BUTTON3){
            for(Estado estado : vectorEstados){
                if(new Rectangle( estado.getCoordX() - Estado.radio/2, estado.getCoordY() - Estado.radio/2, Estado.radio, Estado.radio).contains(e.getPoint())){
                    if(p1==null){
                        p1 = new Point(estado.getCoordX(), estado.getCoordY());
                    }
                    else{
                        p2 = new Point(estado.getCoordX(), estado.getCoordY());
                        this.vectorEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
                        repaint();
                        p1=null;
                        p2=null;
                    }
                }
            }

        }
    }






    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }



    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }



    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }



    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }
}
