/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boss;
import Projetil.*;
import java.util.ArrayList;
import java.util.List;
import Observer.*;
/**
 *
 * @author Usuario
 */
public class Chefao {
    private List<Observador> observadores = new ArrayList<>();
    public int vida;
    Projeteeis ataqueforte;
    Projetil ataquesimples;

    public Chefao(Projeteeis ataqueforte, Projetil ataquesimples) {
        this.vida = 2000;
        this.ataqueforte = ataqueforte;
        this.ataquesimples = ataquesimples;
    }

    public int getVida() {
       
       return vida;
    }

    public void setVida(int vida, Chefao boss) {
        this.vida = vida;
        for(Observador ob : observadores){
            ob.notifica(vida,boss,null);
        }
    }

    public int getAtaqueforte() {
        return ataqueforte.getDano();
    }

    public void setAtaqueforte(Projeteeis ataqueforte) {
        this.ataqueforte = ataqueforte;
    }

    public int getAtaquesimples() {
        return ataquesimples.getDano();
    }

    public void setAtaquesimples(Projetil ataquesimples) {
        this.ataquesimples = ataquesimples;
    }
     public void addObservadores(Observador observador){
        observadores.add(observador);
    }
    
    
    
    
}
