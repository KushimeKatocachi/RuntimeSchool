package Inheratence;

public class Test extends Animal {
    public static void main(String[] args) {

        Animal[] animal = new Animal[3];
        animal[0] = new Dog();
        animal[1] = new Cat();
        animal[2] = new Bird();

        for (Animal i : animal) {
            i.makeSound();
        }
    }


    }
