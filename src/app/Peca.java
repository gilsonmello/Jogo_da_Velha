package app;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Junnyor
 */
public class Peca extends JButton implements ActionListener {
    private String imagem;
    private int linha;
    private int coluna;
    
    public Peca() {
        super();
        this.addActionListener(this);
    }
    
    public void setLinha(int linha) {
        this.linha = linha;
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
    
    public void onClick(int linha, int coluna) {
        System.out.println(""+linha);
    }
}
