import java.util.Scanner;

public class triangulo {
    /* El ejercicio nos pide introducir un número n, y que dibuje un triángulo rectángulo
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Ingresa un número: ");
        n = scanner.nextInt();
        /* Con el primer for lo que establecemos es la altura del triángulo.
         */
        for (int filas = 0; filas < n; filas++)
        {
            /* Aquí establecemos que se introduce un asterisco por columna, hasta que
            en la última línea iguala con las filas.
             */
            for (int columna = 0; columna <= filas; columna++)
            {
                System.out.print("*\t");
            }
            System.out.print("\n");

        }
        // hacer figura con asteriscos
        System.out.println("Vamos a realizar una figura con asteriscos");
        System.out.println("___________________________________________");
        System.out.print("Introduce el número de filas: ");

        int numFilas = scanner.nextInt();
        int numBlancos = (numFilas * 2) - 2;
        scanner.close();

        System.out.println();

        for(int i=1; i<=numFilas ; i++)
        {

            // Asteriscos
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            // espacios en blanco
            for(int j=1;j<=numBlancos; j++){
                System.out.print(" ");
            }

            // Asteriscos
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            numBlancos -= 2;
            System.out.println();
        }


    }
}