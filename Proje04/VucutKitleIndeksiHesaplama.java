package Proje04;

import java.util.Scanner;

public class VucutKitleIndeksiHesaplama {

    public static void main(String[] args) {

        //Merhaba değerli Kodlama Vakti takipçileri, bu dersimizde Java'da Vücut Kitle İndeksi Hesaplayan Program yapacağız.
        //
        //Formül : Kilo (kg) / Boy(m) * Boy(m)
        //
        //Proje Konusu
        //Java ile kullanıcıdan boy ve kilo değerlerini alarak aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
        //
        //Örnek Çıktı
        //Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
        //Lütfen kilonuzu giriniz : 105
        //Vücut Kitle İndeksiniz : 35.49215792320173


        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        double boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        double kilo = input.nextDouble();

        double vicutKitleIndex = (kilo/(boy*boy));
        System.out.println("vicutKitleIndex = " + vicutKitleIndex);


    }

}
