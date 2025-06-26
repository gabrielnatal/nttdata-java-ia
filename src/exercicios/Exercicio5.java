package exercicios;

import java.util.Scanner;

//exercicios estruturas de controle
public class Exercicio5 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe um número ");
        var n1 = scanner.nextInt();
        var keepVerify = true;
        while(keepVerify){
            System.out.println("Informe um número para verificação ");
            var n2 = scanner.nextInt();
            if(n2 < n1 ){
                System.out.println("Informe um número maior que o primeiro ");
                continue;
            }

           var result = n2 % n1;
            keepVerify = result == 0;
            System.out.printf("%s %% %s = %s" ,n2, n1,result );
        }



    }
}
