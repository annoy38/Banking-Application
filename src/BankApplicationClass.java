import java.util.ArrayList;
import java.util.Scanner;

public class BankApplicationClass {
    private ArrayList<AccountClass> accounts;
    private Scanner scanner;
    private CreateNewAccountClass newAccountClass;
    private DisplayAllAccountClass displayAllAccount;
    private UpdateAccountClass updateAccountClass;
    private DeleteUserAccountClass deleteUserAccountClass;
    private DepositClass depositClass;
    private WithdrawClass withdrawClass;
    private SearchAccountClass searchAccountClass;
    public BankApplicationClass(){
        this.accounts = new ArrayList<>();
        this.scanner = new Scanner(System.in);
        this.newAccountClass = new CreateNewAccountClass();
        this.displayAllAccount = new DisplayAllAccountClass();
        this.updateAccountClass = new UpdateAccountClass();
        this.deleteUserAccountClass = new DeleteUserAccountClass();
        this.depositClass = new DepositClass();
        this.withdrawClass = new WithdrawClass();
        this.searchAccountClass = new SearchAccountClass();
    }

    public void runApplication() {
        int selectOperation;
        do {
            System.out.println("1. Create Account");
            System.out.println("2. Display all Accounts");
            System.out.println("3. Update an Account");
            System.out.println("4. Delete an Account");
            System.out.println("5. Deposit an Amount into your Account");
            System.out.println("6. Withdraw an Amount from your Account");
            System.out.println("7. Search for Account");
            System.out.println("8. Exit");
            selectOperation = scanner.nextInt();
            scanner.nextLine();
            switch (selectOperation) {
                case 1:
                    newAccountClass.newUser(accounts);
                    break;
                case 2:
                    displayAllAccount.displayAllAccount(accounts);
                    break;
                case 3:
                    updateAccountClass.updateUser(accounts);
                    break;
                case 4:
                    deleteUserAccountClass.deleteUser(accounts);
                    break;
                case 5:
                    depositClass.depositMoney(accounts);
                    break;
                case 6:
                    withdrawClass.withDrawMoney(accounts);
                    break;
                case 7:
                    searchAccountClass.searchAccount(accounts);
                    break;
            }
        } while (selectOperation != 8);
    }
}
