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

public class mükemmelsayılisteleme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Scanner input = new Scanner (System .in);
  System.out.println("üst sınırı giriniz:");
  int a=input.nextInt();
  for(int i=1;i<a;i++){
  double x=Math.pow(2,i);
  double y=(Math.pow(2,i+1))-1;
  if(y%i!=0 && i!=1 && i!=y)
  System.out.println("mükemmel sayılar:" +x*y);}}
  } 
    


