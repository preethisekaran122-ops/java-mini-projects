package project;

import java.util.Scanner;

public class ATMSystem {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		double balance = 5000.0; // Initial balance
		
		while(true) {
			System.out.println("\n------------ATM Banking System------------");
			System.out.println("1.Check Balance");
			System.out.println("2.Deposit Money");
			System.out.println("3.Withdraw Money");
			System.out.println("4.Exit");
			System.out.println("Enter choice: ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Current Balance: Rs." + balance);
				break;
			case 2:
				System.out.println("Enter amount to deposit: Rs. ");
				double deposit = sc.nextDouble();
				if (deposit > 0) {
					balance += deposit;
					System.out.println("Rs." + deposit + "Deposited Successfully");
				}
				else {
					System.out.println("Invalid Amount!");
				}
				break;
			case 3:
				System.out.println("Enter amount to withdraw: Rs. ");
				double withdraw = sc.nextDouble();
				if (withdraw <= balance && withdraw > 0) {
					balance -= withdraw;
					System.out.println("Rs." + withdraw + "Withdrawn Successfully");
				}
				else {
					System.out.println("Insufficient Balance or Invalid Amount!");
				}
				break;
			case 4:
				System.out.println("Thank You for Using ATM!");
				System.exit(0);
				default:
					System.out.println("Invalid Choice!");
				}
			}
		}
	}


