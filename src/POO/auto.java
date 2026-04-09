package POO;

/**
 *
 * @author Raul
 */
public class auto {
    String marca;
    String modelo;
    int velocidad;
    
    public auto(String marca, String modelo){
        this.marca=marca;
        this.modelo=modelo;
    }
    public auto(int velocidad){
        this.velocidad=velocidad;
    }
    
    void datos(){
        System.out.println("el auto es marca: "+marca+", modelo: "+modelo);
    }
    void acelerar(){
    velocidad=velocidad+20;
            System.out.println("acelerando... velocidad actual: "+velocidad+"k/h");
    }
    void frenar(){
    velocidad=velocidad-30;
            System.out.println("frenando... velocidas actual: "+velocidad+"k/h");
    }
}
