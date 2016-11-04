/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg7;

import javax.swing.JOptionPane;

/**
 *
 * @author slagogonzalez
 */
public class Boletin7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Libro lib=new Libro();
        lib.setNomeLibro(JOptionPane.showInputDialog("Introduzca el nombre del libro"));
        lib.setNomeAutor(JOptionPane.showInputDialog("Introduzca el nombre del Autor"));
        lib.setExemplares(Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de ejemplares")));
        lib.setExempPrest(Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de ejemplares prestados")));
        
    }
    
}
