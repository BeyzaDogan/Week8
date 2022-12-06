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

public class FERMATSAYILARI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 Scanner input = new Scanner (System .in);
  System.out.println("üst sınırı giriniz:");
  int a=input.nextInt();
 
  for(int i=0;i<a;i++){
   double fermatsayi=Math.pow(2,Math.pow(2, i))+1;
  
  System.out.println(+fermatsayi);}}}
    
    
    

