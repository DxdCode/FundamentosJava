package basic.strings;

import java.text.Format;

public class StringExcercises {
    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.
        String valor1 = "abcd";
        String valor2 = "efgh";
        System.out.println(valor1 + valor2);

        // 2. Muestra la longitud de una cadena de texto.
        System.out.println(valor1.length());

        // 3. Muestra el primer y último carácter de un string.
        System.out.println(valor1.charAt(0));
        System.out.println(valor1.charAt(valor1.length()-1));

        // 4. Convierte a mayúsculas y minúsculas un string.
        String nombre = "DxdCode";
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.toLowerCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        String cadena = "Esto es una cadena de texto";
        System.out.println(cadena.contains("texto"));

        // 6. Formatea un string con un entero.
        int edad = 21;
        System.out.println(String.format("Tengo %d años.", edad));


        // 7. Elimina los espacios en blanco al principio y final de un string.
        String valor = " Dado ";
        System.out.println(valor.trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println(valor.replace(" ","-"));

        // 9. Comprueba si dos strings son iguales.
        String s1 = "Hola";
        String s2 = "hola";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        // 10. Comprueba si dos strings tienen la misma longitud.
        String a = "Java";
        String b = "Code";
        System.out.println(a.length() == b.length());
    }
}
