package SingleResponsiblity;

public class Carro{

    int quilometragem;
    int passageiros;
    String modelo;

    Carro(String model,int passageiros,int quilometragem){
        this.modelo=model;
        this.quilometragem=quilometragem;
        this.passageiros=passageiros;
    }

    void set_model(String model){
        this.modelo=model;
    }
    String  get_model(){
        return modelo;
    }

    void set_quilometragem(int model){
        this.quilometragem=model;
    }
    int get_quilometragem(){
        return this.quilometragem;
    }

    void set_passageiro(int passageiros){
        this.passageiros=passageiros;
    }
    int get_passageiro(){
        return this.quilometragem;
    }

    public static class MainSingleResponsibility {
        public static void main(String[] args) {
            Carro car=new Carro("Ford",4,150);
            PrintCar printCar=new PrintCar();
        }
    }
}

