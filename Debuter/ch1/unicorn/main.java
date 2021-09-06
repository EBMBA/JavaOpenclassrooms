package Debuter.ch1.unicorn;

/* 
En Java, vous devez utiliser un des mots clés pour désigner un niveau de contrôle :

    public : visible pour tous et par conséquent le moins restrictif ;

    protected (protégé) : visible pour le package et l'ensemble de ses sous-classes ;

    package-protected (protégé par paquet) : généralement visible uniquement par le package dans lequel il se trouve (paramètres par défaut) ;

    private (privé) : accessible uniquement dans le contexte dans lequel les variables sont définies (à l'intérieur de la classe dans laquelle il est situé).
*/

public class main {
    public static void main(String[] args) {
        Unicorn unicorn = new Unicorn();
     
        System.out.println(unicorn.power);
 /*
        unicorn.height = 180; // error => private properties
        unicorn.sleep(); // error => private method
        unicorn.run = true; // success => protected so package access is good
        unicorn.run(); // success ==> public method
*/
     }
}
