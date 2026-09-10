/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice3;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class CarresImpairs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Combien de valeurs : ");
        int n = sc.nextInt();

        int[] tableau = new int[n];

        for (int i = 0; i < n; i++) {

            int impair = 2 * i + 1;

            tableau[i] = impair * impair;
        }

        for (int i = 0; i < n; i++) {

            int impair = 2 * i + 1;

            System.out.println(
                impair + " a pour carre " + tableau[i]
            );
        }
    }
    }
    

