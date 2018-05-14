/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterators;

import Prototype.Peca;

/**
 *
 * @author Junnyor
 */
public class PecasIterator implements Iterator {
    
    private Peca[] pecas;
    
    private int indice = 0;
    
    public PecasIterator(Peca[] pecas) {
        this.pecas = pecas;
    }
    
    @Override
    public boolean hasNext() {
        return !(this.indice >= this.pecas.length || this.pecas[this.indice] == null);
    }

    @Override
    public Object next() {
        this.indice++;
        return this.pecas[indice];
    }
    
}
