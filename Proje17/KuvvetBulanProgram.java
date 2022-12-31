package Proje17;

import java.util.Scanner;

public class KuvvetBulanProgram {

    public static void main(String[] args) {


        //Java ile girilen sayıya kadar olan, n değerininde kullacıdan alındığı n sayısının kuvvetlerini ekrana yazdıran programı yazıyoruz.
        //
        //Örnek Çıktı
        //N Değerini Giriniz : 2
        //Sınır Değerini Giriniz : 20
        //1
        //2
        //4
        //8
        //16

        Scanner input = new Scanner(System.in);

        System.out.print("N Değerini Giriniz : ");
        int nDegeri = input.nextInt();

        System.out.print("Sınır Değerini Giriniz : ");
        int sinirDegeri = input.nextInt();

        int multiply = 1;

        for (int i=1; i<sinirDegeri; i++){
            if ((Math.pow(nDegeri,i)<sinirDegeri)){
                System.out.println((Math.pow(nDegeri,i)));
            }
        }


    }
}
