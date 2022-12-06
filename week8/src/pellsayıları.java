
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Excalibur
 */
public class pellsayıları {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner input=new Scanner(System.in);
     System.out.println("terim sayısını girin:");
     int n=input.nextInt();
     for(int k=0;k<n;k++){
    double sonuc=(Math.pow((1+Math.pow(2,0.5)),k)- Math.pow((1-Math.pow(2,0.5)),k))/(2*Math.pow(2,0.5));
    double sonuc2=Math.round(sonuc);
     System.out.println(sonuc2);
    }
    
}
}
