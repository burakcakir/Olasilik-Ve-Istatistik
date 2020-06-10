
import java.util.Scanner;

public class DagilimOlcüleri {
    

    public static void main(String[] args) 
    {                       
        
        Scanner scanner = new Scanner(System.in);
        int cikis;
        int n;        
        
        System.out.println("Dağılım Ölçüleri Ödevine Hoşgeldiniz ! ");
        System.out.println("*********************************");
        System.out.print("Kaç adet veri girmek istiyorsunuz : ");
        n = scanner.nextInt();
        
        Double [] dizi = new Double[n];
        
        for(int i=0;i<dizi.length;i++)
        {
            System.out.print((i+1) + "'inci elemanı giriniz : ");
            dizi[i] = scanner.nextDouble();
        }
        System.out.println("*********************************");
       
        for (int j = 0; j < n; j++) {
            for (int x = n-1; x >0; x--) {
                if(dizi[x] < dizi[x-1]){
                    double temp = dizi[x];
                    dizi[x] = dizi[x-1];
                    dizi[x-1] = temp;
                }
            }
        }
        
        //Aritmetik Ortlama Hesaplama 
        double artort = 1;
        double toplam = 0;
        for(int i=0;i<dizi.length;i++)
        {
            toplam = dizi[i] + toplam ;
        }
        artort = toplam / dizi.length;
        
        //Varyans Hesaplama
        double varyans = 0;   
        for(int i = 0 ; i< n ; i ++)
        {
             varyans = varyans + (dizi[i] - artort ) * (dizi[i] - artort ); 
        }
        varyans = varyans / (n-1);
        
        System.out.println("Art ort : " + artort);
        System.out.println("*********************************");
        System.out.println("Varyans : " + varyans);
        System.out.println("*********************************");
        
        //Standart Sapma Hesaplama
        double StandartSapma = Math.sqrt(varyans);        
        System.out.println("Standart Sapma : " + StandartSapma);
        System.out.println("*********************************");
        
        //OMS Hesaplama
        double oms = 0;
        for(int i = 0 ; i< n ; i ++)
        {
             oms = oms +   Math.abs(dizi[i] - artort)  ; 
        }
        oms = oms / n;
        
        System.out.println("Ortalama Mutlak Sapma : " + oms );
        System.out.println("*********************************");
        
        //Değişim Katsayısı Hesaplama
        double dK = 0 ;
        dK = (StandartSapma / artort);
        
        System.out.println("Değişim Katsayısı : " + dK);
        System.out.println("*********************************");
        
        System.out.println("");
        System.out.println("Çıkış için x e bas : ");
        cikis = scanner.nextInt();        
        
        
        
    }


}
