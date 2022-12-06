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
import java.util.Random;


public class montecarloyöntemi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner input = new Scanner (System .in);
    System.out.println("bir pozitif tamsayı giriniz:");
    int n=input.nextInt();
    double m=0; double max=100;
    double sonuc=input.nextDouble();
    for(int i=1;i<=n;i++){
    
   
   double x=(double)2*(Math.random()/(max/(max-1)));
   double y=(double) 2*(Math.random()/(max/(max-1)));
   if(x*x+y*y<1)
    m=m+1;
   sonuc=4*m/n;}
    System.out.println("hesapanan pi değeri:"+sonuc);
   }
    }
    

    
    

