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

public class Lnhesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner input = new Scanner (System .in);
     System.out.println("istediğiniz terim sayısını girin:");
     int n=input.nextInt();
     double T=0;
     for(double i=0;i<=n-1;i++){
     T+=1/((2*i+1)*(2*i+2));
     }
     System.out.println("Ln(2) değerinin sonucu:"+T);



    }
    
}
