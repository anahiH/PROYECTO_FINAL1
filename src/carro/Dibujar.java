package carro;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JPanel;
import javax.swing.Timer;
// ESTA CLASE ES PARA DIBUJAR AL CARRO EN EL PANEL DE ESTACIONAMIENTO1
public class Dibujar extends JPanel implements ActionListener {
//CREA UN CARRO Y UN TIMER
    Carro carro = new Carro();
    Timer timer = new Timer(5, this);

    // CONSTRUCTOR 
    public Dibujar() {
        //PONE LAS DIMENSIONES Y EN GENERAL COMO SE VA A VER, ADEMÁS DE UN KEY LISTENER PARA EL TECLADO Y EL COMIENZO DEL TIMER
        setPreferredSize(new Dimension(300, 300));
        
        setFocusable(true);
        addKeyListener(new teclado());
        timer.start();
    }
//ESTE ES PARA PINTAR EL CARRO, SEGÚN EL PUNTO Y Y X
    public void paint(Graphics grafica) {
        super.paint(grafica);
        Graphics2D g2 = (Graphics2D) grafica;
        g2.drawImage(carro.tenerImagen(), carro.tenerX(), carro.tenerY(), null);

    }
//ESTE ES PARA REPINTAR EL CARRO, MOVIÉNDOLO DE LUGAR COMFORME SE LE DEN CLICK A LAS TECLAS
    public void actionPerformed(ActionEvent e) {
        carro.mover();
        repaint();

    }

    private class teclado extends KeyAdapter {

        public void keyPressed(KeyEvent e) {
            carro.keyPressed(e);

        }

        public void keyReleased(KeyEvent e) {
            carro.keyReleased(e);

        }
    }

}
