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

public class kök3hesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner input = new Scanner (System .in);
     System.out.println("bölüm sayısını girin:");
    int a=input.nextInt();
    double t=1;
    for(int i=1;i<a;i++){
     t=t+1/(2+1/t);
    }
    double sonuc=1+1/t;
    System.out.println("kök 3 ün sonucu:"+sonuc);



    }
    
}
