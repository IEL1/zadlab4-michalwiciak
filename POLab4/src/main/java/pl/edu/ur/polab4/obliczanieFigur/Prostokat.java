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
public class Prostokat {
    public String nazwa;
    public double bok;
    public double bok2;
    public double pole;
    public double obw;
    
    public double pole(double bok1, double bok2){
        return bok1*bok2;
    }
    
    public double obw(double bok1, double bok2){
    return 2*bok1+2*bok2;
    }
    
    public Prostokat(){
}

    public void PokazDane() {
        System.out.println("Nazwa figury: " + nazwa + "\nBok1 = " + bok + "\nBok2 = " + bok2 + "\nPole = " + pole + "\nObwod = " + obw);
    }
}
