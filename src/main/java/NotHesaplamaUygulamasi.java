package main.java;
/*Bir not hesaplama uygulaması geliştirdiğimizi düşünelim. Kullanıcıdan kaç adet
  sınav notu girmek istediği bilgisini alalım (araştırma konusu javada kullanıcı inputu alma)
  Kullanıcının girdiği sayı kadar kullanıcıdan sınav notu alalım.
  Ve bütün sınav notu toplamlarını sınav sayısına bölerek ortalamayı bulalım.
  Ortalamayı kullanıcıya gösterelim ve
  eğer not 80'in üzerindeyse konsola "Yüksek Puan" yazdıralım.
  Hande Arslan*/
import java.util.Scanner;

public class NotHesaplamaUygulamasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç adet sınav notu girmek istersiniz? ");
        int sinavSayisi = scanner.nextInt();

        int toplam = 0 ;

        for (int i = 1; i <= sinavSayisi; i++) {
            System.out.print(i + ". sınav notunu girin: ");
            Integer sınavNotu = scanner.nextInt();
            toplam = toplam + sınavNotu ;
        }

        double ortalama = toplam / sinavSayisi;
        System.out.println("Sınav Ortalaması: " + ortalama);

        if (ortalama > 80) {
            System.out.println("Yüksek Puan");
        }
        else{
            System.out.println("Düşük Puan");
        }
    }
}
