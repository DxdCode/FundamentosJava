package basic.structures;

public class Arrays {
    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(numeros);

        String[] nombres = {"David", "Beracruz", "Camelo", "Daniel", "Hernandez", "Fousz", "German"};
        System.out.println(nombres);

        //Accesos
        System.out.println(nombres[0]);
        System.out.println(new String[3][0]);

        //Modificaciones
        nombres[0] = "Stalin";
        System.out.println(nombres[0]);
        System.out.println(nombres.length);


        boolean[] booleans = new boolean[5];
        System.out.println(booleans[4]);

    }
}
