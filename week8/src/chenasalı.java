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

public class chenasalı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Scanner input = new Scanner (System .in);
   System.out.println("bir sayı giriniz:");
   int n=input.nextInt();
   boolean asalmi=true;
  for(int i=2;i<n;i++){
    if (n%i==0)
   asalmi=false;
  }
  if (n!=0 && asalmi==true){ 
  int asal=n;
   if(n+2 ==asal ){
   
   System.out.println("chen asalıdır");
      }
  }
  else{
  System.out.println("chen asalı değildir");
  }
  }
  }


    
  
  


