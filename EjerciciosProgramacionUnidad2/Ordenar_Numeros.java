import java.util.Scanner;

public class Ordenar_Numeros {
    public static void main(String[] args) {
        /*
         * Escribe un programa en Java que pida al usuario 3 números y un orden de
         * ordenamiento, que puede ser ascendente o descendente, a continuación, según
         * el orden indicado se mostrarán en pantalla dichos números.
         */

        int numero1;
        int numero2;
        int numero3;
        int ordenElegido = 0;

        Scanner scn = new Scanner(System.in);

        System.out.println("Por favor introduce los tres números que quieres ordenar.");

        numero1 = scn.nextInt();

        numero2 = scn.nextInt();

        numero3 = scn.nextInt();

        /* Especie de menu en consola */

        System.out.println("------------------------------");
        System.out.println("¿En que orden deseas hacerlo?");
        System.out.println(" 1. Orden descendiente.");
        System.out.println(" 2. Orden ascendente.");
        System.out.println("------------------------------");

        ordenElegido = scn.nextInt();

        /*
         * A partir de este punto evaluare con una estructura de if anidados los números
         * introducidos en función de la elección del usuario:
         */

        if (ordenElegido == 1) { // Orden descendiente (de mayor a menor):

            if (numero1 >= numero2 && numero1 >= numero3) {

                System.out.println(numero1);

                if (numero2 >= numero3) {

                    System.out.println(numero2);
                    System.out.println(numero3);
                } else {

                    System.out.println(numero3);
                    System.out.println(numero2);
                }

            } else if (numero2 >= numero1 && numero2 >= numero3) {

                System.out.println(numero2);

                if (numero1 >= numero3) {

                    System.out.println(numero1);
                    System.out.println(numero3);

                } else {

                    System.out.println(numero3);
                    System.out.println(numero1);
                }
            } else {

                System.out.println(numero3);

                if (numero1 >= numero2) {
                    System.out.println(numero1);
                    System.out.println(numero2);

                } else {

                    System.out.println(numero2);
                    System.out.println(numero1);
                }

            }

        } else if (ordenElegido == 2) { // Orden ascendente (de menor a mayor):

            if (numero1 <= numero2 && numero1 <= numero3) {

                System.out.println(numero1);

                if (numero2 <= numero3) {

                    System.out.println(numero2);
                    System.out.println(numero3);

                } else {

                    System.out.println(numero3);
                    System.out.println(numero2);

                }
            } else if (numero2 <= numero1 && numero2 <= numero3) {

                System.out.println(numero2);

                if (numero1 <= numero3) {

                    System.out.println(numero1);
                    System.out.println(numero3);

                } else {

                    System.out.println(numero3);
                    System.out.println(numero1);
                }

            } else {

                System.out.println(numero3);

                if (numero1 <= numero2) {

                    System.out.println(numero1);
                    System.out.println(numero2);
                } else {

                    System.out.println(numero2);
                    System.out.println(numero1);
                }
            }

            // Si el usuario elige una opcion en el menu no valida, el programa mostrara el
            // siguiente mensaje:

        } else {

            System.out.println("Opción no válida");
        }

    }
}
