/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice;

import java.util.Scanner;

/**
 *
 * @author Damien
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < args.length; i++) {
//            System.out.println(args[i]);
//        }
        CCalculatrice calc = new CCalculatrice();
        calc.calculateur = new CCalculateur();
        calc.console = new CConsole();

        System.out.println("Quelle version d'afficheur souhaitez-vous ? 1 ou 2");
        int choix = sc.nextInt();
        switch (choix) {
            case 1:
                calc.afficheur = new CAfficheurStyle1();
                break;
            case 2:
                calc.afficheur = new CAfficheurStyle2();
                break;
            default:
                System.out.println("Erreur !");
                break;
        }
//        calc.afficheur = new CAfficheurStyle1();
//        //OU
//        calc.afficheur = new CAfficheurStyle2();

        calc.afficheur.afficherResultat();

    }
}
