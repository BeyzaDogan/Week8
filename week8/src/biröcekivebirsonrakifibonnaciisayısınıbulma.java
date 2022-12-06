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

public class biröcekivebirsonrakifibonnaciisayısınıbulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input=new Scanner(System.in);
    System.out.println("en büyük değeri fibonacci sayısını girin:");
    int a2=input.nextInt();
    double x=(1+Math.pow(5,0.5))/2;
    int a1=(int)Math.round(a2/x);
    int a3=(int)Math.round(a2*x);
    System.out.println(+a1+" ,"+a2+","+a3);
    
    
    
    }
    
}
