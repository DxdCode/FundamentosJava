package basic.structures;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {

        // Declaración y creación
        HashMap<String, String> names = new HashMap<>();
        var numbers = new HashMap<Integer, String>();

        // Tamaño

        System.out.println(names.size());

        // Inserción

        names.put("David", "david@gmail.com");
        names.put("Stalin", "stalin@gmail.com");
        names.put("DxCode", "dxcode@gmail.com");
        System.out.println(names.size());
        System.out.println(names);

        // Acceso

        System.out.println(names.get("David"));
        System.out.println(names.get("Sta"));

        // Verificación

        System.out.println(names.containsKey("David"));
        System.out.println(names.containsKey("Dev"));

        System.out.println(names.containsValue("david@gmail.com"));

        // Eliminación

        System.out.println(names.remove("David"));
        System.out.println(names.remove("DavidDev"));
        System.out.println(names);

        // Limpieza

        names.clear();
        System.out.println(names);

        // Modificación

        names.put("David", "david@gmail.com");
        System.out.println(names);

        names.put("David", "davidstalin@gmail.com");
        System.out.println(names);

        names.replace("David", "david@gmail.com");
        System.out.println(names);

        names.putIfAbsent("David", "david@gmail.com");
        System.out.println(names);

        // Otras operaciones

        System.out.println(names.isEmpty());
        var values = names.values();
        System.out.println(values);
    }
}
