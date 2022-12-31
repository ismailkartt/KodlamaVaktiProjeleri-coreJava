package Proje16;

import java.util.Scanner;

public class TekSayilarinToplaminiBulan {
    public static void main(String[] args) {

        //Java ile kullanıcı negatif bir değer girene kadar kullanıcıdan sayı girişini kabul eden ve girilen sayılardan tek sayıları toplayıp ekrana basan programı yazın.
        //
        //Örnek Çıktı
        //Sayı Giriniz : 2
        //Sayı Giriniz : 3
        //Sayı Giriniz : 7
        //Sayı Giriniz : -15
        //Toplam : 10

        Scanner input = new Scanner(System.in);

        int number = 0;
        int sum = 0;
        int i = 0;

            do {
                System.out.print("Sayı giriniz : ");
                number = input.nextInt();
                if (number<0){
                    break;
                }else if (number%2!=0){
                    sum += number;

                }
                i++;
            }while (i>0);

        System.out.println(sum);





    }
}
