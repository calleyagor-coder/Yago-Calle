package POO;

/**
 *
 * @author Yago
 */
public class estudianteMain {

    public static void main(String[] args){

        estudiante e1 = new estudiante("Yago", 17);
        estudiante e2 = new estudiante("Uriel", 16);

        e1.estudiar();
        e2.rendir();
        e2.comer();
    }
}