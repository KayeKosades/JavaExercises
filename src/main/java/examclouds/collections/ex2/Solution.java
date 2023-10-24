package examclouds.collections.ex2;

import examclouds.collections.HeavyBox;

import java.util.*;

import static examclouds.collections.Base.COLLECTION_SIZE;
import static examclouds.collections.Base.generateRandomBoxList;

public class Solution {
    public static void main(String[] args) {
        Set<HeavyBox> heavyBoxSet = generateRandomBoxList(COLLECTION_SIZE, TreeSet::new);

        System.out.printf("Количество ящиков: %d\n", COLLECTION_SIZE);
        Iterator<HeavyBox> it = heavyBoxSet.iterator();
        for (int i=0; it.hasNext(); i++) {
            System.out.printf("Ящик %d: %d\n", i+1, it.next().getWeight());
        }
    }
}
