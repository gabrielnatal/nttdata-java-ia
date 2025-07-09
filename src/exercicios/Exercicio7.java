package exercicios;

import java.util.Scanner;
/*Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC e seja exibida
a mensagem de acordo com o resultado...
 */

public class Exercicio7    {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Escreva sua altura (em metros)");
        var altura = scanner.nextFloat();

        System.out.println("Escreva seu peso (em kg)");
        var peso = scanner.nextFloat();

        var imc = peso / (altura * altura);

        if(imc <= 18.5) {
            System.out.println("Abaixo do peso, seu IMC  é: " + imc);
        } else if (imc >= 18.6 && imc <= 24.9 ) {
            System.out.println("Peso ideal, seu IMC  é: " + imc);
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Levemente acima do peso, seu IMC  é: " + imc);
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade grau I, seu IMC  é: " + imc);
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obesidade grau II, seu IMC  é: " + imc);
        } else if (imc >= 40) {
            System.out.println("Obesidade III, seu IMC é: " + imc);
        }
    }
}
