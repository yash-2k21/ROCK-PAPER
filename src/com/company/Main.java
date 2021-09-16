package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("WELCOME TO THE JAVA VIRTUAL GAME ");
        System.out.println("Let's start the game ");
        //System.out.println(" choose - 0 for Rock , 1 for PAPER and 2 for SCISSORS ");
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        System.out.println("it's your turn");
        System.out.println("Please choose - 0 for Rock , 1 for PAPER and 2 for SCISSORS");
        int user_input = sc.nextInt();
        switch(user_input)
        {
            case 0:
                System.out.println("You choose rock");
                break;
            case 1:
                System.out.println("You choose paper");
                break;
            case 2:
                System.out.println("You choose scissors");
        }
        System.out.println("it's computer turn");
        System.out.println("--------------------------------------------------------------------------------");

        int computer_input = ra.nextInt(3);
        switch(computer_input)
        {
            case 0:
                System.out.println("computer choose rock");
                break;
            case 1:
                System.out.println("Computer choose paper");
                break;
            case 2:
                System.out.println("computer choose scissors");
        }
        if (user_input == computer_input)
        {
            System.out.println("Match is draw , try again ");
        }
        else if((user_input==0 && computer_input==2) || (user_input==1&& computer_input==0) || (user_input==2 && computer_input==1))
        {
            System.out.println("congralations ! you win");
        }
        else
        {
            System.out.println("you Lose!, try again");
        }
    }
}

