import java.util.ArrayList;

public class DisplayAllAccountClass {
    public void displayAllAccount(ArrayList<AccountClass> accounts){
        System.out.println("All information");
        for(AccountClass a: accounts){
            System.out.println("Account Id: "+a.getAccountId());
            System.out.println("User Name: "+a.getAccountUserName());
            System.out.println("User Number: "+a.getAccountUserNumber());
            System.out.println("Account Creation Date: "+a.getAccountCreationDate());
            System.out.println("Account Balance: "+a.getAccountBalance());
            System.out.println("Account Type: "+a.getAccountType());
        }
    }
}
