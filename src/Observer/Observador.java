/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;
import Boss.*;
import Personagem.*;

/**
 *
 * @author Usuario
 */
public interface Observador {
    public void notifica(int vida,Chefao boss,Personagem p1);
}
