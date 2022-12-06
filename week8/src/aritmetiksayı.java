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
//of java.lang.Math.round() method
import java.lang.Math;
public class aritmetiksayı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner input = new Scanner (System .in);
   System.out.println("pozitif bir tamsayı girin:");
   int a=input.nextInt();int b=0;int c=0;
   for(int j=1;j<=a;j++){
   if(a%j==0){
   b++;
   c+=j;}}
   if((double)c/b==Math.round(c/b)){
   System.out.println("aritmetik sayı");
   }
   else{
   System.out.println("aritmetik sayı değil");
   }
   
   
   }
        

    }
    

