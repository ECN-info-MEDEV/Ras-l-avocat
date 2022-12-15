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
    public Point2D pos; //position du pion 
    public String couleur;
    
    
    /**
     * 
     * @param position
     * @param clr 
     */
    public Pion(Point2D position, String clr){
        pos = position;
        couleur = clr;
    }
    public void deplace(String direction, Plateau p){
        
        if(direction.equals('g')){
            // verifier que la case est dans le plateau
            if((this.pos.x-1>=0)&&(this.pos.y+1<50)){
                //Si la case est vide
                if(p.plateau[this.pos.x-1][this.pos.y+1]==0){
                
                    if(this.couleur.equals('noir')){
                        p.plateau[this.pos.x-1][this.pos.y+1] = -1;
                }
                    if(this.couleur.equals('blanc')){
                        p.plateau[this.pos.x-1][this.pos.y+1] = 1;
                }
                    p.plateau[this.pos.x][this.pos.y]==0
                    this.pos.x = this.pos.x-1;
                    this.pos.y = this.pos.y+1;
                
                }
                //si la case contient un pion noire
                if(p.plateau[this.pos.x-1][this.pos.y+1]==-1){
                    if(this.couleur.equals('noir')){
                        System.out.println('mouvement impossible');
                }
                    else(){
                        this.manger()
                    }
                }
                //si la case contient un pion blanc
                if(p.plateau[this.pos.x-1][this.pos.y+1]==1){
                    if(this.couleur.equals('blanc')){
                        System.out.println('mouvement impossible');
                }
                    else(){
                        this.manger()
                    }
                }
            }
        }
        if(direction.equals('d')){
            // verifier que la case est dans le plateau
            if((this.pos.x+1<50)&&(this.pos.y+1<50)){
                //Si la case est vide
                if(p.plateau[this.pos.x+1][this.pos.y+1]==0){
                
                    if(this.couleur.equals('noir')){
                        p.plateau[this.pos.x+1][this.pos.y+1] = -1;
                }
                    if(this.couleur.equals('blanc')){
                        p.plateau[this.pos.x+1][this.pos.y+1] = 1;
                }
                    p.plateau[this.pos.x][this.pos.y]==0
                    this.pos.x = this.pos.x+1;
                    this.pos.y = this.pos.y+1;
                
                }
                //si la case contient un pion noire
                if(p.plateau[this.pos.x+1][this.pos.y+1]==-1){
                    if(this.couleur.equals('noir')){
                        System.out.println('mouvement impossible');
                }
                    else(){
                        this.manger()
                    }
                }
                //si la case contient un pion blanc
                if(p.plateau[this.pos.x+1][this.pos.y+1]==1){
                    if(this.couleur.equals('blanc')){
                        System.out.println('mouvement impossible');
                }
                    else(){
                        this.manger()
                    }
                }
            }
        }
    }
}
