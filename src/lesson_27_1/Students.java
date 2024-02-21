package lesson_27_1;

public class Students {
    private String name;
    private String personalCode;
    private Courses courses;

    public Students(String name, String personalCode, Courses courses) {
        this.name = name;
        this.personalCode = personalCode;
        this.courses = courses;
    }
    private String getPersonalCode() { return personalCode; }
    public void setPersonalCode(String personalCode) { this.personalCode = personalCode; }
    public  String getName(){ return name; }
    public Courses getCourses(){ return courses; }

    @Override
    public String toString() {
        return "Stundets{" +
                "personalCode='" + personalCode + '\'' +
                ", name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }
}
