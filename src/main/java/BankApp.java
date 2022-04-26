import javax.security.auth.login.AccountException;
import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello in our bank!");
        System.out.println("How many users you want to add?");
        int amountNewUsers = scanner.nextInt();
        Account tableOfNewCustomer [] = new Account[amountNewUsers];
        for (int i=0; i < tableOfNewCustomer.length; i++){
            tableOfNewCustomer[i] = new Account();
            tableOfNewCustomer[i].createAccount();
            tableOfNewCustomer[i].showAccount();
        }


        int choice;
        do {

            System.out.println("1. Display all accounts");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdrawal money");
            System.out.println("4. Exit appBank");
            System.out.println("Enter your choice");


            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    account.showAccount();
                    break;

                case 2:
                    System.out.println("Enter account number to deposit: ");
                    int accountNumber = scanner.nextInt();
                    boolean found = false;
                    for (int i=0; i < tableOfNewCustomer.length; i++);{
                        found = tableOfNewCustomer[String].search(accountNumber);
                }
                    account.depositMoney();
                    break;

                case 3:
                    account.withdrawal();
                    break;

                case 4:
                    System.out.println("Bye, bye");
                    break;

            }
        }
            while (choice != 4);


    }

    private static void search(String accountNumber) {
        if (accountNumber.equals(accountNumber) {
            return true;
        }else {
            return false}


        }
    }

}
