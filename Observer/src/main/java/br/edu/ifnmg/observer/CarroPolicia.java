package br.edu.ifnmg.observer;

import java.util.Observable;

/**
 *
 * @author Rikelme
 */
public class CarroPolicia 
        implements Observer, Carro{

    @Override
    public void frente() {
        System.out.println("Viatura Segue em Frente");
    }

    @Override
    public void direita() {
        System.out.println("Viatura Vira a Direita");
    }

    @Override
    public void esquerda() {
        System.out.println("Viatura Vira a Esquerda");
    }

    @Override
    public void para() {
        System.out.println("Viatura Para.");
    }

    //Recebe um objeto observado e a ação desse objeto
    public void update(Observable arg0, Object arg1) {
        CarroRoubado carroObservado = (CarroRoubado) arg0;
        String acao = String.valueOf(arg1);
        /**
         * Cada vez que o objeto observado toma uma acao e notifica o Observador
         * O Observador toma uma decisao
         */
        if(acao.equals("frente")){
            this.frente();
        }
        else if(acao.equals("direita")){
            this.direita();
        }
        else if(acao.equals("esquerda")){
            this.esquerda();
        }
        else if(acao.equals("para")){
            this.para();
        }
    }
     
    
    
}
