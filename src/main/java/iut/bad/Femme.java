/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iut.bad;

/**
 *
 * @author leewt
 */
public class Femme extends Humain{
    
    
    public Femme(String femme, String marie, int par) {
         super(femme, marie, par);
    }
    public static void main(String[] args){
        Femme femme = new Femme("Femme", "Marie", 20);
        Homme homme = new Homme("Homme", "Lee", 25);
        femme.ami(homme,444);
        femme.ami(homme);
    }


}
