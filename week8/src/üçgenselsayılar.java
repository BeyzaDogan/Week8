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

public class üçgenselsayılar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner input = new Scanner (System .in);
   System.out.println("terim sayısını girin:");
   int n=input.nextInt();
   for(int i=1;i<=n;i++){
   int ucgensel_sayi=i*(i+1)/2;
   System.out.println(ucgensel_sayi);
   }

    }
    
}
