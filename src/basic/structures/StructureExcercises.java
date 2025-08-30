package basic.structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.*;

public class StructureExcercises {
    public static void main(String[] args) {
        // 1. Crea un Array con 5 valores e imprime su longitud.
        String[] array = {"David", "Pedro", "Ana", "Julieta", "Marco"};
        System.out.println("1. Longitud del Array: " + array.length);

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        System.out.println("2. Valor antes: " + array[2]);
        array[2] = "Andrea";
        System.out.println("   Valor después: " + array[2]);

        // 3. Crea un ArrayList vacío.
        ArrayList<String> list = new ArrayList<>();
        System.out.println("3. ArrayList vacío creado");

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        list.add("Rojo");
        list.add("Azul");
        list.add("Verde");
        list.add("Amarillo");
        list.remove("Verde");
        System.out.println("4. ArrayList después de añadir y eliminar: " + list);

        // 5. Crea un HashSet con 2 valores diferentes.
        HashSet<String> set = new HashSet<>();
        set.add("Perro");
        set.add("Gato");
        System.out.println("5. HashSet inicial: " + set);

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        set.add("Perro");  // no lo añadirá porque ya existe
        set.add("Conejo");
        System.out.println("6. HashSet después de añadir: " + set);

        // 7. Elimina uno de los elementos del HashSet.
        set.remove("Gato");
        System.out.println("7. HashSet después de eliminar: " + set);

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        HashMap<String, String> map = new HashMap<>();
        map.put("David", "099123456");
        map.put("Pedro", "098765432");
        map.put("Ana", "097654321");
        System.out.println("8. HashMap inicial: " + map);

        // 9. Modifica uno de los contactos y elimina otro.
        map.put("David", "099999999");
        map.remove("Ana");
        System.out.println(" HashMap: " + map);

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
        String[] arr = {"A", "B", "C", "A"};
        ArrayList<String> arrList = new ArrayList<>(java.util.Arrays.asList(arr));
        HashSet<String> arrSet = new HashSet<>(arrList);
        HashMap<String, String> arrMap = new HashMap<>();
        for (String s : arrSet) {
            arrMap.put(s, s);
        }

    }
}
