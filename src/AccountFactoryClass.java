public class AccountFactoryClass {
    public static AccountClass createAccount(String userName, String userNumber, String accountCreationDate, int balance, String accountType){
        if(accountType.equalsIgnoreCase("Current Account")){
            return new CurrentAccountClass().createAccount(userName, userNumber, accountCreationDate, balance);
        } else if (accountType.equalsIgnoreCase("Saving Account")) {
            return new SavingAccountClass().createAccount(userName, userNumber, accountCreationDate, balance);
        } else if (accountType.equalsIgnoreCase("Salary Account")) {
            return new SalaryAccountClass().createAccount(userName, userNumber, accountCreationDate, balance);
        }
        return null;
    }
}
