public class Account2 {
    private int id;
    private Customer2 customer;
    private double balance;

    public Account2() {
        this.id = 0;
        this.customer = new Customer2();
        this.balance = 0.0;
    }

    public Account2(int id, Customer2 customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    public Account2(int id, Customer2 customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Customer2 getCustomer() {
        return customer;
    }

    public void setCustomer(Customer2 customer) {
        this.customer = customer;
    }

    public String getCustomerName() {
        return this.customer.getName();
    }

    public double deposit (double amount) {
        return this.balance += amount;
    }

    public double withdraw(double amount) {
        if(this.balance >= amount) {
            this.balance -= amount;
        }
        else {
            System.out.println("amount withdrawn exceeds the current balance!");
        }
        return balance;
    }

    @Override
    public String toString() {
        double fineBalance = Math.round(this.balance*100)/100;
        StringBuilder description = new StringBuilder();
        description.append(this.customer).append(" balance=$")
                .append(fineBalance);
        return description.toString();
    }
}
