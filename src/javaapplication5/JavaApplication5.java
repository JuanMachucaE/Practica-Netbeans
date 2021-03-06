package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author Juan Machuca
 */
public class JavaApplication5 {

    static Scanner sc = new Scanner(System.in);

    static boolean encontrarNumero(int array[], int encontrar) {

        boolean encontrado = false;
        int indice = 0;
        
        while(!encontrado && indice < array.length){
            if(encontrar == array[indice]){
                encontrado = true;
            }
            indice ++;
        }
        
        return encontrado;    
    }

    public static void main(String[] args) {
        /*int num[] = new int[5];
        int encontrar;

        for (int i = 0; i < num.length; i++) {
            System.out.print("numero [" + (i + 1) + "]: ");
            num[i] = sc.nextInt();
        }

        System.out.print("ingrese numero buscar: ");
        encontrar = sc.nextInt();

        boolean hallar = encontrarNumero(num, encontrar);

        if (hallar) {
            System.out.println("numero hallado");
        } else {
            System.out.println("numero no hallado");
        }
        */
        
        int[][] matriz1, matriz2, matriz3;  
        matriz1 = new int[3][3];
        matriz2 = new int[3][3];
        matriz3 = new int[3][3];
        
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = (int)(Math.random()*10);
            }
        }
        
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = (int)(Math.random()*10);
            }
        }
        
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print("["+matriz1[i][j]+"]");
            }
            
            if(i==1){
                System.out.print("  +   ");
            }else{
                System.out.print("      ");
            }
            
            for(int j = 0; j < matriz2[i].length; j++){
                System.out.print("["+matriz2[i][j]+"]");
            }
            
            if(i==1){
                System.out.print("  =   ");
            }else{
                System.out.print("      ");
            }
            
            for(int j = 0; j < matriz3[i].length; j++){
                System.out.print("["+matriz3[i][j]+"]");
            }
            
            
            System.out.println("");
        }
        
        
    }

}
