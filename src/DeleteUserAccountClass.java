import java.util.ArrayList;
import java.util.Scanner;

public class DeleteUserAccountClass {
    private Scanner scanner;

    public DeleteUserAccountClass(){
        scanner = new Scanner(System.in);
    }
    public void deleteUser(ArrayList<AccountClass> accountClasses){
        System.out.println("Enter your Account Id: ");
        String accountId = scanner.nextLine();
        deleteAccount(accountId, accountClasses);
    }

    private void deleteAccount(String accountId, ArrayList<AccountClass> accounts){
        accounts.removeIf(a->a.getAccountId().equals(accountId));
        System.out.println("Account delete Successfully");
    }
}
