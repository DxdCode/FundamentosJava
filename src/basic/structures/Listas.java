package basic.structures;

import java.util.ArrayList;
import java.util.Arrays;

public class Listas {
    public static void main(String[] args) {

        // Crear lista de nombres
        ArrayList<String> names = new ArrayList<>();

        // Crear lista de números
        var numbers = new ArrayList<Integer>();

        // Ver tamaño inicial
        System.out.println("Tamaño inicial: " + names.size());

        // Añadir elementos
        names.add("David");
        names.add("Pedro");
        names.add("Julieta");
        names.add("DxdCode");
        names.add("Stalin");
        names.add("Marco");

        // Acceder elementos
        System.out.println("Primer elemento: " + names.getFirst());
        System.out.println("Último elemento: " + names.getLast());
        System.out.println("Segundo elemento: " + names.get(1));

        // Insertar en índice específico
        names.add(1, "Cambio");
        System.out.println("Elemento en índice 1: " + names.get(1));

        // Mostrar lista completa
        System.out.println("Lista completa: " + names);

        // Modificar elemento
        names.set(1, "DxdCode Github");
        System.out.println("Después de modificar índice 1: " + names.get(1));
        System.out.println("Tamaño: " + names.size());

        // Eliminar elemento por índice
        names.remove(2);
        System.out.println("Lista después de eliminar índice 2: " + names);

        // Verificar si la lista está vacía
        System.out.println("Lista vacía? " + names.isEmpty());

        // Verificar si contiene un elemento
        System.out.println("Contiene 'David'? " + names.contains("David"));

        // Añadir duplicado para pruebas
        names.add("David");
        System.out.println("Índice de primer 'David': " + names.indexOf("David"));
        System.out.println("Índice de último 'David': " + names.lastIndexOf("David"));

        // Clonar lista
        ArrayList<String> copiaUsuarios = new ArrayList<>(names);

        // Convertir a arreglo
        Object[] array = names.toArray();
        System.out.println("Array: " + Arrays.toString(array));

        // Transformar todos los elementos a mayúsculas
        names.replaceAll(String::toUpperCase);
        System.out.println("Mayúsculas: " + names);

        // Eliminar elementos según condición
        names.removeIf(u -> u.equals("Stalin"));
        names.removeIf(u -> u.startsWith("C"));
        System.out.println("Después de removeIf: " + names);

        // Ordenar lista
        names.sort(String::compareTo);
        System.out.println("Lista ordenada: " + names);

        // Filtrar usando stream
        ArrayList<String> filtrados = new ArrayList<>(
                names.stream()
                        .filter(u -> u.length() > 6)
                        .toList()
        );
        System.out.println("Filtrados: " + filtrados);
        // Iterar con forEach
        names.forEach(System.out::println);

        // Mostrar lista final y tamaño
        System.out.println("Lista final: " + names);
        System.out.println("Tamaño final: " + names.size());

        // Vaciar lista
        names.clear();
        System.out.println("Lista después de limpiar: " + names);
    }
}
