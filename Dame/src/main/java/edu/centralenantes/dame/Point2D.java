/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.centralenantes.dame;

/**
 *
 * @author T480
 */
class Point2D {
     //les attributs de la classe
    /**abcisse du point (prive)
     */
    private int x;
    /**ordonnée du point (prive)
     */
    private int y;
    
    // Constructeurs et methodes
    /**
    * Un constructeur avec deux entiers
    * en parametres.
    * @param a un entier representant l’abcisse du point
    * @param b un entier representant l’ordonnée du point
    */
    public Point2D(int a, int b) {
        x = a;
        y = b;
    }
    /**
    * Un constructeur avec des paramètres par défaut (0,0)
    */
    public Point2D() {
        x = 0;
        y = 0;
    }
    /**
    * Un constructeur avec un objet Point2D
    * en parametres.
    * @param p un objet Point2D
    */
    public Point2D(Point2D p)   {  
    //copying each filed   
    this.x = p.x; //getter  
    this.y = p.y; //getter  
    }   
    
    /**Methodes getter
     * 
     * @return x,y les coordonnées du point
     */
    public int getX() { return x; }

    public int getY() { return y; }
    
    /**Methodes setter
     * 
     * @param a,y les ccoordonnées du point
     */
    
    public void setX(int a) {this.x = a;}
    
    public void setY(int b) {this.y = b;}
    
    /** Methode setPosition
     * définit les coordonnées du point
     * @param a abcisse du point
     * @param b odonnée du point
     */
    
    public void setPosition(int a,int b) {
        x = a;
        y = b; }
    
    /**Methode translate
     * translate le point dans le plan
     * @param dx un entier représentant l'abcisse du vecteur de translation
     * @param dy un entier représentant l'ordonnée du vecteur de translation
     */
    public void translate(int dx,int dy) {
        x  = x + dx;
        y  = y + dy; 
    }
    
    /**Methode affiche
     * affiche les coordonnées du point
     */
    public void affiche(){
        System.out.println("les coordonnées de ce point : ["+x+","+y+"]");
    }
}
