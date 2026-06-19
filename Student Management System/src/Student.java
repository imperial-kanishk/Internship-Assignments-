public class Student {
    private String name;
    private int age;
    private int studentID;
    private String course;
    private int semester;

    public Student(String name, int age, int studentID, String course, int semester) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
        this.course = course;
        this.semester = semester;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
    @Override
    public String toString() {
        return "Name: " + name +
                ", Age: " + age +
                ", Student ID: " + studentID +
                ", Course: " + course +
                ", Semester: " + semester;
    }
}
