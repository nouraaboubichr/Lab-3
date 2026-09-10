/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice1;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class SerieHarmonique {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Donner n : ");
        int n = sc.nextInt();

        double somme = 0;

        for (int i = 1; i <= n; i++) {
            somme = somme + 1.0 / i;
        }

        System.out.println("La somme = " + somme);
    }
    
}
