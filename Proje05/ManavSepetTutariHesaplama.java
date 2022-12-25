package Proje05;

import java.util.Scanner;

public class ManavSepetTutariHesaplama {

    public static void main(String[] args) {

        //Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
        //
        //Ürün Kg Fiyatları
        //
        //Salatalık : 3,14 TL
        //Elma : 4,11 TL
        //Kabak : 2,22 TL
        //Domates: 0,95 TL
        //Patlıcan : 7,00 TL
        //
        //Örnek Çıktı
        //Salatalık Kaç Kilo ? :0
        //Elma Kaç Kilo ? :0
        //Kabak Kaç Kilo ? :0
        //Domates Kaç Kilo ? :1
        //Patlıcan Kaç Kilo ? :1
        //Toplam Tutar : 7,95 TL

        Scanner input = new Scanner(System.in);

        double salatalik = 3.14;
        double elma = 4.11;
        double kabak = 2.22;
        double domates = 0.95;
        double patlican = 7.00;

        System.out.print("Kaç kilo salatalık : ");
        double salatalikKg = input.nextDouble();

        System.out.print("Kaç kilo elma : ");
        double elmaKg = input.nextDouble();

        System.out.print("Kaç kilo kabak : ");
        double kabakKg = input.nextDouble();

        System.out.print("Kaç kilo domates : ");
        double domatesKg = input.nextDouble();

        System.out.print("Kaç kilo patlican : ");
        double patlicanKg = input.nextDouble();

        double toplamTutar = (salatalik*salatalikKg)+(elma*elmaKg)+(kabak*kabakKg)+(domates*domatesKg)+(patlican*patlicanKg);
        System.out.print("toplamTutar = " + toplamTutar);

    }

}
