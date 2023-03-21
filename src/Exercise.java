public class Exercise {
    private String name;
    private String summary;

    public Exercise(String name, String summary) {
        this.name = name;
        this.summary = summary;
    }

    public String getName() {
        return this.name;
    }

    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
