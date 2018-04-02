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
public class Stozek {
    public String nazwa;
    public double r;
    public double l;
    public double h;
    public double pole;
    public double obj;
    
    public double pole(double r, double l){
    return Math.PI*r*(r+l);
    }
    
    public double obj(double r, double h){
    return (Math.PI*r*r*h)/3;
    }
    
    public Stozek(){
}
    
    public void PokazDane() {
        System.out.println("Nazwa figury: " + nazwa + "\nPromien = " + r + "\nTworzaca stozka = " + l + "\nWysokosc = " + h + "\nPole = " + pole + "\nObjetosc = " + obj);
    }
}
