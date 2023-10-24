package examclouds.collections.ex8;

import java.util.ArrayList;
import java.util.Collections;

public class Student {
    private String name;
    private String group;
    private int course;
    private ArrayList<Integer> scores;

    public Student(String name, String group, int course, ArrayList<Integer> scores) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.scores = scores;
    }

    public float averageScore() {
        float sum = scores.stream()
                .reduce(0, (a, b) -> a + b);
        return sum / scores.size();
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public ArrayList<Integer> getScores() {
        return scores;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setScores(ArrayList<Integer> scores) {
        this.scores = scores;
    }

    public void toNextCourse() {
        if (this.averageScore() >= 3) {
            course += 1;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", scores=" + scores +
                ", avg=" + this.averageScore() +
                '}';
    }
}
