package one.digitalinnovation.gof;

/**
 * Singleton "Apressado".
 *
 * @author felip
 *
 */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public  static SingletonEager getInstancia(){
        return instancia;
    }
}