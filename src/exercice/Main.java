/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice;

/**
 *
 * @author Damien
 */
public class Main {

    public static void main(String[] args) {
//        for (int i = 0; i < args.length; i++) {
//            System.out.println(args[i]);
//        }
        CCalculatrice calc = new CCalculatrice();
        calc.calculateur = new CCalculateur();
        calc.console = new CConsole();
//        calc.afficheur = new CAfficheurStyle1();
//        //OU
        calc.afficheur = new CAfficheurStyle2();
        
        
        calc.afficheur.afficherResultat();
       
        

    }
}
