package in.kahl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School {

    private String name;
    private Map<Integer, Student> studentList = new HashMap<>();

    public School(String name) {
        this.name = name;
    }

    public Student findStudent(int studentId) {
        return studentList.get(studentId);
        //return studentList.stream().filter(student -> student.getStudentId() == studentId).findFirst().get();
    }

    public void removeStudent(int studentId) {
        studentList.remove(studentId);
    }

    public List<Course> retrieveCourses(int studentId) {
        return findStudent(studentId).getCourseList();
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", studentList=" + studentList +
                '}';
    }

    public void addStudent(Student student) {
        studentList.put(student.getStudentId(), student);
    }
}
