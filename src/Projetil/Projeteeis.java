/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projetil;

/**
 *
 * @author Usuario
 */
public class Projeteeis {
       private Projetil p1;
       private Projetil p2;
       
     public Projeteeis(Projetil p1, Projetil p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public int getDano() {
        System.out.println("Atirando varios projéteis");
        System.out.println(this.p2.getDano() + this.p2.getDano());
        return this.p2.getDano() + this.p2.getDano(); 
        
    }
}
