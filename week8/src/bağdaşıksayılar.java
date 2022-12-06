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

public class bağdaşıksayılar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Scanner input = new Scanner (System .in);
  System.out.println("iki basamaklı birinci sayıyı giriniz:");
  int ab=input.nextInt();
  System.out.println("2.sayıyı giriniz:");
  int cd=input.nextInt();
  int b=ab%10;int a=ab/10;
  int c=cd/10;int d=cd%10;
  if(a==c && b+d==10){
  System.out.println("bağdaşık sayıdır");
  }
  else{
  System.out.println("bağdaşık sayı değil");
  }
    }
    
}
