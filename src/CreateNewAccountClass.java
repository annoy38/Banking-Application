import java.util.ArrayList;
import java.util.Scanner;

public class CreateNewAccountClass {
    private Scanner scanner;
    public CreateNewAccountClass() {
        scanner = new Scanner(System.in);
    }
    public void newUser(ArrayList<AccountClass> accounts) {
        int selectAccountType;
        System.out.println("Select Account Type");
        System.out.println("1. Current Account");
        System.out.println("2. Saving Account");
        System.out.println("3. Salary Account");
        selectAccountType = scanner.nextInt();
        switch (selectAccountType) {
            case 1:
                createAccount("Current Account", accounts);
                break;
            case 2:
                createAccount("Saving Account", accounts);
                break;
            case 3:
                createAccount("Salary Account", accounts);
                break;
        }
    }
    private void createAccount(String aType, ArrayList<AccountClass> accounts){
        System.out.println("Enter Your Name: ");
        scanner.nextLine();
        String userName = scanner.nextLine();
        System.out.println("Enter your Phone Number: ");
        String userNumber = scanner.nextLine();
        System.out.println("Enter Amount for Account open deposit: ");
        int balance = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter today Date dd-MM-yy format: ");
        String accountCreationDate = scanner.nextLine();
        AccountClass accountClass = AccountFactoryClass.createAccount(userName, userNumber, accountCreationDate, balance, aType);
        accounts.add(accountClass);
        System.out.println("Your "+aType+" Create Successfully");
    }

}
