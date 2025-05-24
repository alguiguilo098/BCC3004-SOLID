// Define o pacote onde esta classe está localizada
package ComposicaoHerança;

// Classe principal que contém o metodo
public class Main {
    public static void main(String[] args) {

        // Cria uma instância da classe CachorroC (composição)
        CachorroC cachorroc = new CachorroC();

        // Chama o metodo comer() do objeto cachorroc
        cachorroc.comer();

        // Chama o metodo latir() do objeto cachorroc
        cachorroc.latir();

        // Cria uma instância da classe CachorroH (herança)
        CachorroH cachorroh = new CachorroH();

        // Chama o metodo comer() do objeto cachorroh (herdado da superclasse)
        cachorroh.comer();

        // Chama o metodo latir() do objeto cachorroh (herdado da superclasse)
        cachorroh.latir();
    }
}
