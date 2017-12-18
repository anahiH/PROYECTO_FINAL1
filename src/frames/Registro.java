/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

/**
 *
 * @author robertoespino
 */
//ESTA ES UNA CLASE DE REGISTRO PARA (VÁLGAME LA REDUNDANCIA, REGISTRAR A UN TRABAJADOR. TIENE SUS VARIABLES DE NOMBRE, APELLIDO Y NÚMERO, ADEMÁS DE UN CONSTRUCTOR QUE CONTIENE LAS TRES
//VARAIBLES, ADEMÁS DE LOS GETTERS Y SETTERS.
public class Registro {
    private String Nombre;
    private String Apellido ;
    private String nTrabajador;

    public Registro(String Nombre, String Apellido, String nTrabajador) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.nTrabajador = nTrabajador;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getnTrabajador() {
        return nTrabajador;
    }

    public void setnTrabajador(String nTrabajador) {
        this.nTrabajador = nTrabajador;
    }
}
