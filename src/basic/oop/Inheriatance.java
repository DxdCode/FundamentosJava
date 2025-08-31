package basic.oop;

public class Inheriatance {
    public static void main(String[] args) {

        Animal animal = new Animal("Perrito");
        animal.eat();

        Dog dog = new Dog("Perroo",10);
        dog.eat();

        Cat cat = new Cat("Gatito");
        cat.eat();

    }
    public static class Animal{

        String name;

        public Animal(String name){
            this.name = name;
        }


        public void eat(){
            System.out.println("The animal " + this.name + " is eating");
        }
    }

    public static class Dog extends Animal{
        int age;
        public Dog(String name, int age) {
            super(name);
            this.age = age;
        }

        @Override
        public void eat() {
            System.out.println("The dog "+ this.name + " is eating");
        }
    }
    public static class Cat extends Animal{
        public Cat(String name) {
            super(name);
        }
    }

    public static class bird extends Animal{

        public bird(String name) {
            super(name);
        }

        public void fly(){
            System.out.println("The animal " + this.name + " is flying");
        }
    }
}
