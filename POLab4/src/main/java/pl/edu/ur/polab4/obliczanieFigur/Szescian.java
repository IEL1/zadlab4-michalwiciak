/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

/**
 *
 * @author MICHAL
 */
public class Szescian {
    public String nazwa;
    public double bok;
    public double pole;
    public double obj;
    
    public double pole(double bok){
    return 6*bok*bok;
    }
    
    public double obj(double bok){
    return bok*bok*bok;
    }
    
    public Szescian(){
}

    public void PokazDane() {
        System.out.println("Nazwa figury: " + nazwa + "\nBok = " + bok + "\nPole = " + pole + "\nObjetosc = " + obj);
    }
}
