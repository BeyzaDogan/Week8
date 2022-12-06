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

public class altınüçgen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner input = new Scanner (System .in);
      System.out.println("üçgenin kısa kenarı giriniz:");
      int a=input.nextInt();
      double b=a*(1+ Math.pow(5,0.5))/2;
      System.out.println("üçgenin tüm kenarları:"+a+ " ve "+b+" ve "+b);

    }
    
}
