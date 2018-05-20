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
public interface TabuleiroState {
    void finalizar();
    void iniciar();
    String getNome();
    void setNome(String nome);
}
