public class TestAccount2 {
    public static void main(String args[]) {
        Customer2 customer1 = new Customer2(1, "Test", 'm');
        Account2 account1 = new Account2(1, customer1, 88);
        System.out.println(account1);
        System.out.println("ID: " + account1.getId());
        System.out.println("Customer: " + account1.getCustomer());
        System.out.println("Balance: " + account1.getBalance());
        account1.deposit(40);
        System.out.println("Customer name: " + account1.getCustomerName());
        System.out.println(account1);
        account1.withdraw(40);
        System.out.println(account1);


    }
}
