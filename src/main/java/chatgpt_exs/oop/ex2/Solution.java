package chatgpt_exs.oop.ex2;

public class Solution {

    public static void main(String[] args) {
           Drawable circle = () -> System.out.println("Рисуем круг");
           Drawable rectangle = () -> System.out.println("Рисуем прямоугольник");

           circle.draw();
           rectangle.draw();
        }

}
