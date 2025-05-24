package InterfaceSegregationPrinciple;

public class Pato implements Comedor,Nadador{
    @Override
    public void comer() {
        System.out.println("Pato comendo...");
    }

    @Override
    public void nadar() {
        System.out.println("Pato nadando...");
    }
}
