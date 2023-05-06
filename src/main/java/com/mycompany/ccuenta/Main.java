/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ccuenta;

/**
 *
 * @author ED05
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CCuenta miCuenta;
        double saldoActual;
        
        CCuenta miCuenta2;
        
        miCuenta2 = new CCuenta();
        
        miCuenta = new CCuenta("Manuel Mantecas","0000-1234-55-123456789",3000,0);
        try 
        {
            miCuenta.retirar(2300);
        } catch (Exception e)
        {
            System.out.println("Fallo al retirar");
        }
        
        try
        {
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar(695);
        } catch (Exception e)
        {
            System.out.println("Fallo al ingresar");
        }
                 
        saldoActual = miCuenta.getEstado();
        System.out.println("El saldo actual es "+ saldoActual );
        
     
        
    }

}
