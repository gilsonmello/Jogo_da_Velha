package States.Tabuleiro;

import app.Tabuleiro;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Junnyor
 */
public class TabuleiroFinalizado implements TabuleiroState {

    private String nome = "Finalizado";
    
    public TabuleiroFinalizado() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void finalizar() {
        System.out.println("Finalizando...");
    }

    @Override
    public void iniciar() {
        
    }
    
}
