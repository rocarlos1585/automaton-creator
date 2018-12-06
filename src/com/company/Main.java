package com.company;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Main  {

    public static void main(String[] args) {




        JFrame ventana = new JFrame("Dibuja un Automata");
        ventana.add(new Lienzo());
        JOptionPane.showMessageDialog(ventana, "INSTRUCCIONES\n" +
                                                        "*Creacion de Nodo: Click izquierdo en alguna parte de la ventana\n" +
                                                        "*Creacion de Enlace: Click derecho en un nodo y despues click derecho en otro nodo");

        ventana.setSize(600,600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
