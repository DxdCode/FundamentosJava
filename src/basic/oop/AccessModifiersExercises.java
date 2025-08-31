package basic.oop;

public class AccessModifiersExercises {

    public static void main(String[] args) {
        // 1. Crea una clase Person con atributos privados name y age. Usa los métodos getName(), setName(), getAge() y setAge() para asignar y mostrar valores desde otra clase.

        class Person {
            private String name;
            private int age;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }
        }

        // 2. Crea una clase Product con el atributo privado price. Añade el método setPrice(double price) que solo permita precios mayores a 0.

        class Product {
            private double price;

            public void setPrice(double price) {
                if (price > 0) {
                    this.price = price;
                }
            }

            public double getPrice() {
                return price;
            }
        }

        // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente

        class BankAccount {
            private double balance;

            public void deposit(double amount) {
                if (amount > 0) {
                    balance += amount;
                }
            }

            public void withdraw(double amount) {
                if (amount > 0 && amount <= balance) {
                    balance -= amount;
                }
            }
        }

        // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el método getTitle() pero no modificarlo (sin setTitle()). El título debe asignarse solo por el constructor.
        class Book {
            private String title;

            public Book(String title) {
                this.title = title;
            }

            public String getTitle() {
                return title;
            }
        }

        // 5. Crea una clase Temperature con el atributo privado celsius. El método setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.

        class Temperature {
            private double celsius;

            public void setCelsius(double celsius) {
                if (celsius >= -100 && celsius <= 100) {
                    this.celsius = celsius;
                }
            }

            public double getCelsius() {
                return celsius;
            }
        }


        // 6. Crea una clase User con los atributos privados username y password. Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.

        class User {
            private String username;
            private String password;

            public void setUsername(String username) {
                this.username = username;
            }

            public void setPassword(String password) {
                this.password = password;
            }

            public boolean checkPassword(String inputPassword) {
                return password != null && password.equals(inputPassword);
            }
        }

        // 7. Crea una clase Employee con el atributo privado salary. Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.

        class Employee {
            private double salary;

            public void raiseSalary(double percent) {
                if (percent > 0) {
                    salary += salary * percent / 100;
                }
            }

            public double getSalary() {
                return salary;
            }

            public void setSalary(double salary) {
                this.salary = salary;
            }
        }

        // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega setters y el método calculateArea() que devuelva el resultado de width * height.

        class Rectangle {
            private double width;
            private double height;

            public void setWidth(double width) {
                this.width = width;
            }

            public void setHeight(double height) {
                this.height = height;
            }

            public double calculateArea() {
                return width * height;
            }
        }
        // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.

        class Student {
            private int grade;

            public void setGrade(int grade) {
                this.grade = grade;
            }

            public boolean isPassed() {
                if(grade >= 60){
                    return true;
                }
                return false;
            }

            public int getGrade() {
                return grade;
            }
        }
        Student student1 = new Student();
        student1.grade = 100;
        System.out.println(student1.isPassed());



        // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0).
        class Car {
            private int speed;

            public void accelerate(int amount) {
                if (amount > 0) {
                    speed = Math.min(speed + amount, 120);
                }
            }
            public void brake(int amount) {
                if (amount > 0) {
                    speed = Math.max(speed - amount, 0);
                }
            }
            public int getSpeed() {
                return speed;
            }
        }

        Car car = new Car();

        car.accelerate(50);
        System.out.println("Velocidad actual: " + car.getSpeed());

        car.accelerate(100);
        System.out.println("Velocidad actual: " + car.getSpeed());

        car.brake(30);
        System.out.println("Velocidad actual: " + car.getSpeed());

        car.brake(200);
        System.out.println("Velocidad actual: " + car.getSpeed());

    }

}
