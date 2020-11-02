/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Damien
 */
public class CFichierTexte implements IStockage {

    @Override
    public void ouvrir() {
        System.out.println("Ouvrir de CFichierTexte.");
    }

    @Override
    public void ecrireDonnees() {
        System.out.println("EcrireDonnees de CFichierTexte.");
    }

    @Override
    public void lireDonnees() {
        System.out.println("LireDonnees de CFichierTexte.");
    }

    @Override
    public void fermer() {
        System.out.println("Fermer de CFichierTexte.");
    }
    
}
