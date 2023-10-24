package examclouds.collections.ex3;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nВведите набор чисел: \n");
        String input = scanner.nextLine();
        List<Integer> inputList = Arrays.stream(input.split(", ")).map(Integer::parseInt).toList();
        Set<Integer> inputSet = new LinkedHashSet<>(inputList);
        String output = String.join(", ", inputSet.stream().map(i -> i.toString()).toList());

        System.out.printf("\nРезультат: %s", output);
        scanner.close();
    }
}
