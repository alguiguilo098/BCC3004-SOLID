package OpenClosedPrinciple; // Define o pacote onde está a classe

import java.util.Arrays; // Importa utilitário para imprimir arrays

public class Main {
    public static void main(String[] args) {
        // Cria e inicializa um array de inteiros
        int[] arry = {1, 3, 4, 5, 6, 7, 8, 9};

        // Cria um objeto da classe Array, que encapsula esse array
        Array array = new Array(arry);

        // Define uma operação de soma utilizando expressão lambda (10 + 2 = 12)
        Operations outnumbers = (a, b) -> a + b;

        // Aplica a operação sobre o array (ex: preenche o array com o resultado da operação)
        array.apply(outnumbers, 10, 2);

        // Imprime o array após a primeira operação
        System.out.println(Arrays.toString(arry));

        // Redefine a operação para divisão (10 / 2 = 5)
        outnumbers = (a, b) -> a / b;

        // Aplica a nova operação sobre o array
        array.apply(outnumbers, 10, 2);

        // Imprime o array após a segunda operação
        System.out.println(Arrays.toString(arry));
    }
}
