package POO;

/**
 *
 * @author Yago
 */
public class perroMain {
    public static void main(String[] args) {
        
        perro p1 = new perro("Firulais", "callejero");
        perro p2 = new perro("Luna", "pastor aleman");

        p1.ladrar();
        p2.ladrar();
    }
}
