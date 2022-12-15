/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.centralenantes.dame;

/**
 *
 * @author T480
 */
public class Pion {

    public Point2D pos;
    public int couleur; // 1 pour blanche et -1 pour noir

    public Pion(Point2D pos, int couleur) {
        this.pos = pos;
        this.couleur = couleur;
    }

   public void deplace(String direction, Plateau p){
        
        if(direction.equals('g')){
            // verifier que la case est dans le plateau
            if((this.pos.getX()-1>=0)&&(this.pos.getY()+1<50)){
                //Si la case est vide
                if(p.plateau[this.pos.getX()-1][this.pos.getY()+1]==0){
                
                    if(this.couleur == 1){
                        p.plateau[this.pos.getX()-1][this.pos.getY()+1] = -1;
                }
                    if(this.couleur== -1){
                        p.plateau[this.pos.getX()-1][this.pos.getY()+1] = 1;
                }
                    p.plateau[this.pos.getX()][this.pos.getY()]=0 ;
                    this.pos.setX(this.pos.getX() - 1);
                     this.pos.setY(this.pos.getY() + 1);
                
                }
                //si la case contient un pion noire
                if(p.plateau[this.pos.getX()-1][this.pos.getY()+1]==-1){
                    if(this.couleur== -1){
                        System.out.println("mouvement impossible");
                }
                    else{
                        //this.manger() ;
                    }
                }
                //si la case contient un pion blanc
                if(p.plateau[this.pos.getX()-1][this.pos.getY()+1]==1){
                    if(this.couleur== 1){
                        System.out.println("mouvement impossible");
                }
                    else{
                        //this.manger()
                    }
                }
            }
        }
        if(direction.equals('d')){
            // verifier que la case est dans le plateau
            if((+1<50)&&(this.pos.getY()+1<50)){
                //Si la case est vide
                if(p.plateau[this.pos.getX()+1][this.pos.getY()+1]==0){
                
                    if(this.couleur== -1){
                        p.plateau[this.pos.getX()+1][this.pos.getY()+1] = -1;
                }
                    if(this.couleur== 1){
                        p.plateau[this.pos.getX()+1][this.pos.getY()+1] = 1;
                }
                    p.plateau[this.pos.getX()][this.pos.getY()]=0 ;
                    this.pos.setX(this.pos.getX() + 1);
                     this.pos.setY(this.pos.getY() - 1);
                
                }
                //si la case contient un pion noire
                if(p.plateau[this.pos.getX()+1][this.pos.getY()+1]==-1){
                    if(this.couleur== -1){
                        System.out.println("mouvement impossible");
                }
                    else{
                        // this.manger();
                    }
                }
                //si la case contient un pion blanc
                if(p.plateau[this.pos.getX()+1][this.pos.getY()+1]==1){
                    if(this.couleur== 1){
                        System.out.println("mouvement impossible");
                }
                    else{
                        //this.manger();
                    }
                }
            }
        }
    }
    
    
    
    
    
}
