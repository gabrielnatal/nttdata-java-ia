package exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Escreva o tamanho do lado do quadrado");
        var lado = scanner.nextInt();
        var area = lado * lado;
        System.out.println("A área é: " + area);
        //
    }
}

