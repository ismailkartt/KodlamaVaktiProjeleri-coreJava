package Proje15;

import java.util.Scanner;

public class CiftSayilariBulanProgramBonus {
    public static void main(String[] args) {

        //Java ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazın.
        //
        //Bonus Geliştirme
        //Java ile 0'dan girilen sayıya kadar olan sayılardan 4 ve 5'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        int number = input.nextInt();
        int a = 0;
        int counter = 0;

        for (int i=1; i<=number; i++){
            if (i%5==0 && i%4==0){
                counter++;
                a += i;
            }
        }
        System.out.println(a/counter);




    }
}
