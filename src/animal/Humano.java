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
public class Humano implements lanimal {

    @Override
    public void comer() {
        System.out.println("Come el humano");
    }

    @Override
    public void expresarse() {
        System.out.println("Habla el humano");
    }

}

