package basic.conditional;

public class ConditionalExcercises {

    public static void main(String[] args) {
        // 5. Verifica si un número está en el rango de 1 a 100.

        int numero = 5;

        if( numero >= 1  && numero <= 100){
            System.out.println("Esta dentro del rango");
        }else{
            System.out.println("No esta dentro del rango");
        }


        // 9. Crea un programa que diga si una letra es vocal o consonante.
        char letra = 'b';
        char l = Character.toLowerCase(letra);

        String vocales = "aeiou";

        if (vocales.contains(String.valueOf(l))) {
            System.out.println(letra + " es una vocal");
        } else if (Character.isLetter(l)) {
            System.out.println(letra + " es una consonante");
        }


    }
}
