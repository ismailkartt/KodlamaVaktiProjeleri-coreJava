package Proje02;

import java.util.Scanner;

public class KdvTutariHesaplama {

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


        Scanner input = new Scanner(System.in);
        System.out.print("Tutar giriniz : ");
        double price, total, kdvPrice, rate = 18;
        price = input.nextDouble();

        System.out.println("Kdv Oranı = %" + rate);

        kdvPrice = (rate/100)*price;

        System.out.println("KDV Tutarı = " + kdvPrice);

        total = rate+price;

        System.out.println("KdvliHesabi = " + total);
    }

}
