package Debuter.ch2.piledonnees;
/* 
Un dictionnaire est une liste d'éléments organisés en fonction d'une clé.
Cette clé est un terme spécifique que vous recherchez pour trouver sa définition ou sa valeur. 
C'est ce qu'on appelle une association "Clé <> Valeur". */

import java.util.HashMap;
import java.util.Map;

public class Dictionnaire {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<String, Integer>();
        // Les âges de mes amis
        myMap.put("Jenny", 34);
        myMap.put("Livia", 28);
        myMap.put("Paul", 31);
        System.out.println(myMap.get("Jenny")); // -> 34
    }
}
