package POO;

/**
 *
 * @author Yago
 * 
 */
public class perro {

    String nombre;
    String raza;

    public perro(String nombre, String raza){
        this.nombre =nombre;
        this.raza =raza;
    }
    void ladrar(){
        System.out.println(nombre+" es de raza: "+raza);
        System.out.println(nombre + " dice: GUAU! GUAU!");
    }
}
