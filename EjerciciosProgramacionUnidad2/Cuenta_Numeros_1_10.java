public class Cuenta_Numeros_1_10 {

    public static void main(String[] args) {

        /*
         * Escribe un programa en Java que muestre los números del 10 al 1, en ese
         * orden. Debes utilizar una estructura de tipo while ó do-while.
         */

        /*
         * Declaro una variable entera que inicio en 10, con el fin de usarla dentro del
         * bucle.
         */

        int contador = 10;

        // Bucle while que se ejecutara mientras el valor de "contador" sea igual o
        // mayor a 1.

        while (contador >= 1) {

            // Imprimo el valor de la variable iniciada en 10:

            System.out.println(contador);

            // A cada vuelta del bucle le voy restando 1 al valor de la variable, para
            // mostrar la centa regresiva:

            contador--;

        }

    }

}
