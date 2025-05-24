package SingleResponsiblity;

// Classe principal com o método main
public class Main {
    public static void main(String[] args) {
        // Criação de um objeto Carro com marca "Ford", 4 passageiros e 150 km rodados
        Carro car = new Carro("Ford", 4, 150);

        // Criação de um objeto responsável por imprimir informações do carro
        PrintCar printCar = new PrintCar();

        // Impressão de todas as informações do carro
        printCar.print_car(car);

        // Alteração dos atributos do carro
        car.set_model("Civic");
        car.set_quilometragem(150);
        car.set_passageiro(5);

        // Impressão das informações modificadas individualmente
        printCar.print_model(car);
        printCar.print_passageiro(car);
        printCar.print_quilometragem(car);
    }
}
