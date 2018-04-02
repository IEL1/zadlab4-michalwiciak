/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.wprowadzDane;
import java.util.Scanner;
/**
 *
 * @author MICHAL
 */
public class Tablica {
    Student tab1[] = new Student[5];
    
    public void wypelnienie(){
       for(int i = 0;i<5;i++){
            Student student = new Student("", "", 0, "", 0);
            tab1[i] = student;
        } 
    }
    
    public void menu(){
        Scanner in = new Scanner(System.in);
        int menu = 1;
        
        while (menu !=0){
            System.out.println("Wybierz akcje ktora chcesz wykonac: ");
            System.out.println("---------------------------------------------");
            System.out.println("1. Wprowadz dane studentow");
            System.out.println("2. Edycja danych studenta");
            System.out.println("3. Usuniecie danych studenta");
            System.out.println("4. Wyswietlanie danych jednego studenta");
            System.out.println("5. Wyswietlanie danych wszystkich studentow");
            System.out.println("6. Wyswietlanie danych kilku studentow");
            System.out.println("0. Koniec");
            System.out.println("---------------------------------------------");
            menu = in.nextInt();
            
            switch(menu){
                case 1: wprowadzanie();
                    break;
                case 2: edycja();
                    break;
                case 3: usuwanie();
                    break;
                case 4: wyswietl1();
                    break;
                case 5: wyswietlWszystkich();
                    break;
                case 6: wyswietlZakres();
                    break; 
                case 0: break;
            }
        }
    }
    private void wprowadzanie(){
        Scanner inImie = new Scanner(System.in);
        Scanner inNazwisko = new Scanner(System.in);
        Scanner inSpecjalnosc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        
        System.out.println("Wprowadzanie danych");
        System.out.println("Podaj indeks pod ktorym chcesz wprowadzic dane:");
        int id = in.nextInt();        
        
        System.out.println("Podaj imie: ");
        tab1[id].setImie(inImie.nextLine());
        System.out.println("Podaj nazwisko: ");
        tab1[id].setNazwisko(inNazwisko.nextLine());
        System.out.println("Podaj numer indeksu: ");  
        tab1[id].setNr_indeksu(in.nextInt());
        System.out.println("Podaj nazwe specjalnosci: "); 
        tab1[id].setNazwa_specjalnosci(inSpecjalnosc.nextLine());
        System.out.println("Podaj rok studiow"); 
        tab1[id].setRok_studiow(in.nextInt());        
    }
    private void edycja(){
        Scanner inImie = new Scanner(System.in);
        Scanner inNazwisko = new Scanner(System.in);
        Scanner inSpecjalnosc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        
        System.out.println("Zmiana danych");
        System.out.println("Podaj indeks pod ktorym chcesz zmienic dane");
        int id = in.nextInt();
        
        System.out.println("Podaj zmienione imie: ");
        tab1[id].setImie(inImie.nextLine());
        System.out.println("Podaj zmienione nazwisko: ");
        tab1[id].setNazwisko(inNazwisko.nextLine());
        System.out.println("Podaj zmieniony numer indeksu: ");  
        tab1[id].setNr_indeksu(in.nextInt());
        System.out.println("Podaj zmieniona nazwe specjalnosci: "); 
        tab1[id].setNazwa_specjalnosci(inSpecjalnosc.nextLine());
        System.out.println("Podaj zmieniony rok studiow"); 
        tab1[id].setRok_studiow(in.nextInt());
        
    }
    private void usuwanie(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Usuwanie danych");
        System.out.println("Podaj indeks pod ktorym chcesz usunac dane:");
        int id = in.nextInt();
        
        tab1[id].setImie("");
        tab1[id].setNazwisko("");
        tab1[id].setNr_indeksu(0);
        tab1[id].setNazwa_specjalnosci("");
        tab1[id].setRok_studiow(0);
    }
    private void wyswietl1(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Wyswietlanie danych jednego studenta");
        System.out.println("Podaj indeks ktory chcesz wyswietlic:");
        int id = in.nextInt();
        
        System.out.println("Wybrane ID: " + id);
        System.out.println("Imie: " + tab1[id].getImie());
        System.out.println("Nazwisko: " + tab1[id].getNazwisko());
        System.out.println("Nr indeksu: " + tab1[id].getNr_indeksu());
        System.out.println("Nazwa specjalnosci: " + tab1[id].getNazwa_specjalnosci());
        System.out.println("Rok studiow: " + tab1[id].getRok_studiow());
        System.out.println();
    }
    private void wyswietlWszystkich(){
        for(int i = 0; i < 5; i++){
            System.out.println("Index: " + i);
            System.out.println("Imie: " + tab1[i].getImie());
            System.out.println("Nazwisko: " + tab1[i].getNazwisko());
            System.out.println("Nr indeksu: " + tab1[i].getNr_indeksu());
            System.out.println("Nazwa specjalnosci: " + tab1[i].getNazwa_specjalnosci());
            System.out.println("Rok studiow: " + tab1[i].getRok_studiow());
            System.out.println();
        }
    }
    private void wyswietlZakres(){
        Scanner in = new Scanner(System.in);
        
        System.out.print(" Podaj poczatek zakresu: ");
        int indexP = in.nextInt();
        System.out.print(" Podaj koniec zakresu: ");
        int indexK = in.nextInt();
        
        for (int i = indexP; i<=indexK; i++){
            System.out.println("Index: " + i
            + "\nImie: " + tab1[i].getImie()
            + "\nNazwisko: " + tab1[i].getNazwisko()
            + "\nNr indeksu: " + tab1[i].getNr_indeksu()
            + "\nNazwa specjalnosci: " + tab1[i].getNazwa_specjalnosci()
            + "\nRok studiow: " + tab1[i].getRok_studiow());
        }
    }
}
