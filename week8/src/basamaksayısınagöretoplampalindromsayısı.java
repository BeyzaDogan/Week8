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

public class basamaksayısınagöretoplampalindromsayısı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner (System .in);
    System.out.println("basamak sayısı girin:");
    int n=input.nextInt();
    System.out.println("girilen basamak sayısına göre toplam palindrom sayısı:"+9*Math.pow(10,(n-1)/2));
   

    }
    
}
