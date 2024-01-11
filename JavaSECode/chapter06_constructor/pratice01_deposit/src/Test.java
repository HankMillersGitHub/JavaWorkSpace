/**
 * ClassName : Test
 * Package : PACKAGE_NAME
 * Description :
 *
 * @author : Hank
 * @version : 1.0
 * @Create 2024/1/11 20:31
 */
public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane","Smith");
        Customer customer1 = new Customer("Hank","Miller");
        customer.setAccount(1000,2000,0.0123);
        customer.setAccount(10100,20000,0.0123);
        // 存100，取960，再取出2000
        // 打印信息
        customer.account.deposit(100);
        customer.account.withdraw(960);
        customer.account.withdraw(2000);
        customer.showInfo();
    }
}
