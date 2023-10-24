package examclouds.collections.ex1;

import examclouds.collections.HeavyBox;

import java.util.ArrayList;
import java.util.List;

import static examclouds.collections.Base.COLLECTION_SIZE;
import static examclouds.collections.Base.generateRandomBoxList;

public class Solution {
    public static void main(String[] args) {
        List<HeavyBox> heavyBoxList = generateRandomBoxList(COLLECTION_SIZE, ArrayList::new);
        heavyBoxList.get(0).setWeight(1);
        heavyBoxList.remove(heavyBoxList.size() - 1);

        //1 способ
        System.out.printf("Количество ящиков: %d\n", COLLECTION_SIZE);
        for (int i = 0; i < heavyBoxList.size(); i++) {
            System.out.printf("Ящик %d: %d\n", i + 1, heavyBoxList.get(i).getWeight());
        }

        //2 способ
        System.out.printf("Количество ящиков: %d\n", COLLECTION_SIZE);
        heavyBoxList.stream().forEach(box -> System.out.printf("Ящик %d: %d\n", heavyBoxList.indexOf(box) + 1, box.getWeight()));
    }
}
