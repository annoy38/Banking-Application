import java.util.ArrayList;
import java.util.Scanner;

public class DepositClass {
    private Scanner scanner;

    public DepositClass(){
        scanner = new Scanner(System.in);
    }
    public void depositMoney(ArrayList<AccountClass> accountClasses){
        System.out.println("Enter your Id: ");
        String accountId = scanner.nextLine();
        System.out.println("Enter Amount which you want to deposit into your Account: ");
        int depositAmount = scanner.nextInt();
        scanner.nextLine();
        depositMoney(accountId, depositAmount, accountClasses);
    }

    private void depositMoney(String accountId, int depositAmount, ArrayList<AccountClass> accounts){
        for(AccountClass a:accounts){
            if(a.getAccountId().equals(accountId)){
                a.setAccountBalance(a.getAccountBalance()+depositAmount);
                System.out.println("Deposit "+depositAmount+" Taka into your Account Successfully");
                break;
            }
        }
    }
}
