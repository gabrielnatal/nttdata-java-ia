import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

      var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro numero");
        var value1 = scanner.nextInt();
        System.out.println("Informe o segundo numero");
        var value2 = scanner.nextInt();
        var resultado = value2 + value1;
        System.out.println("O resultado é: " + resultado);
//
    }

}