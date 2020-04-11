package de.massisoft.ocp.capter10;

import java.util.ArrayList;
import java.util.List;

public class Course {

    static List<Student> stList = new ArrayList<>();

    void enroll(Student st) {
        stList.add(st);
        System.out.println(st.studentId + " " + st.name);
    }

}
