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

public class euleriansayısı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner input = new Scanner (System .in);
   System.out.println("bir m değeri girin:");
   int m=input.nextInt();
   System.out.println("bir n değeri girin:");
   int n=input.nextInt();
   double t=Math.pow(n+1,m);
   for(int i=1;i<=n;i++){
   int f1=1;int f2=1;int f3=1;
   for(int j=1;j<=m+1;j++){
   f1*=j;
   }
   for(int k=1;k<=i;k++){
   f2*=k;
   }
   for(int g=1;g<=m+1-i;g++){
   f3*=g;
   }
   double kom=f1/(f2*f3);
   t+=Math.pow(-1,i)*kom*Math.pow(n+1-i,m);
   }
   System.out.println(t);
   

    }
    
}
