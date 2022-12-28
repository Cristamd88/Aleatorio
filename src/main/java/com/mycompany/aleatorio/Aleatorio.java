/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aleatorio;

import java.util.Random;

/**
 *
 * @author ASUS455
 */
public class Aleatorio {

    public static void main(String[] args) {
       int min = 1;
       int max = 10;
       int numeros[];
       numeros = new int[10];
       
       for(int x = 0; x<numeros.length;x++){
           System.out.println(numeros[x]);
       }
       Random random = new Random();
       int value = random.nextInt(max + min)+ min;
       System.out.println(value);
    }
}
