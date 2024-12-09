package examclouds.base_operations.ex3;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Начальное состояние гирлянды:");
        Garland.print();

        System.out.println("Мигнули 1 раз:");
        Garland.blink();
        Garland.print();

        for(int i=0; i<5; i++) {
            Garland.run();
        }

        System.out.println("Сдвинули вправо 5 раз:");
        Garland.print();

        if(Garland.isFirstLampOn()) {
            System.out.println("Первая лампа включена");
        }
        else {
            System.out.println("Первая лампа выключена");
        }
    }
}
