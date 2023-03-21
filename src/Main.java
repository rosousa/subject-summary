public class Main {
    public static void main(String[] args) throws Exception {
        User user = new User("John Doe", "johndoe@email.com", 70, "Coolest University");

        Exercise exercise = new Exercise("Thermodynamics",
                "The first law of thermodynamics and the conservation of energy,\nas discussed in Conservation of Energy, are clearly related.\nHow do they differ in the types of energy considered?");

        System.out.printf("name: %s\n", user.getName());
        System.out.printf("exercise name: %s\n", exercise.getName());
        System.out.printf("exercise summary: %s", exercise.getSummary());
    }
}