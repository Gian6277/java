/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author HP-Gian
 */
public class Perro implements lanimal {
    public int cantidadepatas; 
    @Override
    public void expresarse() {
        System.out.println("El perro ladra");
    }
       
    @Override
    public void comer(){
    System.out.println("El perro come");
    }
}
