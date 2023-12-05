package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci le dimensioni della base del rettangolo: ");
        int userBase = scan.nextInt();

        System.out.print("Inserisci le dimensioni dell'altezza del rettangolo: ");
        int userAltezza = scan.nextInt();

        Rettangolo rettangolo = new Rettangolo(userBase, userAltezza);

        System.out.println("Il perimetro del rettangolo sarà di: " + rettangolo.perimetroRettangolo());
        System.out.println("L'area del rettangolo sarà di: " + rettangolo.areaRettangolo());

        System.out.println("Disegno rettangolo:");
        System.out.println(rettangolo.disegna());


        scan.close();
    }

}
