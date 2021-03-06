
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
        System.out.println("apellido es: "+p.apellido);
        */
                
        int [][] matriz1, matriz2, matriz3;

        matriz1 = new int[3][3];    
        matriz2 = new int[3][3];
        matriz3 = new int[3][3];
        
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = (int)(Math.random()*5);
            }
        }
        
        
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = (int)(Math.random()*5);
            }
        }
        
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        
        
        
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                System.out.print(matriz3[i][j]+" ");
            }
            System.out.println("");
        }
        
        
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
