package States.Tabuleiro;

import app.Tabuleiro;
import app.TabuleiroGUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Junnyor
 */
public class TabuleiroIniciado implements TabuleiroState {
    
    public TabuleiroIniciado() {
        
    }

    @Override
    public void finalizar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void iniciar() {
        System.out.println("Iniciado...");
    }
   
    
}
