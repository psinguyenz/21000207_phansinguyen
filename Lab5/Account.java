public class Account {
    private String id;
    private String name;
    private int balance;

    public Account() {
        this.id = "";
        this.name = "";
        this.balance = 0;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int credit(int amount) {
        return this.balance += amount;
    }

    public int debit(int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        }
        else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }

    public int transferTo (Account another, int amount) {
        if (amount <= this.balance) {
            int anotherBalance = another.getBalance();
            anotherBalance += amount;
            another.setBalance(anotherBalance);
            this.balance -= amount;
        }
        else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Account").append("[")
                .append("id= ").append(this.id)
                .append(" name= ").append(this.name)
                .append(" balance= ").append(this.balance)
                .append("]");
        return description.toString();
    }
}
