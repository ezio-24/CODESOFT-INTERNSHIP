package CodeSoft.ATMInterface;
import java.util.Scanner;



public class ATMUse {
    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Initial balance: ");
        double initialBalance=s.nextDouble();
        BankAccount account = new BankAccount(initialBalance);
        ATM atm = new ATM(account);


        int choice;

        do{
            System.out.println("\n1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = s.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = s.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
        s.close();
        }
    }

 