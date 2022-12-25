package Proje07;

import java.util.Scanner;

public class Taksimetre {

    public static void main(String[] args) {

        //Java ile gidilen kilometre verisine göre taksimetre tutarını hesaplayıp ekrana yazdıran programı yazın.
        //
        //Taksimetre kilometre başına 2.20 TL tutmaktadır.
        //Kısa mesafe tutarı 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        //Taksimetre açılış ücreti 10 TL'dir.

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç km gideceğinizi yazınız = ");
        double km = input.nextDouble();
        double price = (km*2.20) + 10;

        //1.yol
//        if (price<20){
//            price=20;
//        }
//        System.out.println("Taksimetre ücreti = " + price);

        //2.yol
        price = (price<20) ? 20 : (price);

        System.out.println("Taksimetre ücreti = " + price);

    }

}
