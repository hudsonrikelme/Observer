package br.edu.ifnmg.observer;

import java.util.Observable;

/**
 *
 * @author Rikelme
 */
public class CarroRoubado 
        extends Observable
            implements Carro{
    private String acao = "";

    /**
     * A cada Acao do Observado ele Notifica o Observador
     */
    @Override
    public void frente() {
        acao = "frente";
        System.out.println("Carro Roubado Segue em Frente");
        this.mudaEstado();
    }

    @Override
    public void direita() {
        acao = "direita";
        System.out.println("Carro Roubado Vira a Direita");
        this.mudaEstado();
    }

    @Override
    public void esquerda() {
        acao = "esquerda";
        System.out.println("Carro Roubado Vira a Esquerda");
        this.mudaEstado();
    }

    @Override
    public void para() {
        acao = "para";
        System.out.println("Carro Roubado Para");
        this.mudaEstado();
    }
    //Muda o estado e notifica os observadores
    public void mudaEstado(){
        setChanged();
        notifyObservers(acao);
    }
}
