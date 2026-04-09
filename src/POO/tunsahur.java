package POO;

/**
 *
 * @author Raul
 */
public class tunsahur {
    
    String nombre;
    int edad;
    String gusta;
    String hace;
    
    public tunsahur(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    public tunsahur(String gusta, String hace){
        this.gusta=gusta;
        this.hace=hace;
    }
    void dato1(){
        System.out.println("mi compañero se llama "+nombre+" y tiene "+edad+" años");
    }
    void dato2(){
        System.out.println("en la escuela le gusta "+gusta+" y "+hace);
    }
}
