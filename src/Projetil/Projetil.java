/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projetil;

/**
 *
 * @author gustavoamorim
 */
public class Projetil implements Projeteis {
    public int Dano;

    public Projetil() {
        this.Dano = 10;
    }

    public int getDano() {
        return Dano;
    }

    public void setDano(int Dano) {
        this.Dano = Dano;
    }
    
    
}
