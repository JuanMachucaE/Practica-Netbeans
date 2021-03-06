
package palabrathis;

/**
 *
 * @author Juan Machuca
 */
public class PalabraThis {
    
    public static void main(String[] args) {
        
        Persona p = new Persona("juan", "machuca");
     
        System.out.println("objeto: "+p);
        System.out.println("nombre es: "+p.nombre);
        System.out.println("apellido es: "+p.apellido);
    }
    
}

class Persona{
    
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("objeto Persona -->  "+this);
        new Imprimir().imprimir(this);
    }
}

class Imprimir{
    
    public void imprimir(Persona p){
        System.out.println("objeto Persona -->  "+p);
        System.out.println("objeto Imprimir -->  "+this);
    }
}
