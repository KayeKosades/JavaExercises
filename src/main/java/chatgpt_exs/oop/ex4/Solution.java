package chatgpt_exs.oop.ex4;

public class Solution {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2.5, 2);
        Circle circle = new Circle(1);

        System.out.println(String.format("Area of rectangle: %f", rectangle.area()));
        System.out.println(String.format("Area of circle: %f", circle.area()));
    }
}
