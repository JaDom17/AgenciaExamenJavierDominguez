/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciogitnetbeansjavi;

/**
 *
 * @author il_ja
 */
public class UsarPruebaGit{
    public static void main(String[] args) {
        System.out.println("Hola mundo desde Git");
        
        PruebaGit p = new PruebaGit();
        
        System.out.println(p.n);
        p.n=20;
        
        System.out.println(p.n);
        
        
    }
    
}
