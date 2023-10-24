package examclouds.collections.ex8;

import java.util.Random;

import static examclouds.collections.Base.generateRandomStudentList;

public class Solution {
    public static void main(String[] args) {
        final int numOfStudent = 10;
        StudentList students = new StudentList(generateRandomStudentList(numOfStudent));
        System.out.println("Students before:\n");
        System.out.println(students.toString());

        students.deleteStudentsWithLowScore();
        students.studentsToNextCourse();

        System.out.println("Students after:\n");
        System.out.println(students.toString());
    }

}



