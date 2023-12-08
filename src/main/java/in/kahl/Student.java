package in.kahl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Student {
    private String firstName;
    private String lastName;
    private final int studentId;

    private List<Course> courseList = new ArrayList<>();

    public Student(String firstName, String lastName, int studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
    }

    public void addCourse(Course course) {
        courseList.add(course);
    }

    public int getStudentId() {
        return studentId;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentId=" + studentId +
                ", courseList=" + courseList +
                '}';
    }
}
