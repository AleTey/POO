/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pooej10;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Random;
import java.util.Arrays;

public class PooEj10 {


    public static void main(String[] args) {

        Random rand = new Random();
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        DecimalFormat df = new DecimalFormat("#.00", symbols);
        
        double[] A = new double[50];
        double[] B = new double[20];
        
        for (int i = 0; i < 50; i++) {
            A[i] = (Math.round(rand.nextDouble() * 1000.0 + 100) / 100.0);
            //A[i] = Double.parseDouble(df.format(randomN));
            System.out.print(A[i] + " ");
        }
        System.out.println("");
        Arrays.sort(A);
        System.arraycopy(A, 0, B, 0, 10);
        
        Arrays.fill(B, 10, 20, 0.5);
        
        for (int i = 0, j = 0; i < 50; i++) {
            System.out.print(A[i] + " ");
            
            
        }
        System.out.println("");
        for (int i = 0; i < 20; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println("");
        System.out.println("A " + Arrays.toString(A));
        System.out.println("B " + Arrays.toString(B));
        
    }
    
    

   

}
