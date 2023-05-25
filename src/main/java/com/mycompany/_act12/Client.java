/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._act12;

import java.util.ArrayList;

/**
 *
 * @author arnaurb
 */
public class Client {
    // Atributs
    private String nom;
    private String cognom;
    private String n_telefon;
    private static int id_client;

    // Constructor per paràmetres
    public Client(String nom, String cognom, String n_telefon) {
        this.nom = nom;
        this.cognom = cognom;
        this.n_telefon = n_telefon;
        this.id_client++;
    }

    // Getters i Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public String getN_telefon() {
        return n_telefon;
    }

    public void setN_telefon(String n_telefon) {
        this.n_telefon = n_telefon;
    }

    public static int getId_client() {
        return id_client;
    }

    public static void setId_client(int id_client) {
        Client.id_client = id_client;
    }

    @Override
    public String toString() {
        return nom + " " + cognom + " " + n_telefon;
    }
    
    
}

