package chatgpt_exs.oop.ex4;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }

}
