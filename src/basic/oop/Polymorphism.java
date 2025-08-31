package basic.oop;

public class Polymorphism {


    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eat();

        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.suma(1,2.1));
    }

    // Polimorfismo por herencia que es sobresritura

    public static class Animal{
        public void eat(){
            System.out.println("Animal is eating");
        }
    }

    public static class Dog extends Animal{
        @Override
        public void eat() {
            System.out.println("Dog is eating");
        }
    }

    // Polimorfismo por sobrecarga que es sobrecargar métodos

    public static class Calculadora{
        public int suma(int a, int b){
            return a+b;
        }
        public double suma(double a, double b){
            return a+b;
        }
    }

}
