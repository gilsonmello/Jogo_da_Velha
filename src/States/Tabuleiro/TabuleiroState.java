package States.Tabuleiro;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import app.Tabuleiro;

/**
 *
 * @author Junnyor
 */
abstract class TabuleiroState {
    
    protected Tabuleiro tabuleiro;
    
    protected TabuleiroState(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }
}
