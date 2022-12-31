package Proje18;

import java.util.Scanner;

public class UsAlma {
    public static void main(String[] args) {

        //Java ile kullanıcının girdiği değerler ile üs alan programı yazın.

        //Örnek Çıktı
        //Üs Alınacak Sayı : 2
        //Üs Olacak Sayı : 3
        //Cevap : 8

        Scanner input = new Scanner(System.in);

        System.out.print("Üs Alınacak Sayı : ");
        int ustAlinacakSayi = input.nextInt();

        System.out.print("Üs Olacak Sayı : ");
        int ustOlacakSayi = input.nextInt();

        int multiply = 1;

        for (int i=0; i<ustOlacakSayi; i++){
            multiply *= ustAlinacakSayi;
        }
        System.out.println(multiply);

    }
}
