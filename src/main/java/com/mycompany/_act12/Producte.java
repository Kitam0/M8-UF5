/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._act12;

/**
 *
 * @author arnaurb
 */
public class Producte {
    // Atributs
    private String nom;
    private String categoria;
    private String subcategoria;
    private double preu;
    private static int id_producte = 0;

    // Constructor amb paràmetres
    public Producte(String nom, String categoria, String subcategoria, double preu) {
        this.nom = nom;
        this.categoria = categoria;
        this.subcategoria = subcategoria;
        this.preu = preu;
        this.id_producte++;
    }
    
    // Getters i Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(String subcategoria) {
        this.subcategoria = subcategoria;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public static int getId_producte() {
        return id_producte;
    }

    public static void setId_producte(int id_producte) {
        Producte.id_producte = id_producte;
    }

    @Override
    public String toString() {
        return "Producte{" + "nom=" + nom + ", categoria=" + categoria + ", subcategoria=" + subcategoria + ", preu=" + preu + '}';
    }
    
    
    
}
