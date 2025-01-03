/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

import java.util.Scanner;

public class Semana1ex {
    public static void main(String args[]){
        final double CAMBIO_ATUAL = 5.07;
        Scanner s = new Scanner(System.in);
        System. out. print("Qual o valor em Dolar?: $");
        double valorEmDolar = s.nextDouble();
        double valorEmReal = valorEmDolar*CAMBIO_ATUAL;
        System.out. println("Valor atual em Real e: R$" + valorEmReal);
    }
}
