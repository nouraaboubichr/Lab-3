/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice5;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class RotationMatrice {

    /**
     * @param args the command line arguments
     */
     public static void rotate90ClockwiseInPlace(int[][] A) {

        int n = A.length;

        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {

                int temp = A[i][j];
                A[i][j] = A[i][n - 1 - j];
                A[i][n - 1 - j] = temp;
            }
        }
    }

    public static void afficher(int[][] A) {

        int n = A.length;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Donner N : ");
        int n = sc.nextInt();

        if (n < 2 || n > 200) {
            System.out.println("N doit être entre 2 et 200.");
            return;
        }

        int[][] A = new int[n][n];

        System.out.println("Donner les éléments de la matrice :");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        rotate90ClockwiseInPlace(A);

        System.out.println("Matrice après rotation de 90 degrés :");
        afficher(A);
    }
    
}
