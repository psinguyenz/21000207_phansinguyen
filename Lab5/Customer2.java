public class Customer2 {
    private int id;
    private String name;
    private char gender;

    public Customer2() {
        this.id = 0;
        this.name = "";
        this.gender = ' ';
    }

    public Customer2(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("\"").append(this.name).append("(")
                .append(this.id).append(")").append("\"");
        return description.toString();
    }
}
