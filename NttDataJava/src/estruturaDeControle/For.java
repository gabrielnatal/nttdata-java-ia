package estruturaDeControle;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        for(var i = 1;i < 100; i++){
            System.out.println(i);
        }

    }
}
/* Inicialização (var i = 1)Aqui é onde a variável de controle (i) é criada e recebe um valor inicial.
                            Executado apenas uma vez, no início do laço.
   Condição (i < 100) é a condição de continuação, ou seja, "enquanto" essa condição for verdadeira, o laço continua.
   Incremento (i++) O que acontece com a variável i após cada iteração do laço
 */