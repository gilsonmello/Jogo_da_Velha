package Prototype;


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
abstract public class Peca implements Cloneable {
    
    protected String id;
    
    protected String nome;
    
    protected String imagem;
    
    protected int linha;
    
    protected int coluna;
        
    public Peca() {
        
    }
    
    protected void setId(String id) {
        this.id = id;
    }    
    
    protected String getId() {
        return this.id;
    }
    
    protected void setImagem(String imagem) {
        this.imagem = imagem;
    }    
    
    protected String getImagem() {
        return this.imagem;
    }
    
    public abstract void aparecer();
    
    protected void setLinha(int linha) {
        this.linha = linha;
    }    
    protected void setColuna(int coluna) {
        this.coluna = coluna;
    }  
    
    protected int getLinha() {
        return this.linha;
    }
    
    protected int getColuna() {
        return this.coluna;
    }  
    
    protected Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
