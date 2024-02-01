import java.util.UUID;

public class CurrentAccountClass implements IAccountClass {

    @Override
    public AccountClass createAccount(String userName, String userNumber, String creationDate, int balance) {
        String accountId = UUID.randomUUID().toString();
        return new AccountClass(accountId, userName, userNumber, creationDate, balance, "Current Account");
    }
}
