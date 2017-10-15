
package Fase;

public abstract class Fase {
     public void gerarFase(){
        criandoFase();
        criandoInimigos();
        finalizaFase();
    }
    private void criandoFase(){
        System.out.println("Cria Fase");
    }
    
    private void criandoInimigos(){
        System.out.println("Cria Inimigos");
    }
    
    protected abstract void finalizaFase();
    
}

