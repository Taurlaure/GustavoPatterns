/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estado;

/**
 *
 * @author Usuario
 */
public class Normal implements State {
    @Override
    public void andar(){
        System.out.println("Andando NORMAL");
    };
    @Override
    public void atacar(){
        System.out.println("Dano causado NORMAL");
    };
    @Override
    public void ataqueEspecial(){
        System.out.println("Sem ataque especial");
    };
}
