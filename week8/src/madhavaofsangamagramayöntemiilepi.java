
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Excalibur
 */
public class madhavaofsangamagramayöntemiilepi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner (System .in);
     System.out.println("istediğiniz terim sayısını girin:");
     int n=input.nextInt();
     double t=0;
     for(int i=0;i<n;i++){
     t+=Math.pow((-1),i)/Math.pow(2*i+1,i); }
     double sonuc =Math.pow(12,1/2)*t;
    
    System.out.println("hesaplanan pi değeri"+sonuc);
    }
}

    
    

