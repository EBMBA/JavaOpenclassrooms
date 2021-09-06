package Debuter.ch1.hello;

/** Ceci est une implementation du message traditionnel Hello World
 *  @author EBMBA
*/

public class HelloWorld {
    
    /** Le programme commence ici */
    public static void main(String[] args) {
        // System.out.println("Hello World");
        sayHelloTo("VOUS");
    }

    /** affiche le message Hello
     * 
     * @param recipient
     */

     private static void sayHelloTo(String recipient){
         System.out.println("Hello "+ recipient);
     }
}