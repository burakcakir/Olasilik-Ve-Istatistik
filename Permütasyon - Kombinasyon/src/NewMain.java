
import java.math.BigInteger;
import java.util.Scanner;


public class NewMain {
    
    // Returns Factorial of N 
    static BigInteger factorial(int N) 
    { 
        BigInteger f = new BigInteger("1"); // Or BigInteger.ONE 
  
        // Multiply f with 2, 3, ...N 
        for (int i = 2; i <= N; i++) 
            f = f.multiply(BigInteger.valueOf(i)); 
  
        return f; 
    } 
    
    public static void main(String[] args) {
        
        int cikis;
        
        int n;
        int r;
        BigInteger nFak ;
        BigInteger nrFak;
        BigInteger rFak;
        BigInteger permütasyon;
        BigInteger kombinasyon;
        BigInteger rcarpınr;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Permütasyon / Kombinasyon Hesaplama ");
        System.out.print("n değerini giriniz : ");
        n = scanner.nextInt();
        System.out.print("r değerini giriniz : ");
        r = scanner.nextInt();
                        
        nFak = factorial(n);
        nrFak = factorial((n-r));
        rFak = factorial(r);

        permütasyon = nFak.divide(nrFak);
        
        rcarpınr = rFak.multiply(nrFak);
        kombinasyon = nFak.divide(rcarpınr);
        
        System.out.println("Kombinasyon Sonucu : " + kombinasyon);
        System.out.println("Permütasyon Sonucu : " + permütasyon);
        
        System.out.println("");
        System.out.println("Çıkış için x e bas : ");
        cikis = scanner.nextInt();   
        
    }

}
