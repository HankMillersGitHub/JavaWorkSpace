/**
 * ClassName : Account
 * Package : PACKAGE_NAME
 * Description :
 *
 * @author : Hank
 * @version : 1.0
 * @Create 2024/1/11 20:16
 */
public class Account {
    private int id;     // 账号
    private double balance; // 余额
    private double annualInterestRate; // 年利率

    public Account(int i, double b, double a) {
        id = i;
        balance = b;
        annualInterestRate = a;

    }

    // getter setter function begin
    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int i) {
        id = i;
    }

    public void setBalance(double b) {
        balance = b;
    }

    public void setAnnualInterestRate(double a) {
        annualInterestRate = a;
    }

    // getter setter function end
    // 取钱
    public void withdraw(double amount) {
        if(amount <= balance && amount > 0){
            balance -= amount;
            System.out.println("withdraw success, you have withdraw：" + amount + "$");
        }else{
            System.out.println("Sorry, the balance of the user you dialed is not enough.");;
        }
    }

    // 存钱
    public void deposit(double amount) {
        if(amount > 0){
            balance += amount;
            System.out.println("Deposit successful,deposit : " + amount + "$");;
        }
    }
}
