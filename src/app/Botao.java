/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Prototype.Peca;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Junnyor
 */
public class Botao extends JButton implements ActionListener {
    
    private int linha;
    private int coluna;
    
    private Peca peca;
    
    public void setLinha(int linha) {
        this.linha = linha;
    }
    
    public void setPeca(Peca peca) {
        this.peca = peca;
    }
    
    public Peca getPeca() {
        return this.peca;
    }
    
    public void setColuna(int coluna) {
        this.coluna = coluna;
    }  
    
    public int getLinha() {
        return this.linha;
    }
    
    public int getColuna() {
        return this.coluna;
    }  
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println(""+linha);
    }
    
    public void setOnClickListener() {
        this.addActionListener(this);
    }
}
