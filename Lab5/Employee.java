public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee() {
        this.id = 1;
        this.firstName = "";
        this.lastName = "";
        this.salary = 0;
    }

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        StringBuilder name = new StringBuilder();
        name
                .append(this.firstName)
                .append(" ").append(this.lastName);
        return name.toString();
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return this.salary * 12;
    }

    public int raiseSalary(int percent) {
        return this.salary * (100+percent) / 100;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Employee").append("[")
                .append("id= ").append(this.id)
                .append(" name= ").append(this.firstName)
                .append(" ").append(this.lastName)
                .append(" salary= ").append(this.salary)
                .append("]");
        return description.toString();
    }
}

