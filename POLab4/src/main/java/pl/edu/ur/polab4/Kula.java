/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

/**
 *
 * @author MICHAL
 */
public class Kula {
    public String nazwa;
    public double r;
    public double pole;
    public double obj;
    
    public double pole(double r){
    return 4*Math.PI*r*r;
    }
    
    public double obj(double r){
    return 4/3*Math.PI*r*r*r;
    }
    
    public Kula(){
}
    
    public void PokazDane() {
        System.out.println("Nazwa figury: " + nazwa + "\nPromien = " + r + "\nPole = " + pole + "\nObjetosc = " + obj);
    }
    
}
