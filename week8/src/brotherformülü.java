
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
public class brotherformülü {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Scanner input = new Scanner (System .in);
  System.out.println("bir n girin:");
  int n=input.nextInt();
  double toplam=0;
  for(int i=0;i<=n;i++){
  int f=1;
  int temp=2*i+1;
      for(int j=1;j<=temp;j++){
      f*=j;
      }
      toplam+=(double)(temp+1)/f;
        
    }
System.out.println("sonuç:"+toplam);

    }
    
}

    
    
