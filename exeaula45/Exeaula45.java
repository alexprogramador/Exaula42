
package exeaula45;

import java.util.Scanner;

public class Exeaula45 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero de 1 a 7: ");

        int numero = input.nextInt();
        while (numero < 1 || numero > 7) {
            System.out.println("Erro, Digite um numero entre 1 e 7");
            System.out.print("Digite um numero valido: ");
            numero = input.nextInt();
            System.out.print("confirme: ");
        }

        
        switch (numero) {
        
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.print("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Numero invalido");
                break;
        
        }
  
    }

}
