package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        String input = sc.nextLine();
        int number = Integer.parseInt(input);
        switch (number)
        {
            case 1: number = 1;
                System.out.println("German = eins");
                break;
            case 2: number = 2;
                System.out.println("Spanish = dos");
                break;
            case 3: number = 3;
                System.out.println("Russian = Tree");
                break;
            case 4: number = 4;
                System.out.println("Irish Gaelic = Ceathair");
                break;
            case 5: number = 5;
                System.out.println("Polish = pięć");
                break;
            case 6: number = 6;
                System.out.println("Italian = sei");
                break;
            case 7: number = 7;
                System.out.println("Turkish = yedi");
                break;
            case 8: number = 8;
                System.out.println("Chinese =  pinyin");
                break;
            case 9: number = 9;
                System.out.println("Japanese = kokonotsu");
                break;
            case 10: number = 10;
                System.out.println("Swedish = tio");
                break;
                default:
                    System.out.println("No number was entered or number not between 1 and 10.");
        }
	// write your code here
    }
}
