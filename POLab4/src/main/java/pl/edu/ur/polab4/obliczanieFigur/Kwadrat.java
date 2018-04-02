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
public class Kwadrat {
    public String nazwa;
    public double bok;
    public double pole;
    public double obw;

    public double pole(double bok){
    return bok*bok;
    }
    
    public double obw(double bok){
    return 4*bok;
    }
    
    public Kwadrat(){
}

    public void PokazDane() {
        System.out.println("Nazwa figury: " + nazwa + "\nBok = " + bok + "\nPole = " + pole + "\nObwod = " + obw);
    }
}
