/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterators;

import Prototype.Peca;
import app.Botao;

/**
 *
 * @author Junnyor
 */
public class BotoesIterator implements Iterator {
    
    private Botao[][] botoes;
    
    private int i = 0;
    private int j = 0;
    
    public BotoesIterator(Botao[][] pecas) {
        this.botoes = pecas;
    }
    
    @Override
    public boolean hasNextLine() {
        return !(this.i >= this.botoes.length || this.botoes[this.i][this.j] == null);
    }
    
    @Override
    public boolean hasNextColumn() {
        return !(this.j >= this.botoes.length || this.botoes[this.i][this.j] == null);
    }

    @Override
    public Object nextColumn() {
        Botao botao = this.botoes[this.i][this.j]; 
        this.j++;
        return botao;
    }
    
    @Override
    public Object nextLine() {
        Botao botao = this.botoes[this.i][this.j]; 
        this.i++;
        return botao;
    }

    @Override
    public void reset() {
        this.i = 0;
        this.j = 0;
    }
    
    @Override
    public void resetColumn() {
        this.j = 0;
    }
    
    @Override
    public void resetLine() {
        this.i = 0;
    }
    
}
