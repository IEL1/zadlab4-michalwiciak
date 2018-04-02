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
public class Kolo {
    public String nazwa;
    public double promien;
    public double pole;
    public double obw;
    
    public double pole(double r){
    double wynik = Math.PI*r*r;
    return wynik;
    }
    
    public double obw(double r){
    return 2*Math.PI*r;
    }
    
    public Kolo(){
}

    public void PokazDane() {
        System.out.println("Nazwa figury: " + nazwa + "\nPromien = " + promien + "\nPole = " + pole + "\nObwod = " + obw) ;
    }
}
