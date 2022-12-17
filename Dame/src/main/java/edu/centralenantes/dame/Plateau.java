/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.centralenantes.dame;


/**
 *
 * @author T480
 */
public class Plateau {
    public Integer pionsB;
    public Integer pionsN;
    public int[][] plateau = new int [10][10]; 
    public void init_plateau(){
        pionsB = 20;
        pionsN = 20; 
        for (int i=0; i<4; i++){
            if (i%2 ==0){
                for (int j=0; j<10; j++){
                    if(j%2 == 0){
                        plateau[i][j] = -1;
                    }
                    else{
                        plateau[i][j] = 0;
                    }
                }
                 
            }
            else{
                for(int j=0; j<10; j++){
                    if(j%2 != 0){
                        plateau[i][j] = -1;
                    }
                    else{
                        plateau[i][j] = 0;
                    }
                }
            }
        }
        for (int i=4; i<6; i++){
            for (int j=0; j<10; j++){
                plateau[i][j] = 0;
            }
        }
        for (int i=6; i<10; i++){
            if(i%2 ==0){
               for (int j=0; j<10; j++){
                    if(j%2 == 0){
                        plateau[i][j] = 1;
                    }
                    else{
                        plateau[i][j] = 0;
                    }
                } 
            }
            else{
                for(int j=0; j<10; j++){
                    if(j%2 != 0){
                        plateau[i][j] = 1;
                    }
                    else{
                        plateau[i][j] = 0;
                    }
                }
            }
        } 
}
    
    
}
