package examclouds.base_operations.ex3;

import java.util.Random;

public class Garland {
    private static int diods = new Random().nextInt();

    public static void blink() {
        diods = ~diods;
    }

    public static void run() {
        int lastBit = diods & 1;
        diods = diods >>> 1;
        diods |= (lastBit << 31);
    }

    public static boolean isFirstLampOn() {
        return (diods & 1) == 1;
    }

    public static void print() {
        String binaryString = Integer.toBinaryString(diods);
        System.out.println(String.format("%32s", binaryString).replace(' ', '0'));
    }
}
