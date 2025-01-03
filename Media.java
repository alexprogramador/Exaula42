


package media;

/**
 * // Nome: Arthur Barbosa
// Disciplina: Educação Física
// Nota das provas: 8, 8, 9
// Soma entre as provas: 25
// Professor: Alexsandro Barbosa da Silva
// Descrição: avaliação escolar
// Autor: Alexsandro Barbosa da Silva
// Para a Disciplina de: Projeto Integrador II-B 
// Professora: Lorena Piza Arndt
 * Tema: Algoritimo em Java" Média de um aluno"
 */

import java.util.Scanner;

public class Media {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do Aluno:"); 
        String nome = scanner.nextLine();
        
        double nota1, nota2, nota3;

        System.out.println("Entre com a primeira nota:");
        nota1 = scanner.nextDouble();
        while (nota1 < 0 || nota1 > 10) {
            System.out.println("Erro! A nota deve ser entre 0 e 10"); 
            System.out.print("Digite novamente a nota: ");
            nota1 = scanner.nextDouble();
        }

        System.out.println("Entre com a segunda nota :");
        nota2 = scanner.nextDouble();
        while (nota2 < 0 || nota2 > 10) {
            System.out.println("Erro! A nota deve ser entre 0 e 10"); 
            System.out.print("Digite novamente a nota: ");
            nota2 = scanner.nextDouble();
        }

        System.out.println("Entre com a terceira nota:");
        nota3 = scanner.nextDouble();
        while (nota3 < 0 || nota3 > 10) {
            System.out.println("Erro! A nota deve ser entre 0 e 10"); 
            System.out.print("Digite novamente a nota: ");
            nota3 = scanner.nextDouble();
        }

        double soma = (nota1 + nota2 + nota3);
        System.out.println("Nota do Aluno: " + soma);
     
        if (soma >= 18) {
            System.out.println("Aluno: " +nome+ " Aprovado!");
        } else if (soma >= 15) {
            System.out.println("Aluno: " +nome+ " de Recuperacao Final!");
        } else {
            System.out.println("Aluno: " +nome+ " Reprovado!");
        }
    }
}
