/**
 * ClassName : Customer
 * Package : PACKAGE_NAME
 * Description :
 *
 * @author : Hank
 * @version : 1.0
 * @Create 2024/1/11 20:28
 */
public class Customer {
    private String firstName;
    private String lastName;
    public Account account;

    public Customer(String f, String l) {
        firstName = f;
        lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String f) {
        firstName = f;
    }

    public void setLastName(String l) {
        lastName = l;
    }

    public void setAccount(int acc, double b, double ann) {
        account = new Account(acc, b, ann);
    }

    public Account getAccount() {
        return account;
    }

    public void showInfo() {
        System.out.println("Customer [" + firstName + "," + lastName + "],has a account : id is " + account.getId() + ",annualInterestRate is " + (account.getAnnualInterestRate()*100) + "%" + ",balance is " + account.getBalance());
    }
}
