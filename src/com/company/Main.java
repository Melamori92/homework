package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int number1 = sc.nextInt();
        System.out.println("Укажите систему счисления:");
        int number2 = sc.nextInt();
        System.out.println("Итого:");
        String s = sc.nextLine();
        Operation operation = new Operation();
        while(number1>=1){
            Select select = new Select();
            int rest = operation.rest(number1,number2);
            String str = select.selectNumberOrLetter(rest);
            s = s + str;
            number1 = operation.divide(number1,number2);
        }
        String reverse = new StringBuffer(s).reverse().toString();
        System.out.println(reverse);
    }
}

