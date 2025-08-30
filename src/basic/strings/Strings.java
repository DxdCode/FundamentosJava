package basic.strings;

public class Strings {

    public static  void main(String[] args){

        //Cadena de Texto

        String name = "Stalin";
        String surname = "David";

        System.out.println("Hello " + name);

        // Operaciones básicas

        // Concatenación
        System.out.println(name + " " + surname);

        // Operación Length que retorna la longitud del String
        System.out.println(name.length());

        // Obtener Caracteres
        System.out.println(name.charAt(3));

        //Obtener el ultimo caracter
        System.out.println(name.charAt(name.length()-1));

        //Subcadena
        System.out.println("Subcade:  " + name.substring(2));

        //Mayusculas y minusculas
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        // Comprobar si contiene
        System.out.println("Hola, David".toUpperCase().contains("H") + " === CONTAINS");

        //Verifcar o comparación de caractereses
        System.out.println(name.equalsIgnoreCase("stalin"));
        System.out.println(name.equals(surname));
        System.out.println("Contains " + name.contains("Stalin"));
        System.out.println("david".replace("a","A"));

        //Trim
        System.out.println("Hola que tal  ".trim());

        //Replace
        System.out.println("Hola, que tal ".replace(" ","  "));

        //Format
        var age = 21;
        System.out.println(String.format("Hola,%s David. Te ngo %d años.",name,age));





    }
}
