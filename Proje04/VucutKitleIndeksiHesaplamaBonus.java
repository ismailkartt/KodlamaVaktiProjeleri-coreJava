package Proje04;

import java.util.Scanner;

public class VucutKitleIndeksiHesaplamaBonus {

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
        //Bonus Geliştirme
        //Eğer Vücut Kitle İndeksi .
        //
        //18.5'ten küçükse ekrana "Zayıf"
        //18.5 ile 24.9 arasında ise ekrana "İdeal"
        //25 ile 29.9 arasında ise ekrana "Şişman"
        //30 ile 34.9 arasında ise ekrana "Obez"
        //35'ten büyükse ise ekrana "Aşırı Obez" yazsın.



        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        double boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        double kilo = input.nextDouble();

        double vicutKitleIndex = (kilo/(boy*boy));
        System.out.println("vicutKitleIndex = " + vicutKitleIndex);

        if (18.5>vicutKitleIndex){
            System.out.println("Zayıf");
        }else if (vicutKitleIndex>18.5 && vicutKitleIndex<24.9){
            System.out.println("İdeal");
        }else if (vicutKitleIndex>25 && vicutKitleIndex<29.9){
            System.out.println("Şişman");
        }else if (vicutKitleIndex>30 && vicutKitleIndex<34.9){
            System.out.println("Obez");
        }else if (vicutKitleIndex>35){
            System.out.println("Aşırı Obez");
        }


    }

}
