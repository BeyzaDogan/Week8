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

public class basamaklarıtoplamıfibonacciolansayılar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input=new Scanner(System.in);
    for(int i=0;i<=9;i++){//0-99 arası isteniyor
    for(int j=0;j<=9;j++){
    int a=i+j;
    if(a==1 || a==2 ||a==3||a==5||a==8||a==13){
    System.out.println(10*i+j);
    }
    }
    }

    }
    
}
