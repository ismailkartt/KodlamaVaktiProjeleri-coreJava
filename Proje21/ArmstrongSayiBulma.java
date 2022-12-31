package Proje21;

import java.util.Scanner;

public class ArmstrongSayiBulma {
    public static void main(String[] args) {

        //Armstrong Sayısı
        //N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.
        //
        //Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.
        //
        //1342 sayısına da bakalım. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye eşit olmadığı için armstrong sayı olmaz.
        //
        //1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634
        //
        //54748=5^5+4^5+7^5+4^5+8^5=3125+1024+16807+1024+32768=54748
        //
        //Örnek Çıktı
        //Sayı Giriniz : 407
        //407 bir Armstrong Sayıdır.
        //Sayı Giriniz : 303
        //303 bir Armstrong Sayı Değildir.

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int n = input.nextInt();
        int sumOfCubes = 0;
        int temp = n;
        int digit = 0;
        while(n>0) {
            digit = n%10;
            sumOfCubes = sumOfCubes + digit*digit*digit;
            n = n/10;
        }
        if(temp==sumOfCubes) {
            System.out.println(temp + " Armstrong sayidir");
        }else {
            System.out.println(temp + " Armstrong sayi degildir");
        }





    }
}
