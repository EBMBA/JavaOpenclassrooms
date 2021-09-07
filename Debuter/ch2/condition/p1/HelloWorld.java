package Debuter.ch2.condition.p1;

/** Ce programme affiche
 * - un message Hello personnalisé si un argument a été envoyé lors de l'exécution du programme
 * - le message traditionnel "Hello World!" si ce n'est pas le cas
 *  @author EBMBA
*/

public class HelloWorld {
    
    /** Le programme commence ici
    * @param args arguments envoyé avec la ligne de commande 
    */

    public static void main(String[] args) {
        // System.out.println("Hello World");
        if (args.length == 1) {
            sayHelloTo(args[0]);
        }
        else if (args.length == 2) {
            sayHelloTo(args[0]);
            sayHelloTo(args[1]);
        }
        else{
            sayHelloTo("World");
        }
        
    }

    /** affiche le message Hello
    * @param recipient
    */

     private static void sayHelloTo(String recipient){
         System.out.println("Hello "+ recipient);
     }
}