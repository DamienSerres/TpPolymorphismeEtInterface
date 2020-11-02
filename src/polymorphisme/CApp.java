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
        app.ref = new CFille1();
        //OU
        app.ref = new CFille2();
        
        
        app.ref.m();
       
    }
}
