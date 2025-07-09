package exercicios;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Infome um número: ");
        var number = scanner.nextInt();

        System.out.println("Tabuada do " + number + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = number * i;
            System.out.println(number + " x " + i + " = " + resultado);
        }


    }
}


