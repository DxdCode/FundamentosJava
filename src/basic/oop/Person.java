package basic.oop;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello(){
        System.out.println("Hello, I´m " + this.name + ". I have " + this.age + " years old.");
    }

}
