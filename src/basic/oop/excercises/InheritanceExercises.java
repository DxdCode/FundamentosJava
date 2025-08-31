package basic.oop.excercises;

import java.util.ArrayList;

public class InheritanceExercises {
    public static void main(String[] args) {
        // 1. Crea una clase Vehicle con un método move(). Luego crea una subclase Car que herede de Vehicle y agrega el método honk().

        class Vehiculo{

            public void move(){
                System.out.println("Moving ...");
            }
        }
        class Car extends Vehiculo{
            public void honk(){
                System.out.println("Honking ...");
            }
        }
        Car car = new Car();
        car.move();
        car.honk();

        // 2. Define una clase Person con los atributos name y age. Luego crea una clase Student que agregue el atributo grade y un método study().
        class Person {
            String name;
            int age;

            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }
        }

        class Student extends Person {
            double grade;

            public Student(String name, int age, double grade) {
                super(name, age);
                this.grade = grade;
            }

            public void study() {
                System.out.println(name + " está estudiando. Nota: " + grade);
            }
        }
        Student student = new Student("Ana", 20, 90.5);
        student.study();

        // 3. Crea una clase Animal con el método makeSound(). Haz que Dog diga “Woof” y Cat diga “Meow” sobrescribiendo ese método.
        class Animal {
            public void makeSound() {
                System.out.println("Some animal sound");
            }
        }

        class Dog extends Animal {
            @Override
            public void makeSound() {
                System.out.println("Woof");
            }
        }

        class Cat extends Animal {
            @Override
            public void makeSound() {
                System.out.println("Meow");
            }
        }

        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.makeSound();
        cat.makeSound();

        // 4. La clase Employee tiene los atributos name y salary. Manager hereda de Employee y agrega el atributo department.
        class Employee {
            String name;
            double salary;

            public Employee(String name, double salary) {
                this.name = name;
                this.salary = salary;
            }
        }
        class Manager extends Employee {
            String department;

            public Manager(String name, double salary, String department) {
                super(name, salary);
                this.department = department;
            }

            public void showInfo() {
                System.out.println("Manager: " + name + ", Salary: " + salary + ", Department: " + department);
            }
        }

        Manager manager = new Manager("David", 5000, "IT");
        manager.showInfo();


        // 5. Crea una clase abstracta Shape con un método calculateArea(). Luego implementa ese método en Circle y Rectangle.


        // 6. Crea una clase Bird con el método fly(). Luego crea Eagle que sobrescriba fly() pero también llame al método original con super.fly().

        class Bird {
            public void fly() {
                System.out.println("Bird is flying");
            }
        }

        class Eagle extends Bird {
            @Override
            public void fly() {
                super.fly();
                System.out.println("Eagle is soaring high");
            }
        }

        Eagle eagle = new Eagle();
        eagle.fly();

        // 7. Haz una clase Device con un constructor que imprima “Device created”. Luego crea Phone que herede de Device y en su constructor imprima “Phone ready”.
        class Device {
            public Device() {
                System.out.println("Device created");
            }
        }

        class Phone extends Device {
            public Phone() {
                super();
                System.out.println("Phone ready");
            }
        }

        Phone phone = new Phone();
        // 8. Account tiene un saldo y métodos para deposit() y withdraw(). SavingsAccount hereda y agrega un método addInterest().
        class Account {
            double balance;

            public Account(double balance) {
                this.balance = balance;
            }

            public void deposit(double amount) {
                balance += amount;
            }

            public void withdraw(double amount) {
                balance -= amount;
            }

            public double getBalance() {
                return balance;
            }
        }

        class SavingsAccount extends Account {
            double interestRate = 0.05;

            public SavingsAccount(double balance) {
                super(balance);
            }

            public void addInterest() {
                balance += balance * interestRate;
            }
        }

        SavingsAccount savings = new SavingsAccount(1000);
        savings.deposit(500);
        savings.addInterest();
        System.out.println("Balance: " + savings.getBalance());

        // 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con un método describe() sobrescrito.
        class Car2 extends Vehiculo {
            public void describe() {
                System.out.println("Soy un carro");
            }
        }

        class Bike extends Vehiculo {
            public void describe() {
                System.out.println("Soy una bicicleta");
            }
        }

        class Truck extends Vehiculo {
            public void describe() {
                System.out.println("Soy un camión");
            }
        }

        Car2 car2 = new Car2();
        Bike bike = new Bike();
        Truck truck = new Truck();
        car2.describe();
        bike.describe();
        truck.describe();

        // 10. Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird. Recorre la lista y llama a makeSound().
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());

        for (Animal animal : animals) {
            animal.makeSound();
        }

    }
}
