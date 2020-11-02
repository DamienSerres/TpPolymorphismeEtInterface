package polymorphisme;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Damien
 */
public class CApp {

    CMere ref;

    public static void main(String[] args) {
        CApp app = new CApp();
//        app.ref = new CFille1();
//        OU
        app.ref = new CFille2();
//        //Cause une erreur car m() n'existe pas dans CMere.
        app.ref.m();

//        //1ere approche, on n'a pas accès à la classe pour modification
//        CFille2 transtypage = (CFille2) app.ref;
//        transtypage.m();
    }
}
