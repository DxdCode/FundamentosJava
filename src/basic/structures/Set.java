package basic.structures;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("David");
        names.add("Ana");
        names.add("Pedro");
        names.add("David");

        System.out.println("Usuarios: " + names);
        System.out.println("Cantidad: " + names.size());

        // Verificar existencia
        System.out.println("Contiene 'Ana'? " + names.contains("Ana"));

        // Eliminar elemento
        names.remove("Pedro");
        System.out.println("Después de eliminar Pedro: " + names);

        // Iterar elementos
        names.forEach(System.out::println);

        // Limpiar set
        names.clear();
        System.out.println("Después de clear(): " + names);
    }
}
