public class Concentration {
    private String name;
    private String description;
    private List<Course> courses;
    private List<Course> coursesUsing;
    private List<Requireable> requirements;

    public Concentration(String name, String description, List<Course> courses, List<Requireable> requirements) {
        this.name  = name;
        this.description = description;
        this.courses = courses;
        this.requirements = requirements;
        this.coursesUsing = populateRequirements();
    }


    private List<Courses> populateRequirements() {
        return null;
    }


    public String toJson() {
        return null;
    }
}
