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
public class asalsayılisteleme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner input = new Scanner (System .in);
   System.out.println("üst sınırı giriniz:");
   int n=input.nextInt();
   for(int i=2;i<=n;i++){
   int s=0;
   for(int j=1;j<=i;j++)
   if(i%j==0)
   s=s+1;
   if(s==2)
   
   System.out.println(i);}
   
   
   
     
     
    }

    }
    

