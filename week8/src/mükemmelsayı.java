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

public class mükemmelsayı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner (System .in);
   System.out.println("bir sayı giriniz:");
   int a=input.nextInt();
   int toplam=0;
   for(int i=1;i<a;i++){
       if(a%i==0){
         toplam+=i;
       }
   }
   if(a==toplam){
   System.out.println("mükemmel sayı");
     }
    else{
   System.out.println("mükemmel sayı değil");
     }
   }

    }
    
    
    

