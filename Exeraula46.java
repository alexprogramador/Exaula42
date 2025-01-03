
package exeraula46;

import java.util.Scanner;

public class Exeraula46 {

    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double resultado=0;
        boolean sair = false;
        
        do{
            System.out.println("Escolha uma operacao");
            System.out.println("1 - Somar");
            System.out.println("2 - Sutrair");
            System.out.println("3 - Multplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Sair");
            int opcao = input.nextInt();
            switch (opcao){
                
                case 1:
                    System.out.print("Digite o primeiro numero: ");
                    double numero1 = input.nextDouble();
                    System.out.print("Digite o segundo numero: ");
                    double numero2 = input.nextDouble();
                    resultado = numero1 + numero2;
                    System.out.println(" O resultado da soma e: " +resultado);
                    break;
                    
                case 2:
                System. out.print("Digite o primeiro numero: ");
                double numero3 = input.nextDouble();
                System.out.print("Digite o segundo numero: ");
                double numero4 = input.nextDouble();
                resultado = numero3 - numero4;
                System.out.println("O resultado da subtracao e: " +resultado);
                break;
                
                case 3:
                System.out.print("Digite o primeiro numero: ");
                double numero5 = input.nextDouble();
                System.out.print("Digite o segundo numero: ");
                double numero6 = input.nextDouble();
                resultado = numero5 * numero6;
                System.out.println("O resultado da multiplicacao e: " +resultado);
                break;
                
                case 4:
                System.out.print("Digite o primeiro numero: ");
                double numero7 = input.nextDouble();
                System.out.print("Digite o segundo numero: ");
                double numero8 = input.nextDouble();
                resultado = numero7 /  numero8;
                System.out.println("O resultado da divisao e: " +resultado);
                break;
                
                case 5:
                sair = true;
                break;
                default:
                System.out.println("Opcao invalida. Tente novamente");
                break;
                
            }
        }while(!sair);
    
}
}
