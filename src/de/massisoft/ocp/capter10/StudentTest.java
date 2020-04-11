package de.massisoft.ocp.capter10;

public class StudentTest {

    public static void main(String[] args) {
        //Student st1 = new Student("A", "B");
        Student st1 = new Student();

        System.out.println(st1.getStudentId() + " - " + st1.getName());
        System.out.println("total: " + st1.total);
        method1(st1);
        System.out.println(st1.getStudentId() + " - " + st1.getName());
        System.out.println("total: " + st1.total);
    }

    static void method1(Student st) {
        st = new Student("C", "D");
        //st.total++;

        method2(st);
    }

    private static void method2(Student st) {

    }
}
