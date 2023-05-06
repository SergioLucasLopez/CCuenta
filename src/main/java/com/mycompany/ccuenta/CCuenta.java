/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ccuenta;

import java.util.List;

/**
 *
 * @author ED05
 */
public class CCuenta {
    /**
     nombre tipo String atributo que identifica el nombre del titular cuenta
     */

    // Propiedades de la Clase Cuenta
    private String nombre; 
     /**
     *nombre tipo String atributo que identifica el numermo cuenta de 20 dígitos
     */
    private String cuenta;
     /**
     *nombre tipo Double atributo que identifica el saldo disponible en la cuenta
     */
    private double saldo;
     /**
     *nombre tipo Double atributo que identifica el tipo de interés que se le aplica a la cuenta
     */
    private double tipoInterés;
     /**
     *nombre tipo String[] atributo que identifica el nombre de cada uno de los distintos gastos para los que se hace factura
     */
    private String[] factura = {"seguro", "luz", "agua", "alquiler"};


    /* Constructor sin argumentos */
    /**
     * Constructor de la clase CCuenta sin argumentos
     */
    public CCuenta() {
    }

    // Constructor con parámetro para iniciar todas las propiedades de la clase
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }
    // Método para asignar el nombre del titular de la cuenta

    public void setNombre(String nom) {
        nombre = nom;
    }

    // Método que me devuelve el nombre del titular
    public String getNombre() {
        return nombre;
    }

    // Método que me devuelve el saldo disponible en cada momento
    public double getEstado() {
        return saldo;
    }

    /* Método para ingresar cantidades en la cuenta. Modifica el saldo.
     * Este método va a ser probado con Junit
     */
    /**
     * 
     * @param cantidad
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }


    /* Método para retirar cantidades en la cuenta. Modifica el saldo.
     * Este método va a ser probado con Junit
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (getEstado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }

    // Método que me devuelve el número de cuenta
    public String getCuenta() {
        return cuenta;
    }

    public void cobroFactura(String tipo,double cantidad){
        switch(tipo){
        
            case "alquiler":
                if (cantidad >0 && cantidad<=400)
                    this.saldo -=cantidad; //this.saldo = this.saldo-cantidad;
                break;
            case "luz":
                if (cantidad<=200)
                    this.saldo -=cantidad;
            case "agua":
                
                if (cantidad >0 && cantidad<=200)
                    this.saldo -=cantidad;
                break;
            case "seguro":
                if (cantidad >0 && cantidad<=125)
                    this.saldo -=cantidad;
                    
                
        }
    
    }
    
}
    
 