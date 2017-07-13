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
public class Animal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Perro p= new Perro();
  p.expresarse(); 
  p.comer();
  
  Humano h= new Humano();
  h.expresarse();
  h.comer();
    }
  
  
}
