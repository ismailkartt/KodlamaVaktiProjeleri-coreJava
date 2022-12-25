package Proje08;

import java.util.Scanner;

public class BasitHesapMakinesiBonus {

    public static void main(String[] args) {

        //Java ile girilen 2 sayı ile kullanıcının seçtiği 4 işlemleri yapabilen bir hesap makinesi yapınız.
        //
        //Bonus Geliştirme
        //Yaptığınız hesap makinesini eğer Switch-Case ile yaptıysanız If blokları ile , eğer If blokları ile yaptıysanız Switch-Case ile tekrar yapınız.

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number = ");
        double numberOne = input.nextDouble();

        System.out.print("Enter the second number = ");
        double numberTwo = input.nextDouble();

        System.out.println("Enter the number of the symbol you want to be processed = 1.(+)   2.(-)   3.(/)   4.(*)");

        byte orderOfOperations = input.nextByte();

        switch (orderOfOperations){
            case 1:
                System.out.println("first number + second number = "+(numberOne+numberTwo));
                break;
            case 2:
                System.out.println("first number - second number = " + (numberOne-numberTwo));
                break;
            case 3:
                System.out.println("first number / second number = " + (numberOne/numberTwo));
                break;
            case 4:
                System.out.println("first number * second number = " + (numberOne*numberTwo));
                break;
        }

    }

}
