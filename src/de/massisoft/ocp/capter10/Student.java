package de.massisoft.ocp.capter10;

public class Student {

    static int total;
    protected String studentId;
    protected String name;

    Student() {
        this("default", "default");
    }

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        total++;
    }

    public static void main(String[] args) {
        Student st1 = new Student("1A1", "Max");

        new Course().enroll(st1);

        System.out.println(st1.getStudentId());
        System.out.println(st1.getName());
    }



    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
