public class NewAuthor {
    private String name;
    private String email;

    public NewAuthor() {
        this.name = "";
        this.email = "";
    }

    public NewAuthor(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
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

    @Override
    public String toString() {
        StringBuilder description = new StringBuilder();
        description.append("Author").append("[")
                .append("name= ").append(this.name).append(", ")
                .append(" email= ").append(this.email)
                .append("]");
        return description.toString();
    }
}
