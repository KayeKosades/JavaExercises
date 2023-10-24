package examclouds.collections.ex8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentList {
    private List<Student> students;

    public StudentList(ArrayList<Student> students) {
        this.students = new ArrayList<>(students);
    }

    public StudentList() {
        this.students = new ArrayList<>();
    }

    public StudentList(int size) {
        this.students = new ArrayList<>(size);
    }

    public void studentsToNextCourse() {
        for (Student s : students) {
            s.toNextCourse();
        }
    }

    public void deleteStudentsWithLowScore() {
        students = students.stream().filter(s -> s.averageScore()>=3).toList();
    }

    public void add(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i=0; i<students.size(); i++) {
            str.append(String.format("Student %d: %s\n", i+1, students.get(i).toString()));
        }
        return str.toString();
    }
}
