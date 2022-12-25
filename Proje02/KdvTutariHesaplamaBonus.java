package Proje02;

import java.util.Scanner;

public class KdvTutariHesaplamaBonus {

    public static void main(String[] args) {

        //Java dili ile kullanıcıdan alınan tutarın KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
        //
        //(Not : KDV tutarını 18% olarak alın)
        //
        //Örnek Çıktı
        //Tutar Giriniz : 100
        //KDV Oranı : %18
        //KDV Tutarı : 18.00
        //KDV'li Tutar : 118.0
        //Bonus Geliştirme
        //Eğer girilen tutar 0 ve 500TL arasında ise KDV oranı %18 , tutar 500TL'den büyük ise KDV oranını %8 olarak KDV hesaplayan programı yazınız.




        Scanner input = new Scanner(System.in);
        System.out.print("Tutar giriniz : ");

        double tutar = input.nextDouble();

        if (tutar>=0 && tutar<=500){
            System.out.println("Kdv Oranı = %18");
            double kdvHesabi = (tutar*18.0)/100;
            System.out.println("KDV Tutarı = " + kdvHesabi);
            double kdvliHesabi = kdvHesabi+tutar;
            System.out.println("kdvliHesabi = " + kdvliHesabi);
        }else if (tutar>500){
            System.out.println("Kdv Oranı = %8");
            double kdvHesabi = (tutar*8.0)/100;
            System.out.println("KDV Tutarı = " + kdvHesabi);
            double kdvliHesabi = kdvHesabi+tutar;
            System.out.println("KdvliHesabi = " + kdvliHesabi);
        }




    }

}
