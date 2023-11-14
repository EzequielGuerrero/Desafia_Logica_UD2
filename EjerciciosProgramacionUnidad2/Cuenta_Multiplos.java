public class Cuenta_Multiplos {
    public static void main(String[] args) {

        /*
         * Escribe un programa en Java que muestre y cuente los números que son
         * múltiplos de 2 o de 3 que hay entre 1 y 100. Utiliza las estructuras de
         * control que creas convenientes.
         */

        /*
         * Declaro contadores con el fin de contar el numero de veces que se pasa por
         * las siguientes estructuras de control
         */

        int contadorMultiplo2 = 0;
        int contadorMultiplo3 = 0;
        int contadorAmbos = 0;
        /*
         * Declaro un bucle For que sumara e incrementara el valor de i hasta que valga
         * 100:
         */

        for (int i = 0; i <= 100; i++) {

            /*
             * Dentro del bucle y por cada vuelta que de voy a evaluar si los números son o
             * no múltiplos de 2 o de 3 o ambos. Y a continuación mostrare la información en
             * consola.
             */
            if (i % 2 == 0 && i % 3 == 0) {

                System.out.println(i + " <-- Múltiplo de 2 y de 3");

                contadorAmbos++;

            }

            else if (i % 2 == 0) {

                System.out.println(i + " <-- Múltiplo de 2");

                /*
                 * Cada vez que el programa entra en este bucle suma el valor del contador en 1.
                 */
                contadorMultiplo2++;

            } else if (i % 3 == 0) {

                System.out.println(i + " <-- Múltiplo de 3");

                /*
                 * Cada vez que el programa entra en este bucle suma el valor del contador en 1.
                 */

                contadorMultiplo3++;

            }

        }

        /*
         * Muestro la información de los contadores, a la que le resto 1 para que de el
         * numero exacto.
         */

        System.out.println(
                "En total hay: " + (contadorMultiplo2 + contadorAmbos - 1) + " números que son múltiplo de 2.");

        System.out.println(
                "En total hay: " + (contadorMultiplo3 + contadorAmbos - 1) + " números que son múltiplo de 3.");

        System.out.println("Y de todos estos : " + (contadorAmbos - 1) + " son números de ambos.");

    }
}
