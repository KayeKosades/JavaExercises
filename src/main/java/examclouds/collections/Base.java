package examclouds.collections;

import examclouds.collections.ex8.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Base {
    public final static int COLLECTION_SIZE = 100;
    public static<T extends Collection> T generateRandomBoxList(int size, Supplier<T> collectionSupplier) {
        Random random = new Random();
        T collection = collectionSupplier.get();
        final int MAX_WEIGHT = 10000;
        for (int i=0; i<size; i++) {
            HeavyBox heavyBox = new HeavyBox(random.nextInt(MAX_WEIGHT));
            collection.add(heavyBox);
        }
        return collection;
    }

    public static ArrayList<Student> generateRandomStudentList(int size) {
        final int scoresNum = 10;
        ArrayList<Student> studentList = new ArrayList<>(size);
        for (int i=0; i<size; i++) {
            Random random = new Random();
            String name = String.format("Student %d", i+1);
            String group = "some group";
            int course = random.nextInt(5);
            ArrayList <Integer> scores = new ArrayList<>(scoresNum);
            for (int j=0; j<scoresNum; j++) {
                scores.add(random.nextInt(1,6));
            }
            Student s = new Student(name, group, course, scores);
            studentList.add(s);
        }
        return studentList;
    }
}
