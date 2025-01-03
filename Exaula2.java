
 import java.util.Scanner;
 
public class Exaula2 {

 
    public static void main(String[] args) {
       
         Scanner entrada = new Scanner(System.in);
       int contador =1;
       int num;
       int soma = 0;
      
       
         System. out. print("Digite um numero inteiro: " );
       num = entrada.nextInt();
       
       while (contador<=num){
           soma = soma + contador;
           contador ++;
           
       }
   System.out.println("O valor da soma e:" +soma );
        
    }
    
}
