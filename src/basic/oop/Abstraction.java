package basic.oop;

public class Abstraction {

    public static void main(String[] args) {

        // CLASE ABSTRACTA
        Dog dog = new Dog();
        dog.sleep();
        dog.eat();
        Cat cat = new Cat();
        cat.sleep();
        cat.eat();

        // INTERFACE

    }

    public static abstract class Animal{

        abstract void eat();

        public void sleep(){
            System.out.println("Animal sleep");
        }
    }

    public static class Dog extends Animal{
        @Override
        void eat() {
            System.out.println("Dog eat");
        }

        @Override
        public void sleep() {
            System.out.println("Dog sleep");
        }
    }

    public static class Cat extends Animal{
        @Override
        void eat() {
            System.out.println("Cat eat");
        }
    }

    public interface Flying{
        void fly();

    }

    public interface FlyingTwo{
        void fliying();

    }

    public static class Bird extends Animal implements Flying,FlyingTwo{
        @Override
        void eat() {
            System.out.println("Bird eat");
        }

        @Override
        public void fly() {
            System.out.println("Bird fly");
        }

        @Override
        public void fliying() {

        }
    }

    public static class Loro extends Animal implements Flying,FlyingTwo{
        @Override
        void eat() {
            System.out.println("Loro eat");
        }

        @Override
        public void fly() {
            System.out.println("Loro fly");
        }

        @Override
        public void fliying() {

        }
    }

}
