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
    private String nombreP1;
    private String aceptacionP1;
    private String nombreP2;
    private String aceptacionP2;
    private String cadenaEvaluar;





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

    public void comprobacion(String cadena){

        String estadoActual;
        String estadoSiguiente;
        String aux;

        for(Enlace enlace : vectorEnlaces){
            estadoActual = enlace.getFrom();
            estadoSiguiente = enlace.getTo();

            for(int i=0; i<=cadena.length(); i++){



            }

        }

    }


    @Override
    public void mouseClicked(MouseEvent e) {

        if( e.getButton() == MouseEvent.BUTTON1){

            if(this.vectorEstados.size()>=2){

                int respuesta = JOptionPane.showConfirmDialog(this, "desea ingresar la palabra");

                if(respuesta==0){

                    cadenaEvaluar=JOptionPane.showInputDialog("ingrese la cadena que desea evaluar");
                    comprobacion(cadenaEvaluar);
                }

                else{

                    String nombre = JOptionPane.showInputDialog("ingrese el nombre del estado");

                    String aceptacion = JOptionPane.showInputDialog("es un estado de aceptacion?");

                    this.vectorEstados.add(new Estado(e.getX(), e.getY(), nombre, aceptacion));

                    repaint();


                }
            }

            else {
                String nombre = JOptionPane.showInputDialog("ingrese el nombre del estado");

                String aceptacion = JOptionPane.showInputDialog("es un estado de aceptacion?");

                this.vectorEstados.add(new Estado(e.getX(), e.getY(), nombre, aceptacion));

                repaint();
            }
        }

        if(e.getButton() == MouseEvent.BUTTON3){
            for(Estado estado : vectorEstados){
                if(new Rectangle( estado.getCoordX() - Estado.radio/2, estado.getCoordY() - Estado.radio/2, Estado.radio, Estado.radio).contains(e.getPoint())){
                    if(p1==null){
                        nombreP1=estado.getNombre();
                        aceptacionP1=estado.getAceptacion();
                        p1 = new Point(estado.getCoordX(), estado.getCoordY());
                    }
                    else{
                        nombreP2=estado.getNombre();
                        aceptacionP2=estado.getAceptacion();
                        p2 = new Point(estado.getCoordX(), estado.getCoordY());
                        String simbolo = JOptionPane.showInputDialog("ingrese el caracter");
                        this.vectorEnlaces.add(new Enlace(p1.x, p1.y, nombreP1, aceptacionP1, p2.x, p2.y, nombreP2, aceptacionP2, simbolo));
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
