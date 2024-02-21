package lesson_27_1;

public class Teachers {
    private String name;
    private String personalId;
    private Courses courses;

    public Teachers(String name, String personalId, Courses courses) {
        this.name = name;
        this.personalId = personalId;
        this.courses = courses;
    }
        private String getPersonalId() { return personalId; }
        public void setPersonalId(String personalId) { this.personalId = personalId; }
        public  String getName(){ return name; }
        public Courses getCourses(){ return courses; }
}
@Override
public String toString() {
    return "Teachers{" +
            "personalCode='" + personalId + '\'' +
            ", name='" + name + '\'' +
            ", courses=" + courses +
            '}';
}
}

