package examclouds.collections;

public class HeavyBox implements Comparable<HeavyBox> {
    private static final int DEFAULT_WEIGHT = 10;
    private int weight;

    public HeavyBox() {
        weight = DEFAULT_WEIGHT;
    }

    public HeavyBox(int weight) {
        this.weight =  weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(HeavyBox o) {
        if (this.weight < o.getWeight()) {
            return -1;
        } else if (this.weight > o.getWeight()) {
            return 1;
        } else {
            return 0;
        }
    }
}
