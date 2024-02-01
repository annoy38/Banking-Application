import java.util.ArrayList;
import java.util.Scanner;

public class WithdrawClass {
    private Scanner scanner;

    public WithdrawClass(){
        this.scanner = new Scanner(System.in);
    }
    public void withDrawMoney(ArrayList<AccountClass> accountClasses){
        System.out.println("Enter your Id: ");
        String accountId = scanner.nextLine();
        System.out.println("Enter Amount you want to withdraw from your Account: ");
        int withdrawMoney = scanner.nextInt();
        scanner.nextLine();
        withdrawMoneyFromAccount(accountId, withdrawMoney, accountClasses);
    }
    private void withdrawMoneyFromAccount(String accountId, int withDrawMoney, ArrayList<AccountClass> accounts){
        for(AccountClass a: accounts){
            if(a.getAccountId().equals(accountId) && a.getAccountBalance()>1000){
                a.setAccountBalance(a.getAccountBalance()-withDrawMoney);
                System.out.println("Withdraw "+withDrawMoney+" Taka from your Account Successfully");
                break;
            }else {
                System.out.println("Withdraw not Possible");
                break;
            }
        }
    }
}
