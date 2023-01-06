public class Author {
    private String name;
    private String email;
    private char gender;

    public Author() {
        this.name = "";
        this.email = "";
        this.gender = 'u';
    }

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Author").append("[")
                .append("name= ").append(this.name).append(", ")
                .append(" email= ").append(this.email).append(", ")
                .append(" gender= ").append(this.gender)
                .append("]");
        return description.toString();
    }
}
