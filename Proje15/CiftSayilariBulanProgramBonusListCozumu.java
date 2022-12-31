package Proje15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CiftSayilariBulanProgramBonusListCozumu {
    public static void main(String[] args) {

        //Java ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazın.
        //
        //Bonus Geliştirme
        //Java ile 0'dan girilen sayıya kadar olan sayılardan 4 ve 5'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.


            /*ArrayList<Double> numbers = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Kaç tane sayının ortalamasını hesaplamak istiyorsunuz: ");
            int limit = scanner.nextInt();
            for (int i = 0; i < limit; i++){
                System.out.printf("%d. sayıyı girin-> ", i + 1);
                numbers.add(scanner.nextDouble());
            }
            System.out.println("Sirasiyla girdiginiz sayilar: " + Arrays.toString(numbers.toArray()));
            double mean = 0;
            for(double num : numbers)
            {
                mean += num;
            }
            System.out.println("Girdiginiz sayilarin ortalamasi: " + mean/numbers.size());*/

            ArrayList<Double> numbers = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Kaç tane sayının ortalamasını hesaplamak istiyorsunuz: ");
            int limit = scanner.nextInt();
            for (int i=1; i<=limit; i++){
                System.out.printf("%d. sayıyı giri = " , i);
                numbers.add(scanner.nextDouble());
            }
            System.out.println("Sırasıyla girdiginiz sayılar : " + Arrays.toString(numbers.toArray()));
            double mean = 0;

            for (double num : numbers){
                mean += num;
            }
            System.out.printf("Girdiğiniz sayıların ortalaması : " + mean/ numbers.size());

        }
    }

