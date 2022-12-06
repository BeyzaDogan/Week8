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

public class ikizasallar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner input = new Scanner (System .in);
   System.out.println("üst sınırı giriniz:");
   int a=input.nextInt();
   int k,s=0;
   int[] asal=new int[a];
   for(int i=3;i<a;i++){
   k=0;
     for(int j=2;j<i;j++){
   if(i%j==0)
   k++;}
   if(k==0)
   s++;
   asal[s]=i;
   }
   for(int i=1;i<s;i++){
   if(asal[i+1]-asal[i]==2)
   System.out.println("ikiz asallar :"+asal[i]+","+asal[i+1]);
   }
}
           }
