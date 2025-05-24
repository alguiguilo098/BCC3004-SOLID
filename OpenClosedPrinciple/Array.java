package OpenClosedPrinciple; // Define o pacote da classe

public class Array {
    int[] value; // Array de inteiros que será manipulado

    // Construtor que recebe um array como parâmetro e o armazena na variável 'value'
    Array(int[] value) {
        this.value = value;
    }

    // Metodo que aplica uma operação
    void apply(Operations operetor, int value1, int value2) {
        for (int i = 0; i < value.length; i++) {
            // Para cada posição do array, substitui o valor pelo resultado da operação entre value1 e value2
            this.value[i] =operetor.operator(value1, value2);
        }
    }
}
