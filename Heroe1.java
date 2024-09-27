package com.mycompany.heroe1;

public class Heroe1 {

    private int vidas = 3;
    private int posicion = 0;
    private String nombre = "";
    private boolean saltando = false;

    public Heroe1(String nombre) {
        this.nombre = nombre;
    }

    public int getVidas() {
        return vidas;
    }

    public int getPosicion() {
        return posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isSaltando() {
        return saltando;
    }

    public void setVidas() {
        System.out.println(this.nombre + " Ha perdido una vida.");
        this.vidas -= 1;
    }

    public void setPosicion() {
        System.out.println(this.nombre + " ha movido un espacio.");
        this.saltando = false;
        this.posicion += 1;

    }

    public void setSaltando() {
        this.saltando = true;
        this.posicion += 1;
        System.out.println(this.nombre + " ha saltado ");
    }

    Object next() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

