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
public class oresayısı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Scanner input = new Scanner (System .in);
  System.out.println("bir pozitif tamsayıyı girin:");
  int a=input.nextInt();
  int s=0;
  int t=0;
  for(int i=1;i<=a;i++){
  if(a%i==0){
  s++;
  t+=(1/i);}}
 if((double)s/t==Math.round(s/t)){
  System.out.println("ore sayısıdır");
 }
  else{
  System.out.println("ore sayısı değil");
  }
   
  }

    }
    

