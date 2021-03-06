
package palabrathis;

/**
 *
 * @author Juan Machuca
 */
public class PalabraThis {
    
    public static void main(String[] args) {
        
        /*Persona p = new Persona("juan", "machuca");
     
        System.out.println("objeto: "+p);
        System.out.println("nombre es: "+p.nombre);
        System.out.println("apellido es: "+p.apellido);*/
        
        int array[] = new int[10], encontrar;
        
        
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*10);
        }
        
        encontrar = 5;
        
        if(encontrarNumero(array, encontrar)){
            System.out.println("numero encontrado");
        }
        else{
            System.out.println("numero NO encontrado");
        }
        System.out.println("");
    }
    
    static boolean encontrarNumero(int array[], int n){
        boolean encontrar = false;
        int i = 0;
        
        while(i < array.length && !encontrar){
            if(n == array[i]){
                encontrar = true;
            }
            
            i++;
        }
        
        return encontrar;
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
