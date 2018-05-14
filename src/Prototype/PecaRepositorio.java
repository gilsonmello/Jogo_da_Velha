/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

import app.PecaO;
import app.PecaX;
import java.util.Hashtable;

/**
 *
 * @author Junnyor
 */
public class PecaRepositorio {
    
    private static Hashtable<String, Peca> pecaRepositorio = new Hashtable<>();
    
    public static Peca getPeca(String id) {
        Peca peca = pecaRepositorio.get(id);
        return (Peca) peca.clone();
    }
    
    public static void loadRepositorio() {
        PecaX x = new PecaX();
        x.setImagem("x");
        x.setId("1");        
        pecaRepositorio.put(x.getId(), x);
        
        PecaO o = new PecaO();
        o.setId("2");
        o.setImagem("o");        
        pecaRepositorio.put(o.getId(), o);
       
    }
    
}
