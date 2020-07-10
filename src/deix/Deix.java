/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deix;

import javax.swing.JOptionPane;

/**
 *
 * @author João Pedro Gambirasio da Rosa
 */
public class Deix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont, result;
        
        cont = 0;
        result = 0;
        
        while(cont>=0 && cont<=500){
        cont++;
        if(cont%2 != 0 && cont%3 == 0){
        result+=cont;
        }
        }
        
        JOptionPane.showMessageDialog(null, "Soma dos números multiplos de três entre 0 e 500 é: " +result);
        
    }
    
}
