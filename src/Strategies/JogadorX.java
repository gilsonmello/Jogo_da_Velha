/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategies;

import Prototype.Peca;
import Prototype.PecaRepositorio;
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
        PecaRepositorio.loadRepositorio();
        this.tipo = new PecaX();
    }

    @Override
    public Peca getTipo() {
        Peca peca = PecaRepositorio.getPeca("1");
        peca.setNome("X");
        return PecaRepositorio.getPeca("1");
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
