/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorizacion;

/**
 *
 * @author DAW
 */
public class Persona {

    String numeroDeTelefono;
    String nombre;
    int edad;

    public Persona(String numeroDeTelefono, String nombre, int edad) {
        this.numeroDeTelefono = numeroDeTelefono;
        this.nombre = nombre;
        this.edad = edad;
    }

    //GETters
    public String getNumeroDeTelefono() {
        return this.numeroDeTelefono;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    //SETters
    public void setNumeroDeTelefono(String tel) {
        this.numeroDeTelefono = tel;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String info() {
        String cadena = "";
        cadena += "Nombre: " + this.nombre + "\n"
                + "Edad: " + this.edad + "\n"
                + "Teléfono: " + this.numeroDeTelefono + "\n";
        return cadena;
    }
}
