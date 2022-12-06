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

public class eüzerixhesaplayanprogram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner input = new Scanner (System .in);
     System.out.println("istediğiniz terim sayısını girin:");
     int n=input.nextInt();
     System.out.println("bir x değeri girin:");
     double x=input.nextDouble();
     double T=1,F=1;
     for(int j=1;j<n;j++){
      F*=j;
     T+=Math.pow(x,j)/F;}
     System.out.println("hesap sonucu:"+T);


    }
    
}
