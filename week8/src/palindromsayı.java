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
public class palindromsayı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner (System .in);
    for(int i=1;i<=9;i++){
    for(int j=0;j<=9;j++){
    System.out.println(100*i+10*j+i);//3 basamaklılar için
    }
    }
    for(int i=1;i<=9;i++){
    for(int j=0;j<=9;j++){
    System.out.println(1000*i+100*j+10*j+i);
    }
    }
    }
    
}
