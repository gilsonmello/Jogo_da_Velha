/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mementos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Junnyor
 */
public class CareTake {
    
    private List<Memento> mementosLista = new ArrayList<>();
    
    public void add(Memento memento) {
        this.mementosLista.add(memento);
    }
    
    public Memento get(int posicao) {
        
        return this.mementosLista.get(posicao);
    }
    
}
