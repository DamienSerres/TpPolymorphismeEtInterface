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
public interface IStockage {

    /**
     * Il est important de préciser ce que l'on avait en tête lors de l'écriture
     * des prototypes de méthodes.
     */
    void ouvrir();

    void ecrireDonnees();

    void lireDonnees();

    void fermer();
}
