package exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
            var scanner = new Scanner(System.in);
        System.out.println("Escreva a base do triangulo");
        var base = scanner.nextInt();
        System.out.println("Escreva a altura do triangulo");
        var altura = scanner.nextInt();
        var area = base * altura;
        System.out.println("A area do triangulo é: " + area);
    }
}
