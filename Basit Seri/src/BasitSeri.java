
import java.util.Scanner;

public class BasitSeri {
        
    public static void main(String[] args) {        
        
        int cikis;
        
        Scanner scanner = new Scanner(System.in);
        
        int n;        
        
        System.out.println("Basit Seri Ödevine Hoşgeldiniz ! ");
        System.out.println("*********************************");
        System.out.print("Kaç adet veri girmek istiyorsunuz : ");
        n = scanner.nextInt();
        
        Integer [] dizi = new Integer[n];
        
        for(int i=0;i<dizi.length;i++)
        {
            System.out.print((i+1) + "'inci elemanı giriniz : ");
            dizi[i] = scanner.nextInt();
        }
        
       
        for (int j = 0; j < n; j++) {
            for (int x = n-1; x >0; x--) {
                if(dizi[x] < dizi[x-1]){
                    int temp = dizi[x];
                    dizi[x] = dizi[x-1];
                    dizi[x-1] = temp;
                }
            }
        }
        
        for(int i=0;i<n;i++)
        {
            System.out.print(dizi[i] + " ");
        }
        
        System.out.println("");
        System.out.println("Çıkış için x e bas : ");
        cikis = scanner.nextInt();  
        
        
    }
    
}
