package com.skillbrain;

import java.util.Scanner;
public class CitireDelaTastatura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Citire numar intreg
        System.out.println("Introdu un numar intreg: ");
        int numarIntreg = scanner.nextInt();
        System.out.println("Numarul intreg introdus este: " + numarIntreg);

        /* Citire numar zecimal */
        System.out.println("Intru un numar zecimal: ");
        double numarZecimal = scanner.nextDouble();
        System.out.println("Numarul zecimal introdus este: " + numarZecimal);

        // Citire text
        scanner.nextLine(); // Consuma newline-ul creat de scanarea de numere
        System.out.println("Introdu un text: ");
        String text = scanner.nextLine();
        System.out.println("Textul introdus este: " + text);

        //Inchide scannerul
        scanner.close();
    }
}
