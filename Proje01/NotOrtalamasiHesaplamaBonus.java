package Proje01;

import java.util.Scanner;

public class NotOrtalamasiHesaplamaBonus {

    public static void main(String[] args) {

        //Java ile Fizik, Matematik, Türkçe, Kimya, Müzik, Tarih derslerinin sınav puanlarını kullanıcıdan alan ve bu derslerin ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
        //
        //Örnek Çıktı
        //Fizik Notunuz : 70
        //Matematik Notunuz : 40
        //Türkçe Notunuz : 30
        //Kimya Notunuz : 100
        //Müzik Notunuz : 60
        //Tarih Notunuz : 80
        //Ortalamanız : 63.0
        //Bu programa geliştirme olarak If ve Else kullanmadan, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.


        Scanner input = new Scanner(System.in);
        int fizik,matematik,muzik,tarih,kimya,turkce;
        System.out.print("Fizik notunuzu girin : ");
        fizik = input.nextInt();

        System.out.print("Matematik notunuzu girin : ");
        matematik = input.nextInt();

        System.out.print("Muzik notunuzu girin : ");
        muzik = input.nextInt();

        System.out.print("Tarih notunuzu giriniz : ");
        tarih = input.nextInt();

        System.out.print("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = input.nextInt();

        double ortalamaniz = (fizik+matematik+muzik+tarih+kimya+turkce)/6.0;
        System.out.print("ortalamanız = " + ortalamaniz);
        System.out.println();
        String gecmeDurumu =  (ortalamaniz>=60) ? ("Sinifi Geçti") : ("Sinifta Kaldi");

        System.out.println("geçmeDurumu : " + gecmeDurumu);
    }
}