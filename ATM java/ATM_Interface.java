import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class ATM_Interface {

    public static void main(String[] args) {
        int balance = 5000, withdraw, deposit;
        int atmnumber = 54321;
        int atmpin = 123;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Atm Number");
        int atmNumber = sc.nextInt();
        System.out.println("Enter pin:");
        int pin = sc.nextInt();
        if ((atmnumber == atmNumber) && (atmpin == pin)) {
            System.out.println("Validation Done");
        } else {
            System.out.println("Incorrect Atm Number or pin");
            System.exit(0);
        }

        while (true) {
            System.out.println("Welcome to ATM");
            System.out.println("Choose 1 for withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for check Balance");
            System.out.println("Choose 4 for Exit");
            System.out.println("Choose the option you want to perform");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter money to be withdraw:");
                    withdraw = sc.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    } else {
                        System.out.println("Insufficient balance");
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Enter money to be deposited:");
                    deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your Money has ben deposited");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Balance:" + balance);
                    System.out.println("");
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}