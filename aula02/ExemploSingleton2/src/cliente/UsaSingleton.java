package cliente;


/*
*  Professor Gerson Risso
 */
import pattern.Singleton;

public class UsaSingleton {

    public static void main(String[] args) {
        Singleton sin1 = Singleton.getInstance();
        Singleton sin2 = Singleton.getInstance();
        Singleton sin3 = Singleton.getInstance();
        Singleton sin4 = Singleton.getInstance();

        System.out.println(sin1);
        System.out.println(sin2);
        System.out.println(sin3);
        System.out.println(sin4);
    }

}
