package POO;

/**
 *
 * @author Raul
 */
public class autoMain {
    public static void main(String[] args) {
        auto dat= new auto("Toyota", "Corolla");
        auto vel= new auto(60);
        
        dat.datos();
        vel.acelerar();
        vel.frenar();
        
    }
}