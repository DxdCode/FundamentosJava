package basic.loops;

import java.util.HashMap;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // FOR
        for (int i = 0; i < 10; i++) {
            System.out.println("7 x " +  i + " = " + (7*i));
        }

        // FOR EACH
        String[] correos = {"david@gmail.com", "pedro@", "ana@hotmail.com", "maria@correo"};
        for (String correo: correos) {
            if(correo.contains("@") && correo.contains(".com")) {
                System.out.println("Correo valido: " + correo);
            }else{
                System.out.println("Correo invalido: " + correo);
            }
        }

        // WHILE
        Scanner sc = new Scanner(System.in);
        String password = "123";
        int accesos = 0;
        boolean accesoValido = false;
        while (accesos < 3 && !accesoValido) {
            System.out.println("Introduzca la contra: ");
            String contra = sc.nextLine();
            if (contra.equals(password)) {
                System.out.println("Acceso correcto");
                accesoValido = true;
            }else{
                System.out.println("Acceso incorrecto");
                accesos++;
            }
        }
        if (!accesoValido) {
            System.out.println("Cuenta bloqueada");
        }

        // Do while

        int secreto = 7;
        int intento;


        do {
            System.out.print("Adivina el número entre el 1 a 10: ");
            intento = sc.nextInt();
            if(intento < secreto) {
                System.out.println("Muy bajo");
            } else if (intento > secreto) {
                System.out.println("Muy alto");
            }
        } while (intento != secreto);

        System.out.println("Numero correcto");

        // BREAK
        int numero = 29;
        boolean esPrimo = true;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }
        System.out.println(esPrimo);

        // FOR EACH
        String frase = "david no le gusta java y java es muy complicado codea mucho";
        HashMap<String, Integer> contador = new HashMap<>();
        for(String palabra: frase.split(" ")) {
            contador.put(palabra, contador.getOrDefault(palabra, 0) + 1);
        }
        System.out.println(contador);
    }
}
