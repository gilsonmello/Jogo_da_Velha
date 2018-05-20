/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterators;

/**
 *
 * @author Junnyor
 */
public interface Iterator {
    boolean hasNextLine();
    boolean hasNextColumn();
    Object nextColumn();
    Object nextLine();
    void reset();
    void resetColumn();
    void resetLine();
}
