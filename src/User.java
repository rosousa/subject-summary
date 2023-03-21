public class User {
    private String name;
    private String email;
    private int age;
    private String university;
    public User(String name, String email, int age, String university) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.university = university;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return this.age;
    }

    public String getUniversity() {
        return this.university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
