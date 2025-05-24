package ComposicaoHerança;

public class CachorroC {
    final Animal animal=new Animal();

    // Metodo específico da classe Cachorro
    void latir() {
        System.out.println("Latir ...");
    }

    //
    void comer(){
        animal.comer();
    }
}
