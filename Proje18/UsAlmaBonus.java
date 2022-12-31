package Proje18;

import java.util.Scanner;

public class UsAlmaBonus {
    public static void main(String[] args) {

        //Java ile kullanıcının girdiği değerler ile üs alan programı yazın.

        //Örnek Çıktı
        //Üs Alınacak Sayı : 2
        //Üs Olacak Sayı : 3
        //Cevap : 8
        //Bonus Geliştirme
        //Projede kullandığınız döngü tipinden farklı bir tip ile yapın. (For ile yaptıysanız While ya da While ile yaptıysanız For döngüsü ile yapınız.)

        Scanner input = new Scanner(System.in);

        System.out.print("Üs Alınacak Sayı : ");
        int ustAlinacakSayi = input.nextInt();

        System.out.print("Üs Olacak Sayı : ");
        int ustOlacakSayi = input.nextInt();

        int i = 0;
        int multiply = 1;

        do {
            multiply *= ustAlinacakSayi;
            i++;
        }while (i<ustOlacakSayi);
        System.out.println(multiply);


    }
}
