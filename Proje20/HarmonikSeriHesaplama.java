package Proje20;

import java.util.Scanner;

public class HarmonikSeriHesaplama {
    public static void main(String[] args) {


        //Java ile girilen sayının harmonik serisini bulan programı yazınız.
        //
        //Örnek Çıktı
        //N Sayını Giriniz : 2
        //Sonuç : 1.5

        Scanner input = new Scanner(System.in);

        System.out.print("N Sayını Giriniz : ");
        double harmonikSayi = input.nextInt();

        double sum = 0;

        for (int i=1; i<=harmonikSayi; i++){
            sum += Math.pow(i,-1);
        }
        System.out.println(sum);

    }
}
