public interface Requireable {
    public boolean addCourse(Course toAdd);
    public boolean satisfies(Course toCheck);
    public boolean isFull();
    public List<Course> getUsedCourses();
}