package Debuter.ch2.piledonnees;

import java.util.ArrayList;
import java.util.List;

public class Liste {
    
    public static void main(String[] args) {
        //    Type     name         Type de liste 
        List<Integer> myList = new ArrayList<Integer>();
        myList.add(54); // 54
        myList.add(8); // 54 8
        myList.add(0,7); // 7 54 8
        myList.set(0, 8); // 8 54 8
        myList.remove(1); // 8 8

    }
}
