package estruturaDeControle;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        var name = scanner.next();

        System.out.println("Informe sua idade");
        var age = scanner.nextInt();

        if (age >= 18){
            System.out.printf("%s, possui %s anos e pode dirigir!", name, age);
        }else System.out.printf("%s, possui %s anos e não pode dirigir!", name, age);


        /* var canDrive = (age>=18) || (age >= 16 && isEmancipated);
        var message = canDrive ?
                    name + ", voce pode dirigir" :
                    name + ", voce nao pode dirigir"
            System.out.println(message);

       Operator funciona com ? e :
         */

    }
}
