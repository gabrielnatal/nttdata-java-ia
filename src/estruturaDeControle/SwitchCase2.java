package estruturaDeControle;

import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe um número de 1 a 7");
        var option = scanner.nextInt();

        switch(option){
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terça");
            case 4 -> System.out.println("Quarta");
            case 5 -> System.out.println("Quinta");
            case 6 -> System.out.println("Sexta");
            case 7 -> System.out.println("Sabado");
            default-> System.out.println("Opção inválida");
            // Switch Case switch expression com setas (arrow labels)-
        }


    }
}