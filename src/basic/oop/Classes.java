package basic.oop;

public class Classes {
    public static void main(String[] args) {

        Person persona = new Person("Pedro",25);
        persona.sayHello();

        //Modificar
        persona.name = "Stalin";
        System.out.println("Persona: " + persona.name);

        Person persona2 = new Person("David",21);
        persona2.sayHello();
    }

}
