import java.util.Scanner;

public class Numeros_Sucesivos {
    public static void main(String[] args) {

        /*
         * Escribe un programa en Java que pida un número por teclado hasta que éste sea
         * positivo. A continuación, muestra los primeros 20 números sucesivos a dicho
         * número.
         */

        /*
         * Declaro una variable en la que almacenare el numero introducido para usarlo
         * mas adelante.
         */

        int valorIntroducido;

        /*
         * Creo un objeto de la clase Scanner para leer el numero introducido por el
         * Usuario.
         */

        Scanner scn = new Scanner(System.in);

        /*
         * Declaro un bucle do while que solicitara al usuario un numero hasta que este
         * sea mayor a 0 (positivo).
         */

        do {

            // Solicito un valor al usuario a través de consola.

            System.out.println("Introduce un numero positivo por teclado");

            /*
             * Almaceno el valor introducido en la variable designada anteriormente para
             * este fin.
             */

            valorIntroducido = scn.nextInt();

            // Introduzco un if que evaluara si el numero es mayor a 0 (positivo):

            if (valorIntroducido > 0) {

                /*
                 * Inicio un bucle for que sumara el valor de i al numero
                 * introducido mientras i sea igual o inferior a 20 . Consiguiendo asi la
                 * sucesión de números.
                 */

                for (int i = 1; i <= 20; i++) {

                    System.out.println(valorIntroducido + i);

                }

            } else

                /*
                 * Si el usuario introduce un numero negativo, le dice que no es valido y a
                 * continuación vuelve a iniciar el bucle.
                 */

                System.out.println("El numero es negativo, por lo tanto no es valido.");

        } while (valorIntroducido < 0);

        // Cierro el objeto scn.

        scn.close();
    }

}
