/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategies;

import Prototype.Peca;
import app.PecaX;
import java.util.ArrayList;

/**
 *
 * @author Junnyor
 */
public class JogadorX implements JogadorStrategy {
    
    private ArrayList<PecaX> pecas;
    
    private PecaX tipo;
    
    public JogadorX() {
        this.tipo = new PecaX();
    }

    @Override
    public Peca getTipo() {
        return this.tipo;
    }
    
    public void setPeca(ArrayList<PecaX> pecas) {
        this.pecas = pecas;
    }
    
    public ArrayList<PecaX> getPeca() {
        return this.pecas;
    }
    
    public void addPeca(PecaX peca) {
        this.pecas.add(peca);
    }
    
}
