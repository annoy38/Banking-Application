import java.util.ArrayList;
import java.util.Scanner;

public class UpdateAccountClass {
    private Scanner scanner;

    public UpdateAccountClass() {
        scanner = new Scanner(System.in);
    }
    public void updateUser(ArrayList<AccountClass> accounts){
        System.out.println("Enter your Account No. : ");
        String accountId = scanner.nextLine();
        System.out.println("Enter what you want to update: ");
        String s = scanner.nextLine();
        System.out.println("Enter update Value: ");
        String value = scanner.nextLine();
        updateAccount(accountId, s, value, accounts);
    }

    private void updateAccount(String accountId, String s, String value, ArrayList<AccountClass> accounts){
        for(AccountClass a: accounts){
            if(s.equals("name")&&a.getAccountId().equals(accountId)){
                a.setAccountUserName(value);
            }else if (s.equals("number")&&a.getAccountId().equals(accountId)) {
                a.setAccountUserNumber(value);
            }
        }
    }

}
