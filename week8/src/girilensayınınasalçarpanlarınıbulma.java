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

public class girilensayınınasalçarpanlarınıbulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner input = new Scanner (System .in);
   System.out.println("bir sayı giriniz:");
   int n=input.nextInt();
   int b=2;
   while(n>1){
   if(n%b==0){
   System.out.println(b);
   n/=b;}
   else{
   b++;
      }
  
   }
   
   }
    }

           
 
    

