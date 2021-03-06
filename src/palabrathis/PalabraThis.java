
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
<<<<<<< HEAD
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
=======
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
        
        
>>>>>>> RamaMatriz
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
