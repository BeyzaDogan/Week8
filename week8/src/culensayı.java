/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Excalibur
 */
import java.util.Scanner;

public class culensayı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner (System .in);
    System.out.println("terim sayısı girin:");
    int n=input.nextInt();
    for(int i=1;i<=n;i++){
    double CULLENSAYİ=i*Math.pow(2, i)+1;
    
    
    System.out.println(+CULLENSAYİ);}

    }
    
}
