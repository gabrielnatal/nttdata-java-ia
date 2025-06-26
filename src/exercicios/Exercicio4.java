package exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Nome da pessoa 1");
        var nomePessoa1 = scanner.next();
        System.out.println("Idade pessoa 1");
        var idadePessoa1 = scanner.nextInt();
        System.out.println("Nome da pessoa 2");
        var nomePessoa2 = scanner.next();
        System.out.println("Idade pessoa 2");
        var idadePessoa2 = scanner.nextInt();

        var diferencaIdade = Math.abs(idadePessoa1 - idadePessoa2);
        System.out.printf("A diferença de idade é %s", diferencaIdade);
    }
}
