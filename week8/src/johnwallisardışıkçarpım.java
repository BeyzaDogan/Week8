

import java.util.Scanner;

public class johnwallisardışıkçarpım {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner (System .in);
    System.out.println("istediğiniz terim sayısını girin:");
    int n=input.nextInt();
    double c=1;
    for(int i=1;i<=n;i++){
     double m=4*c*c;
    c*=m/(m-1);
    }
    double sonuc=2*c;
    System.out.println("John Wallis yöntemiyle hesaplanan pi değeri:"+sonuc);
    }
    
}
