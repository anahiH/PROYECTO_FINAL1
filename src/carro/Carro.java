package carro;

import java.awt.Image;
import java.awt.event.KeyEvent;


import javax.swing.ImageIcon;

//ESTA ES LA CLASE DONDE SE TIENE EL CARRO
public class Carro {

//AQUÍ, COMO VARAIBLES SE TIENE EL STRING CARRITO, QUE ES EL QUE BUSCA EL ARCHIVO DE LA IMAGEN, LOS INTEGERS DX(CUANTO SE VA A AVANZAR EN X), DY(CUANTO SE VA A AVANZAR EN Y), X Y Y, ADEMÁS DE LA IMAGEN IMAGEN,
    //LA CUAL SE UTILIZARIA PARA PINTAR
    private String carrito;
    private int dx;
    private int dy;
    private int x;
    private int y;
    private Image imagen;

    //CONSTRUCTOR 
    public Carro() {
        x = 40;
        y = 60;
        carrito = "carritop.png";
        System.out.println((this.getClass().getResource(carrito)));
        ImageIcon img = new ImageIcon(this.getClass().getResource(carrito));
        imagen = img.getImage();

    }
//METODO PARA DETECTAR TECLAS

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        System.out.println("entra");
        if (key == KeyEvent.VK_LEFT) {
            dx = -5;
            
        }
        if (key == KeyEvent.VK_RIGHT) {
          

            dx = 5;
        }
        if (key == KeyEvent.VK_UP) {

            dy = -5;
        }
        if (key == KeyEvent.VK_DOWN) {

            dy = 5;
        }

    }

    //METODO PARA DETECTAR QUE SOLTARON TECLAS
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT) {
            dx=0;
        }
        if (key == KeyEvent.VK_RIGHT) {

            dx=0;
        }
        if (key == KeyEvent.VK_UP) {

            dy=0;
        }
        if (key == KeyEvent.VK_DOWN) {

            dy=0;
        }

    }
    //METODO PARA MOVER

    public void mover() {
        x+= dx;
        y+= dy;
    }
    //FUNCIONES PARA RETORNAR VALORES

    public int tenerX() {
        return x;
    }

    public int tenerY() {
        return y;
    }

    public Image tenerImagen() {
        return imagen;
    }


}

