
import java.util.Random;
import java.util.Scanner;


public class SistematikRastgele {

    public static void main(String[] args) {

        int cikis ;
        
        int N,n,a,k;
        Scanner scanner = new Scanner(System.in);        
        
        System.out.print("N(Örneklem) değerini giriniz : ");
        N = scanner.nextInt();
        System.out.print("n(Kitle) değerini giriniz : ");
        n = scanner.nextInt();
        
        k = (N / n);
        
        Random random = new Random();
        a = random.nextInt(k);
        
        while (a == 0 ) {            
            a = random.nextInt(k);
        }        
        
        System.out.println("k sayısı : " + k);
        System.out.println("a sayısı : " + a);
        
        System.out.print(a + " ");
        for (int i = 1; i <  n; i++) 
        {
            System.out.print((a+(i*k)) + " ");
            
        }
        
        System.out.println("");
        System.out.println("Çıkış için x e bas : ");
        cikis = scanner.nextInt();   
        
    }
    
}
