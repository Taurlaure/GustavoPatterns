/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;
import Personagem.*;
import Boss.*;
import Estado.*;

/**
 *
 * @author Usuario
 */
public class ObservaPersonagem implements Observador {
    @Override
    public void notifica(int vida ,Chefao boss, Personagem p1){     
    if(vida == 0){
            System.out.println("Personagem está morto");
        }if(vida < 30){
            p1.setEstado(new Rage());
             System.out.println("Personagem está ENFURECIDO");
        } 
            
    }
}
