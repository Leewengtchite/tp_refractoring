/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.refractoring;

import iut.bad.Humain;

/**
 *
 * @author leewt
 */
public class Refractoring {

    public static void main(String[] args) {
        Humain personne = new Humain("Someone", "SomeBody", 20);
        Humain personne2 = new Humain("Jean", "Paul", 25);
        personne.details(); 
        personne.manger();
        personne.boire();
        personne.ami(personne2);

    }
}
