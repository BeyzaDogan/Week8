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

public class altınoranlauzunlukbulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner input = new Scanner (System .in);
     System.out.println("AB doğru parçasının uzunluğunu giriniz:");
     double AB=input.nextDouble();
     double CB=2*AB/(1+Math.pow(5,0.5));
     double AC=AB-CB;
     System.out.println("bulunan diğer uzunluklar:"+CB+" VE "+AC);
     

    }
    
}
