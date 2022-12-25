package Proje03;

import java.util.Scanner;

public class HipotenusHesaplamaBonus {

    public static void main(String[] args) {

        //Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve üçgene ait Hipotenüsü hesaplayan programı yazın.
        //
        //Örnek Çıktı
        //1. Kenarı Giriniz : 3
        //2. Kenarı Giriniz : 4
        //Hipotenüs : 5
        //Bonus Geliştirme
        //Hipotenüs teoremi ile bulduğunuz 3. kenar uzunluğu ile birlikte üçgenin alanını hesaplayan programı yazınız.
        //
        //Formüller ;
        //
        //Üçgenin Çevresi = 2u
        //u = (a+b+c) / 2
        //Alan * Alan = u * (u - a) * (u - b) * (u - c)


        Scanner input = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz : ");
        int a = input.nextInt();

        System.out.print("2. Kenarı Giriniz : ");
        int b = input.nextInt();


        double hipotenus = Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs : " + (int)hipotenus);

       int u = (int) ((a+b+hipotenus) / 2);
       System.out.println("u = " + u);

       int ucgeninCevresi = 2*u;
       System.out.println("Üçgenin Çevresi = " + ucgeninCevresi);

       int ucgeninAlani = (int) (u * (u - a) * (u - b) * (u - hipotenus));
       System.out.println("ucgeninAlani = " + ucgeninAlani);

    }

}
