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

public class tausayısı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner (System .in);
    System.out.println("üst sınırı girin:");
    int n=input.nextInt();
    for(int i=1;i<=n;i++){
     int t=0;
    for(int j=1;j<=i;j++){
    if(i%j==0){
     t++;} }
    if(i%t==0){
     System.out.println(i);
    }}
     } }

  
    
    
     
    

    
    
    

