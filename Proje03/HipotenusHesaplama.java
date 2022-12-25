package Proje03;

import java.util.Scanner;

public class HipotenusHesaplama {

    public static void main(String[] args) {

        //Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve üçgene ait Hipotenüsü hesaplayan programı yazın.
        //
        //Örnek Çıktı
        //1. Kenarı Giriniz : 3
        //2. Kenarı Giriniz : 4
        //Hipotenüs : 5


        Scanner input = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz : ");
        int a = input.nextInt();

        System.out.print("2. Kenarı Giriniz : ");
        int b = input.nextInt();


        double hipotenus = Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs : " + (int)hipotenus);




    }

}
