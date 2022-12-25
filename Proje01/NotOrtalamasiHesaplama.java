package Proje01;

import java.util.Scanner;

public class NotOrtalamasiHesaplama {

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

        long startTime = System.currentTimeMillis();

        double ortalamaniz = (fizik+matematik+muzik+tarih+kimya+turkce)/6.0;
        System.out.print("ortalamanız = " + ortalamaniz);

        if (ortalamaniz>=60){
            System.out.println("Sınıfı Geçti");
        }else {
            System.out.println("Sınıfta Kaldı");
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Zaman farkı = " + (endTime-startTime));
    }
}