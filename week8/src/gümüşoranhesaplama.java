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

public class gümüşoranhesaplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner input = new Scanner (System .in);
             
     System.out.println("doğru parçasının uzunluğunu giriniz:");
     int z=input.nextInt();
     double y=z/(2+Math.pow(2,0.5));
     double x=z-y;
     System.out.println("gümüş oran sonucu hesaplanan sonuç:"+y+" ve "+x);

    }
    
}
