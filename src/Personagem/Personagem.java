/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personagem;
import Projetil.Projetil;
import Estado.*;
import Observer.Observador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Personagem {
    private List<Observador> observadores = new ArrayList<>();
    private State estado;
    public int vida;
    public Personagem() {
        this.vida = 100; 
        estado = new Normal();

    }
    public void ataqueEspecial(){
        estado.ataqueEspecial();
    };
    public int getVida() {
        return vida;
    }
    public void andar(){
        estado.andar();
    }
    
    public void atacar(){
        estado.atacar();
    }
    public void setVida(int vida, Personagem p1) {
        this.vida = vida;
        for(Observador ob : observadores){
            ob.notifica(vida,null,p1);
        }
    }
    

    public State getEstado() {
        return estado;
    }

    public void setEstado(State estado) {
        this.estado = estado;
    }
    public void addObservadores(Observador observador){
        observadores.add(observador);
    }


    
}
