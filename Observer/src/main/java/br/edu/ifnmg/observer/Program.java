package br.edu.ifnmg.observer;

/**
 *
 * @author Rikelme
 */
public class Program {
    public static void main(String[] args) {
        CarroPolicia carroPolicia = new CarroPolicia();
        CarroRoubado carroRoubado = new CarroRoubado();
        
        /**
         * Adiciona o observador ao Observado para monitoramento
         * e tomada de decisoes
         */
        carroRoubado.addObserver(carroPolicia);
        
        
        carroRoubado.frente();
        carroRoubado.direita();
        carroRoubado.para();
        carroRoubado.frente();
        carroRoubado.esquerda();
        carroRoubado.para();
        
    }
}
