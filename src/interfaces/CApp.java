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
public class CApp {

    IStockage ref;

    public static void main(String[] args) {
        CApp app = new CApp();
//        app.ref = new CFichierTexte();
//        //OU
        app.ref = new CBaseDeDonnees();

        app.ref.ouvrir();
        app.ref.ecrireDonnees();
        app.ref.fermer();

    }
}
