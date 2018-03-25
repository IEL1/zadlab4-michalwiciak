package pl.edu.ur.polab4;
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO zad 4, 5
        System.out.println("Wybierz numer oznaczajacy dana figure:\n"
                + "---------------------\n"
                + "1. Kolo\n"
                + "2. Kwadrat\n"
                + "3. Prostokat\n"
                + "4. Szescian\n"
                + "5. Prostopadloscian\n"
                + "6. Stozek\n"
                + "7. Kula\n"
                + "---------------------\n");
        Scanner scanner = new Scanner(System.in);
        int figura = scanner.nextInt();
        switch (figura){
            case 1:
                Kolo kolo = new Kolo();
                kolo.nazwa = "Kolo";
                System.out.println("Podaj promien kola: ");
                kolo.promien = scanner.nextDouble();
                kolo.pole = kolo.pole(kolo.promien);
                kolo.obw = kolo.obw(kolo.promien);
                System.out.println();
                kolo.PokazDane();
                break;
            case 2:
                Kwadrat kwadrat = new Kwadrat();
                kwadrat.nazwa = "Kwadrat";
                System.out.println("Podaj dlugosc boku: ");
                kwadrat.bok = scanner.nextDouble();
                kwadrat.pole = kwadrat.pole(kwadrat.bok);
                kwadrat.obw = kwadrat.obw(kwadrat.bok);
                System.out.println();
                kwadrat.PokazDane();
                break;
            case 3:
                Prostokat prostokat = new Prostokat();
                prostokat.nazwa = "Prostokat";
                System.out.println("Podaj dlugosc pierwszego boku: ");
                prostokat.bok = scanner.nextDouble();
                System.out.println("Podaj dlugosc drugiego boku: ");
                prostokat.bok2 = scanner.nextDouble();
                prostokat.pole = prostokat.pole(prostokat.bok, prostokat.bok2);
                prostokat.obw = prostokat.obw(prostokat.bok, prostokat.bok2);
                System.out.println();
                prostokat.PokazDane();
                break;
            case 4:
                Szescian szescian = new Szescian();
                szescian.nazwa = "Szescian";
                System.out.println("Podaj dlugosc boku: ");
                szescian.bok = scanner.nextDouble();
                szescian.pole = szescian.pole(szescian.bok);
                szescian.obj = szescian.obj(szescian.bok);
                System.out.println();
                szescian.PokazDane();
                break;
            case 5:
                Prostopadloscian prostopadloscian = new Prostopadloscian();
                prostopadloscian.nazwa = "Prostopadloscian";
                System.out.println("Podaj dlugosc boku: ");
                prostopadloscian.a = scanner.nextDouble();
                System.out.println("Podaj dlugosc drugiego boku: ");
                prostopadloscian.b = scanner.nextDouble();
                System.out.println("Podaj wysokosc: ");
                prostopadloscian.c = scanner.nextDouble();
                prostopadloscian.pole = prostopadloscian.pole(prostopadloscian.a, prostopadloscian.b, prostopadloscian.c);
                prostopadloscian.obj = prostopadloscian.obj(prostopadloscian.a, prostopadloscian.b, prostopadloscian.c);
                System.out.println();
                prostopadloscian.PokazDane();
                break;
            case 6:
                Stozek stozek = new Stozek();
                stozek.nazwa = "Stozek";
                System.out.println("Podaj promien stozka: ");
                stozek.r = scanner.nextDouble();
                System.out.println("Podaj dlugosc tworzacej stozka: ");
                stozek.l = scanner.nextDouble();
                System.out.println("Podaj wysokosc stozka: ");
                stozek.h = scanner.nextDouble();
                stozek.pole = stozek.pole(stozek.l, stozek.h);
                stozek.obj = stozek.obj(stozek.r, stozek.h);
                System.out.println();
                stozek.PokazDane();
                break;
            case 7:
                Kula kula = new Kula();
                kula.nazwa = "Kula";
                System.out.println("Podaj promien kuli: ");
                kula.r = scanner.nextDouble();
                kula.pole = kula.pole(kula.r);
                kula.obj = kula.obj(kula.r);
                System.out.println();
                kula.PokazDane();
                break;
            default:
                System.out.println("Nie ma figury o takim oznaczeniu");
                break;
        }
        
    }
    
}
