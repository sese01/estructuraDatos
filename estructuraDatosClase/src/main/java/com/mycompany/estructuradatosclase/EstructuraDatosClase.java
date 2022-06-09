/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.estructuradatosclase;

import javax.swing.JOptionPane;

/**
 *
 * @author sese4
 */
public class EstructuraDatosClase {

    public static void main(String[] args) {
 
        //Esto es opcional
        final int CANTIDAD=5;
        int num[]=new int[CANTIDAD];
 
        //Invocamos las funciones
        index(num);
 
        showIndex(num);
    }
        //Ventana que solicita el numero
    public static void index(int lista[]){
        for(int i=0;i<lista.length;i++){
            String texto=JOptionPane.showInputDialog("Ingresa el numero");
            lista[i]=Integer.parseInt(texto);
        }
    }
        //Se muestra el index con el numero respectivo indicado por el usuario o cliente
    public static void showIndex(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("Index "+i+" tiene el siguiente valor "+lista[i]);
        }
    }
}
