
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

public class tribonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input=new Scanner(System.in);
    System.out.println("terim sayısını girin:");
    int n=input.nextInt();
    int x1=1;int x2=1;int x3=2;
    System.out.println(x1);
    System.out.println(x2);
    System.out.println(x3);
    for(int i=1;i<=n-3;i++){
    int x4=x1+x2+x3;
    System.out.println(x4);
    x1=x2;
    x2=x3;
    x3=x4;
    }
    

    }
    
}
