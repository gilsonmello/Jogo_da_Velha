/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategies;

/**
 *
 * @author Junnyor
 */
public enum TipoJogador {
    X {
        @Override
        public JogadorStrategy obterJogador() {
            return new JogadorX();
        }
    },
    O {
        @Override
        public JogadorStrategy obterJogador() {
            return new JogadorO();
        }
    };
    
    public abstract JogadorStrategy obterJogador();
}
