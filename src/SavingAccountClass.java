import java.util.UUID;

public class SavingAccountClass implements IAccountClass {

    @Override
    public AccountClass createAccount(String userName, String userNumber, String creationDate, int balance) {
        String accountId = UUID.randomUUID().toString();
        return new AccountClass(accountId, userName, userNumber, creationDate, balance, "Saving Account");
    }
}
