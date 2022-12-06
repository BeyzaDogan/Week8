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

public class hilbertsayıları {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner (System .in);
    System.out.println("bir pozitif tamsayı girin:");
    int a=input.nextInt();
    while(a>0){
    if((a-1)%4==0){
    System.out.println("hilbert sayısıdır");
    }
    
    else{
    System.out.println("hilbert sayısı değil");
    }
    break;
    }

    }
    
}
