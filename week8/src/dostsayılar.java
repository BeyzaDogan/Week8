/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Excalibur
 */
import java.util.Scanner ;

public class dostsayılar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner input = new Scanner (System .in);
   System.out.println("bir x sayısı girin:");
   int x=input.nextInt();
   System.out.println("bir y sayısı girin:");
   int y=input.nextInt();
   int tx=0;int ty=0;
   for(int i=1;i<x;i++){
   if(x%i==0){
   tx+=i;   
   }}
   for(int j=1;j<y;j++){
   if(y%j==0){
   ty+=j;
   }}
   if(tx==y && ty==x){
   System.out.println("dost sayıdır");
   }
   else{
   System.out.println("dost sayı değildir");
   }
   }
   
   }

    
    

