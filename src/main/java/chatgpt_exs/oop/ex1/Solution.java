package chatgpt_exs.oop.ex1;


public class Solution {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        System.out.println("Кошечка говорит");
        cat.makeSound();

        System.out.println("Собакен говорит");
        dog.makeSound();
    }
}
