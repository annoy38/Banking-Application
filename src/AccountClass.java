public class AccountClass {
    private String accountId;
    private String accountUserName;
    private String accountUserNumber;
    private String accountCreationDate;
    private int accountBalance;
    private String accountType;

    public AccountClass() {
    }

    public AccountClass(String accountId, String accountUserName, String accountUserNumber, String accountCreationDate, int accountBalance, String accountType) {
        this.accountId = accountId;
        this.accountUserName = accountUserName;
        this.accountUserNumber = accountUserNumber;
        this.accountCreationDate = accountCreationDate;
        this.accountBalance = accountBalance;
        this.accountType = accountType;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountUserName() {
        return accountUserName;
    }

    public void setAccountUserName(String accountUserName) {
        this.accountUserName = accountUserName;
    }

    public String getAccountUserNumber() {
        return accountUserNumber;
    }

    public void setAccountUserNumber(String accountUserNumber) {
        this.accountUserNumber = accountUserNumber;
    }

    public String getAccountCreationDate() {
        return accountCreationDate;
    }

    public void setAccountCreationDate(String accountCreationDate) {
        this.accountCreationDate = accountCreationDate;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

}
