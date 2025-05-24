package SingleResponsiblity;

public class PrintCar {

    PrintCar(){

    }

    public void print_car(Carro car){
        System.out.println("Modelo: "+car.get_model());
        System.out.println("Passageiro: "+car.get_passageiro());
        System.out.println("Quilometragem:"+car.get_quilometragem());

    }

    void print_model(Carro car){
        System.out.println("Modelo: "+car.get_model());
    }

    void print_passageiro(Carro car){
        System.out.println("Passageiro: "+car.get_passageiro());
    }
    void print_quilometragem(Carro car){
        System.out.println("Quilometragem: "+car.get_quilometragem());
    }

}
