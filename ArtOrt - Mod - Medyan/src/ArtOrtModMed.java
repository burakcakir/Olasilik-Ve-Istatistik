
import java.util.Scanner;

public class ArtOrtModMed {

    public static void main(String[] args) {
        
        int cikis;
        
        Scanner scanner = new Scanner(System.in);
        int n;
        int toplam=0;
        double ort;
        double medyan;
        int enFazlaOlan = -1;
        int enFazlaOlanSayi = -1;
        int tekrarlamaSayisi = 0;
        
        System.out.println("Aritmetik Ortlama , Medyan , Mod Hesaplama Ödevine Hoşgeldiniz !");
        System.out.println("************************************");
        System.out.print("Kaç tane veri girmek istiyorsunuz : ");
        n = scanner.nextInt();
        
        Integer [] dizi = new Integer[n];
        
        for(int i=0;i<dizi.length;i++)
        {
            System.out.print((i+1) + "'inci elemanı giriniz : ");
            dizi[i] = scanner.nextInt();
        }
        
        
        //diziyi sıralıyoruz.
        for (int j = 0; j < n; j++) {
            for (int x = n-1; x >0; x--) {
                if(dizi[x] < dizi[x-1]){
                    int temp = dizi[x];
                    dizi[x] = dizi[x-1];
                    dizi[x-1] = temp;
                }
            }
        }
        // sıralı halini ekrana bastırdık.
        for(int i=0;i<n;i++)
        {
            System.out.print(dizi[i] + " ");
        }
        
        System.out.println(" ");
        
        //Aritmetik Ortalama Hesaplama
        for(int i=0;i<n;i++)
        {
            toplam = dizi[i] + toplam;
        }
        
        ort =  (double) toplam / n;
        
        
        //Medyan Hesaplama
        if(n%2 == 0)
        {
            int b = n / 2;
            int c = b - 1;
            medyan = (double)(dizi[b] + dizi[c]) / 2;          
            System.out.println("Girmiş Olduğunuz Dizinin Medyan'ı : " + medyan);
        }
        
        if(n%2 == 1) 
        {
            int a = n / 2;
            medyan = dizi[a];
            System.out.println("Girmiş Olduğunuz Dizinin Medyan'ı : " + medyan);
        }
        
        //Mod Hesaplama        
        for (int i = 0; i < n; ++i) {
            int sayici = 0;
            for (int k = 0; k < n; ++k) {
                if (dizi[k] == dizi[i]) 
                {
                    ++sayici;
                }
            }
            if (sayici > tekrarlamaSayisi) {
                tekrarlamaSayisi = sayici;
                enFazlaOlanSayi = dizi[i];
            }
        }

        System.out.println("Girmiş Olduğunuz Dizinin Mod'u : "  + enFazlaOlanSayi );                              
        
        System.out.println("Aritmetik Ortalama = " + ort);  

        System.out.println("");
        System.out.println("Çıkış için x e bas : ");
        cikis = scanner.nextInt();     
        
    }
    
}
