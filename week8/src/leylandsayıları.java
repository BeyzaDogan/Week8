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

public class leylandsayıları {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner (System .in);
    System.out.println("bir x girin:");
    double x=input.nextDouble();
    System.out.println("bir y girin:");
    double y=input.nextDouble();
    double toplam=0;
    while(x>1&& y>1){
    for(int i=2;i<=x;i++){
       for(int j=2;j<=y;j++){
       toplam=Math.pow(i,j)+Math.pow(j,i);}
      System.out.println("leyland sayıları:"+toplam);


    }
   break;
    }
      
           

    }
    
}
