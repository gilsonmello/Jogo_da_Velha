/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategies;

import Prototype.Peca;
import app.PecaO;
import java.util.ArrayList;

/**
 *
 * @author Junnyor
 */
public class JogadorO implements JogadorStrategy{

    private ArrayList<PecaO> pecas;
    
    private PecaO tipo;
    
     public JogadorO() {
        this.tipo = new PecaO();
    }
    
    public void setPeca(ArrayList<PecaO> pecas) {
        this.pecas = pecas;
    }
    
    public ArrayList<PecaO> getPeca() {
        return this.pecas;
    }
    
    public void addPeca(PecaO peca) {
        this.pecas.add(peca);
    }

    @Override
    public Peca getTipo() {
        return this.tipo;
    }
    
}
