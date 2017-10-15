
package patterns;
import Personagem.Personagem;
import Estado.*;
import Projetil.*;
import Boss.*;
import Observer.*;
import Fase.*;

public class Patterns {

    public static void main(String[] args) {
       Projetil danounico = new Projetil();
       Personagem p1 = new Personagem();
       Projeteeis dano = new Projeteeis(danounico,danounico);
       Fase f = new Heroico();
        p1.addObservadores(new ObservaPersonagem());
        p1.andar();
        p1.atacar();
        p1.ataqueEspecial();
        p1.setVida(20,p1);
        System.out.println(p1.getEstado());
        p1.andar();
        p1.atacar();
        p1.ataqueEspecial();
        
        
        Chefao boss = new Chefao(new Projeteeis(new Projetil(),new Projetil()),new Projetil());
        boss.addObservadores(new ObservaChefao());
        boss.setVida(0,boss);
        boss.getAtaqueforte();
        
        
        f.gerarFase();
    }
    
}
