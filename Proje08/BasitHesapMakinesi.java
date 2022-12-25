package Proje08;

import java.util.Scanner;

public class BasitHesapMakinesi {

    public static void main(String[] args) {

        //Java ile girilen 2 sayı ile kullanıcının seçtiği 4 işlemleri yapabilen bir hesap makinesi yapınız.

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number = ");
        double numberOne = input.nextDouble();

        System.out.print("Enter the second number = ");
        double numberTwo = input.nextDouble();

        System.out.println("Enter the number of the symbol you want to be processed = 1.(+)   2.(-)   3.(/)   4.(*)");
        int select = input.nextInt();

        if (select == 1){
            System.out.println("first number + second number = "+(numberOne+numberTwo));
        }else if (select == 2){
            System.out.println("first number - second number = " + (numberOne-numberTwo));
        }else if (select == 3){
            if (numberTwo == 0){
                System.out.println("The quotient cannot be zero. Please enter a valid number");
            }else {
                System.out.println("first number / second number = " + (numberOne/numberTwo));
            }
        }else if (select == 4){
            System.out.println("first number * second number = " + (numberOne*numberTwo));
        }else {
            System.out.println("Please enter a valid number");
        }


    }

}
