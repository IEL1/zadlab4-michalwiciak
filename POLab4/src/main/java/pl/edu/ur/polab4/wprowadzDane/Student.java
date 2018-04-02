/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.wprowadzDane;

/**
 *
 * @author MICHAL
 */
public class Student {
    public String imie;
    public String nazwisko;
    public int nr_indeksu;
    public String nazwa_specjalnosci;
    public int rok_studiow;
    
    
    public Student(String imie, String nazwisko, int nr_indeksu, String nazwa_specjalnosci, int rok_studiow){
    this.imie = imie;
    this.nazwisko = nazwisko;
    this.nr_indeksu = nr_indeksu;
    this.nazwa_specjalnosci = nazwa_specjalnosci;
    this.rok_studiow = rok_studiow;
}
    public Student(String imie, String nazwisko, int nr_indeksu, String nazwa_specjalnosci){
    this.imie = imie;
    this.nazwisko = nazwisko;
    this.nr_indeksu = nr_indeksu;
    this.nazwa_specjalnosci = nazwa_specjalnosci;
    }
    
    public Student(String imie, String nazwisko, int nr_indeksu){
    this.imie = imie;
    this.nazwisko = nazwisko;
    this.nr_indeksu = nr_indeksu;
    }
    
    public Student(String imie, String nazwisko){
    this.imie = imie;
    this.nazwisko = nazwisko;
    }
    
    public Student(){
    }
    
    public void pokazDane() {
        System.out.println("Student:"
                + "\nimie=" + imie
                + "\nnazwisko=" + nazwisko
                + "\nnr_indeksu=" + nr_indeksu
                + "\nnazwa_specjalnosci=" + nazwa_specjalnosci
                + "\nrok_studiow=" + rok_studiow);
    }
    
    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getNr_indeksu() {
        return nr_indeksu;
    }

    public String getNazwa_specjalnosci() {
        return nazwa_specjalnosci;
    }

    public int getRok_studiow() {
        return rok_studiow;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setNr_indeksu(int nr_indeksu) {
        this.nr_indeksu = nr_indeksu;
    }
    
    public void setNazwa_specjalnosci(String nazwa_specjalnosci) {
        this.nazwa_specjalnosci = nazwa_specjalnosci;
    }

    public void setRok_studiow(int rok_studiow) {
        this.rok_studiow = rok_studiow;
    }
}