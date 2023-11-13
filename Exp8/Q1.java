package Exp8;

import java.util.Scanner;

public class Q1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = input.nextLine();
        System.out.println("Enter account number: ");
        int accno = input.nextInt();
        System.out.println("Enter balance: ");
        float bal = input.nextFloat();
        input.nextLine();
        System.out.println("Enter address: ");
        String add = input.nextLine();
        System.out.println("Enter rate of interest: ");
        float roi = input.nextFloat();
        SavingsAccount myAcc = new SavingsAccount(name, accno, bal, add, roi);
        System.out.println("Enter 1 for withdrawal, 2 for deposit, 3 for display, 4 for calculate amount");
        int choice = input.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter amount to withdraw");
                int amount = input.nextInt();
                myAcc.withdrawal(amount);
                break;
            case 2:
                System.out.println("Enter amount to deposit");
                amount = input.nextInt();
                myAcc.deposit(amount);
                break;
            case 3:
                myAcc.display();
                break;
            case 4:
                System.out.println("Enter time");
                int time = input.nextInt();
                System.out.println("Amount after " + time + " years: " + myAcc.calculateAmount(time));
                break;
            default:
                System.out.println("Invalid choice");
        }
        input.close();
    }
}

abstract class Accounts {
    float balance; 
    int accountNumber;
    String holderName, address;

    abstract void withdrawal(int amount);
    abstract void deposit(int amount);
    void display(){
        System.out.println("Account balance: " + balance);
    }
}

class SavingsAccount extends Accounts {
    float rateOfInterest;

    SavingsAccount(String name, int accno, float bal, String add, float roi) {
        super.holderName = name;
        super.balance = bal;
        super.accountNumber = accno;
        super.address = add;
        this.rateOfInterest = roi;
    }


    float calculateAmount(int time) {
        return super.balance * (1 + this.rateOfInterest * time);
    }

    void withdrawal(int amount) {
        if (amount > super.balance) {
            System.out.println("Insufficient balance");
            return;
        } 
        else {
            super.balance -= amount;
            System.out.println("Withdrawal successful");
            return;
        }
    }

    void deposit(int amount) {
        super.balance += amount;
        System.out.println("Deposit successful");
        return;
    }
}