/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Prototype.Peca;
import States.Tabuleiro.TabuleiroFinalizado;
import States.Tabuleiro.TabuleiroIniciado;
import States.Tabuleiro.TabuleiroState;
import java.util.ArrayList;

/**
 *
 * @author Junnyor
 */
public class Tabuleiro {
    
    private ArrayList<Peca> pecas;
        
    private TabuleiroState estado;
    
    public Tabuleiro() {
        TabuleiroIniciado estadoIniciado = new TabuleiroIniciado();
        this.estado = estadoIniciado;
    }    
    
    public void setEstado(TabuleiroState estado) {
        this.estado = estado;
    }
    
    public TabuleiroState getEstado() {
        return this.estado;
    }
    
    public void finalizar() {
        this.estado.finalizar();
    }
    
    public void iniciar() {
        this.estado.iniciar();
    }
    
    public ArrayList<Peca> getPecas() {
        return this.pecas;
    }

    public void setPecas(ArrayList<Peca> pecas) {
        this.pecas = pecas;
    }
    
}
