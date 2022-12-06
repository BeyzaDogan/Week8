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

public class eksiksayı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 Scanner input = new Scanner (System .in);
 System.out.println("bir sayı girin:");
 int a=input.nextInt();
 int ta=0;
 for(int i=1;i<=a;i++){
 if(a%i==0)
 ta+=i;
 }
 if(ta<2*a){
 System.out.println("eksik sayıdır");
 System.out.println(2*a-ta+ " eksiklik miktarı");
 }
 else {
 System.out.println("eksik sayı değil");
 }

    }
    
}
