/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice6;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class FenetreGlissante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int MAXV = 100000;

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] T = new int[n];

        for (int i = 0; i < n; i++) {
            T[i] = sc.nextInt();
        }

        int[] freq = new int[MAXV + 1];

        int distinct = 0;

        for (int i = 0; i < k; i++) {

            int x = T[i];

            if (freq[x] == 0) {
                distinct++;
            }

            freq[x]++;
        }

        
        System.out.print(distinct);

        for (int i = k; i < n; i++) {

            // Élément qui sort
            int out = T[i - k];

            freq[out]--;

            if (freq[out] == 0) {
                distinct--;
            }

            int in = T[i];

            if (freq[in] == 0) {
                distinct++;
            }

            freq[in]++;

            
            System.out.print(" " + distinct);
        }

        System.out.println();
    }
    
}
