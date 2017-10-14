/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estado;
import Projetil.*;
/**
 *
 * @author Usuario
 */
public class Rage implements State{
    private Projeteeis projeteis;
    @Override
    public void andar(){
        System.out.println("Velocidade +100%");
    };
    @Override
    public void atacar(){
        System.out.println("Dano causado +150%");
    };
    @Override
    public void ataqueEspecial(){
        System.out.println("Dano especial +120%");
    };
    
}

