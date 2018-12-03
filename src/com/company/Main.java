package com.company;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame ventana = new JFrame("GRAFO");
        ventana.add(new Lienzo());
        ventana.setSize(600,600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
