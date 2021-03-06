
package MultipMatriz;

import java.util.Scanner;

/**
 *
 * @author Juan Machuca
 */
public class MatrizMultip {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int [][] matriz1, matriz2, matriz3;
        int producto, sumaProd= 0;
        
        matriz1 = new int[2][3];
        matriz2 = new int[3][2];
        matriz3 = new int[2][2];
        
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = (int)(Math.random()*5); 
                //System.out.print("numero ["+i+"]["+j+"]: ");
                //matriz1[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = (int)(Math.random()*5);
                //System.out.print("numero ["+i+"]["+j+"]: ");
                //matriz2[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3.length; j++) {
                sumaProd = 0;
                for (int k = 0; k < 3; k++) {
                    producto = matriz1[j][k]*matriz2[k][i];
                    sumaProd += producto;// matriz[j][i]
                }
                matriz3[j][i] = sumaProd;
            }
        }
        
        for (int i = 0; i < 3; i++) {
            
            if(i < 2){
                for (int j = 0; j < 3; j++) {
                    System.out.print("["+matriz1[i][j]+"]");
                }
                
                if(i == 1){
                    System.out.print("     X     ");
                }
                else{
                    System.out.print("           ");
                }
            }
            else{
                System.out.print("                    "); //25 espacios
            }
            
            for (int j = 0; j < 2; j++) {
                System.out.print("["+matriz2[i][j]+"]");
            }
            
            if(i == 1){
                System.out.print("     =      ");
            }
            else{
                System.out.print("            ");
            }
            
            if(i < 2){
                for (int j = 0; j < 2; j++) {
                    System.out.print("["+matriz3[i][j]+"]");
                }
            }
            
            System.out.println("");
        }
    }
}
