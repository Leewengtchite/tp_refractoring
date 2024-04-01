/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iut.bad;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leewt
 */
public class Humain implements Consommation {

    private String nom;
    private String prenom;
    private int age;
    private List<Humain> amis; 
    
    public Humain() {
        amis = new ArrayList<>();
    }
    
    public Humain(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        amis = new ArrayList<>();
    }
    
      public void details() {
        System.out.println(toString());
    }
      
    @Override
    public void manger() {
        System.out.println("manger");
    }
    
    @Override
    public void boire() {
        System.out.println("boire");
    }
    
    public void ami(Humain ami) {
        amis.add(ami);
        ami.amis.add(this); 
        System.out.println(this.nom + " est maintenant ami avec " + ami.nom + ".");
    }
    
    @Override
    public String toString() {
        return "Humain{" + "nom=" + nom + ", prenom=" + prenom + ", age=" + age + '}';
    }
      
    
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String getPrenom() {
        return prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
}
