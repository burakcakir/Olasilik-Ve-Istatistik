
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class FrekanksSerisi {


    public static void main(String[] args) {
        
        int cikis;
        
        int n = 0,i=0,sayac2=0,sayac,sayi;
        ArrayList <Integer> yeni = new ArrayList();
        ArrayList <Integer> dizi = new ArrayList();
        ArrayList <Integer> frekans = new ArrayList();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("**********Frekans Tablosu***********");
        System.out.print("Kaç tane veri girmek istiyorsunuz ? :");
        n = scanner.nextInt();
        
        for(i=0 ; i<n ; i++)
        {
            System.out.print((i+1) + "'inci elemanı giriniz :");
            sayi = scanner.nextInt();
            dizi.add(i,sayi);
        }        
        
        Collections.sort(dizi);
        
        System.out.print("Dizi => ");
        for (int j = 0; j < dizi.size(); j++) {
            System.out.print(dizi.get(j)+ " ");
        }
        
        yeni.add(0,dizi.get(0));
        
        // tekrar edenleri silme
        for (int j = 1; j < dizi.size(); j++) {
            sayac=0;
            for (int k = 0; k < yeni.size(); k++) {
                if(yeni.get(k) == dizi.get(j)){
                    break;
                }
                else{
                    sayac++;
                    if (sayac==yeni.size()) {
                        yeni.add(yeni.size(),dizi.get(j));
                    }
                }   
            }     
        }
        //dizideki her elemanın tekrar sayısını bulma
        for (int j = 0; j < dizi.size(); j++) {
            for (int k = 0; k < dizi.size(); k++) {
                if (dizi.get(j) == dizi.get(k)) {
                    for (int l = 0; l < j; l++) {
                        if (dizi.get(l)==dizi.get(j)) {
                            sayac2=-1;
                        }
                    }
                    sayac2++;
                }
            }
            if (sayac2 != 0)
                frekans.add(sayac2);
            sayac2=0;
        }

  
        System.out.println("\n\n"+"xi      fi");
       
        for (int j = 0; j < yeni.size(); j++) {
            
            System.out.println(yeni.get(j)+"       "+ frekans.get(j));
            
        }
        
        System.out.println("");
        System.out.println("Çıkış için x e bas : ");
        cikis = scanner.nextInt();   
        
    }
    
}
