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
     
   
    

public class sinüshesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner input = new Scanner (System .in);
     System.out.println("bir açı giriniz:");
     double x=input.nextDouble();
     System.out.println("istediğiniz terim sayısını girin:");
     int n=input.nextInt();
     double t=0;
     x=Math.toRadians(x);
     int is=1;
     for(int i=1;i<=n;i++){
      int f=1;
     for(int j=1;j<=2*i-1;j++)
      f=f*j;
     is*=(-1);
     t+=is*Math.pow(x,2*i-1)/f;
     } 
     
     System.out.println("hesaplanan değer:"+Math.sin(x));
     System.out.println("programın hesaplandığı değer:"+t);
      

    }

     }
    
    

