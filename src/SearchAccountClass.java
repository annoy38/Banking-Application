import java.util.ArrayList;
import java.util.Scanner;

public class SearchAccountClass {
    private Scanner scanner;

    public SearchAccountClass(){
        this.scanner = new Scanner(System.in);
    }
    public void searchAccount(ArrayList<AccountClass> accountClasses){
        System.out.println("Enter you Id: ");
        String accountId = scanner.nextLine();
        searchAccount(accountId, accountClasses);
    }

    private void searchAccount(String id, ArrayList<AccountClass> accounts){
        for(AccountClass a: accounts){
            if(a.getAccountId().equals(id)){
                System.out.println("Account Id: "+a.getAccountId());
                System.out.println("User Name: "+a.getAccountUserName());
                System.out.println("User Number: "+a.getAccountUserNumber());
                System.out.println("Account Creation Date: "+a.getAccountCreationDate());
                System.out.println("Account Balance: "+a.getAccountBalance());
                System.out.println("Account Type: "+a.getAccountType());
            }
        }
    }
}
