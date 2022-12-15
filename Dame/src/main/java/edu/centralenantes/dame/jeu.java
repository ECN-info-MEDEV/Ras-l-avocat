/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.centralenantes.dame;

/**
 *
 * @author samar
 */
public class jeu {

    int[][] Mat = new int[10][10];
    int x;

    public void debutDuJeu() {
        for (int j=0;j<10;j++){
            for (int i=0;i<10;i++){
                Mat[i][j]=0;
            }
        }

        for (int j = 0; j < 5; j++) {
            if (j % 2 == 0) {
                x = 1;
            } else {
                x = 0;
            }
            for (int i = x; i < 10; i += 2) {
                Mat[j][i] = 1;
            }
        }
        for (int j = 6; j < 10; j++) {
            if (j % 2 == 0) {
                x = 1;
            } else {
                x = 0;
            }
            for (int i = x; i < 10; i += 2) {
                Mat[j][i] = -11;
            }
        }

    }
    public void prise(){
        
    }
}
