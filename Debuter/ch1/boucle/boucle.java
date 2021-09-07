package Debuter.ch1.boucle;

public class boucle {
    
    public static void main(String[] args) {
        int[] myArray = new int[]{7,2,4};

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        System.out.println("Forme amelioree : ");

        for(int number: myArray){
            System.out.println(number);
        }

        for ( int i=0; i <10; i++) {
            // déclarations exécutées à chaque itération
                if(i == 2 ||i == 5) {
                continue;
                }
            // déclarations non-exécutées quand i == 2 or 5
        }
    }
}
