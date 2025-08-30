package basic.oop.excercises;

import basic.oop.Person;

import java.util.ArrayList;

public class ClassesExcercises {
    public static void main(String[] args) {
        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
        class Book{
            String title;
            String author;

            public Book(String title, String author){
                this.title = title;
                this.author = author;
            }
            public void showInfo(){
                System.out.println("Titulo del libro es: " + title + ", escrito por el author: " + author);
            }
        }

        Book book = new Book("Mate","David");
        book.showInfo();

        // 2. Crea una clase Dog con un método bark() que imprima su sonido.

        class Dog{
            public void bark(){
                System.out.println("Barking...");
            }
        }
        Dog dog = new Dog();
        dog.bark();

        // 3. Añade un constructor a la clase Book que reciba title y author.[RESUELTO]

        // 4. Crea una clase Car con atributos brand y model y un método showData().
        class Car{
            String brand;
            String model;

            public Car(String brand, String model){
                this.brand = brand;
                this.model = model;
            }

            public void showData(){
                System.out.println("Marca del carro: " + brand + ", Modelo: " + model);
            }
        }
        Car car = new Car("12","auto");
        car.showData();
        // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).

        class Student{
            int score;
            public Student(int score){
                this.score = score;
            }
            public void Aprobo(){
                if(this.score >= 60){
                    System.out.println("Aprobo");
                }else{
                    System.out.println("Nao aprobado");
                }
            }
        }
        Student student = new Student(10);
        student.Aprobo();


        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.

        class BankAccount{
            double balance;

            public BankAccount(double balance){
                this.balance = balance;
            }
            public void deposit(double salary) {
                balance += salary;
                System.out.println("Depósito realizado. Nuevo saldo: $" + balance);
            }
        }
        BankAccount bankAccount = new BankAccount(10);
        bankAccount.deposit(10);


        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
        class Rectangle{
            double width;
            double height;

            public Rectangle(double width, double height) {
                this.width = width;
                this.height = height;
            }

            public double calculateArea() {
                return width * height;
            }

            public double calculatePerimeter() {
                return 2 * (width + height);
            }

            public void showInfo() {
                System.out.println("Área del rectángulo: " + calculateArea());
                System.out.println("Perímetro del rectángulo: " + calculatePerimeter());
            }
        }
        // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.

        class Worker{
            String name;
            double salary;

            public Worker(String name,double salary){
                this.name = name;
                this.salary = salary;
            }

            public void showSalary(){
                System.out.println("Your salary is: " + this.salary);

            }

        }

        // 9. Crea varios objetos Person y guárdalos en un ArrayList.
        Person person = new Person("David",21);
        Person person1 = new Person("Stalin",25);
        Person person2 = new Person("DxCode",19);

        ArrayList<Person> people = new ArrayList<>();
        people.add(person);
        people.add(person1);
        people.add(person2);

        System.out.println(people);

        // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
        class Product{
            double price;

            public Product(double price){
                this.price = price;
            }

            public void applyDiscount(double discountPercentage) {
                if (discountPercentage < 0 || discountPercentage > 100) {
                    System.out.println("Descuento inválido.");
                    return;
                }
                double discountAmount = price * (discountPercentage / 100);
                price -= discountAmount;
                System.out.println("Descuento aplicado: " + discountPercentage + "%" + ", total: $" + price);
            }


        }
        Product products = new Product(300);
        products.applyDiscount(10);

    }
}
