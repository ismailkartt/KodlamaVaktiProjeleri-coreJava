package Proje19;

import java.util.Scanner;

public class FaktoriyelHesaplama {

    public static void main(String[] args) {

        //Java ile kullanıcını girdiği değerinin faktöriyelini hesaplayan programı yazın.
        //
        //Örnek Çıktı
        //Faktöriyel Sayısı : 3
        //Sonuç : 6

        Scanner input = new Scanner(System.in);
        System.out.print("Faktöriyel Sayısı : ");
        int faktoriyel = input.nextInt();

        int multiply = 1;

        for (int i=1; i<=faktoriyel; i++){
            multiply *= i;
        }
        System.out.println("Sonuç : " + multiply);

    }

}
