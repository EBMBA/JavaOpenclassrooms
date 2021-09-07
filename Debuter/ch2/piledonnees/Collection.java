package Debuter.ch2.piledonnees;

import java.util.HashSet;
import java.util.Set;

/* 
Un ensemble (ou « set ») est une collection d'éléments uniques non ordonnés. 
*/

public class Collection {
    public static void main(String[] args) {
        Set<String> ingredients = new HashSet<String>();
        ingredients.add("eggs");
        ingredients.add("sugar");
        ingredients.add("butter");
        ingredients.add("salt");

        System.out.println(ingredients.size());
    }
}
